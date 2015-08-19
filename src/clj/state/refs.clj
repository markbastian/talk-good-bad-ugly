(ns state.refs)

(def a (ref 0))
(def b (ref 1))

(defn slow [f] (Thread/sleep 300) f)
(defn slower [f] (Thread/sleep 400) f)

(future
  (dosync
    (alter a (comp slow inc))
    (alter b (comp slower dec))))

(future
  (loop [i 10]
    (when (pos? i)
      (do
        (prn (str "a, b = " @a "," @b))
        (Thread/sleep 100)
        (recur (dec i))))))
