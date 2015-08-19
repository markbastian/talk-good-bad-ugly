(ns state.agents)

(def a (agent 0))
(def b (agent 1))

(defn slow [f] (Thread/sleep 300) f)
(defn slower [f] (Thread/sleep 400) f)

(future
  (do
    (send a (comp slow inc))
    (send b (comp slower dec))))

(future
  (loop [i 10]
    (when (pos? i)
      (do
        (prn (str "a, b = " @a "," @b))
        (Thread/sleep 100)
        (recur (dec i))))))