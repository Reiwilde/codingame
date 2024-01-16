(ns Player
  (:gen-class))

(defn -main [& args]
  (while true

    (def mountains-height
      (loop [i 8 r []]
        (if (> i 0)
          (recur (dec i) (conj r (read)))
          r)))

    (println
     (loop [i 1 r 0]
       (if (< i (count mountains-height))
         (recur (inc i)
                (if (> (get mountains-height i) (get mountains-height r)) i r))
         r)))))
