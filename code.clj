(ns Player
  (:gen-class))

(defn -main [& args]
  (let [surfaceN (read)]
    (loop [i surfaceN]
      (when (> i 0)
        (let [landX (read) landY (read)]
        (recur (dec i)))))
    (while true
      (let [X (read) Y (read) hSpeed (read) vSpeed (read) fuel (read) rotate (read) power (read)]
        (println (if (<= vSpeed -40) "0 4" "0 0"))))))
