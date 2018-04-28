(ns Solution
  (:gen-class))

(defn -main [& args]
  (let [n (read)]
    (println
     (case n
       0 0       
       (loop [i n r 5526]
         (if (> i 0)
           (let [t (read)]
             (def abs-t (max t (- t)))
             (def abs-r (max r (- r)))
             
             (recur (dec i)
                    (cond
                      (= abs-t abs-r) (max t r)
                      (> abs-t abs-r) r
                      :else t)))
           r))))))
