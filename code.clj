(ns Player
  (:gen-class))

(defn -main [& args]
  (let [light [(read) (read)]]
    (loop [thor [(read) (read)]]
      (let [remainingTurns (read)]
        (def difference (map - light thor))
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

        (println (str y-move x-move))
        
        (recur
         (vector
          (case x-move
            "E" (inc (first thor))
            "W" (dec (first thor))
            (first thor))
          (case y-move
            "S" (inc (second thor))
            "N" (dec (second thor))
            (second thor))))))))
