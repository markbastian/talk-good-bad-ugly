(ns state.vars)

(def ^:dynamic *a* 0)
(def ^:dynamic *b* 1)

(prn (str "original a, b = " *a* "," *b*))

(binding [*a* 1 *b* 0]
  (prn (str "rebound a, b = " *a* "," *b*))
  (binding [*a* 11 *b* 45]
    (prn (str "rebound a, b = " *a* "," *b*)))
  (prn (str "popped a, b = " *a* "," *b*)))

(prn (str "popped a, b = " *a* "," *b*))