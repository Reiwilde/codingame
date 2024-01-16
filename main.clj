(ns Player
  (:gen-class))

(defn -main [& args]
  (while true
    (let [heights (repeatedly 8 read)]
      (println (first (apply max-key second (map-indexed list heights)))))))
