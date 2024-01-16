(ns Player
  (:gen-class))

(defn -main [& args]
  (let [light [(read) (read)] thor (atom [(read) (read)])]
    (while true
      (let [remainingTurns (read)]
        (def difference (map - light @thor))
        (def x-diff (first difference))
        (def y-diff (second difference))

        (def x-move
          (cond
            (> x-diff 0) "E"
            (< x-diff 0) "W"
            :else ""))

        (def y-move
          (cond
            (> y-diff 0) "S"
            (< y-diff 0) "N"
            :else ""))

        (reset! thor (list
                      (cond
                        (= x-move "E") (inc (first @thor))
                        (= x-move "W") (dec (first @thor))
                        :else (first @thor))
                      (cond
                        (= y-move "S") (inc (second @thor))
                        (= y-move "N") (dec (second @thor))
                        :else (second @thor))))

        (println (str y-move x-move))))))
