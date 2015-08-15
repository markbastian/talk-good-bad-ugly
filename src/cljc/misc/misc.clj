(ns misc.misc)

(defmacro bizzaro-math
  "Do everything the opposite of normal"
  [[op & rest]]
  (conj rest (case op
               + -
               - +
               * /
               / *
               op)))

;(+ 2 3)
;(prn (bizzaro-math (+ 2 3)))
;(bizzaro-math - 2 3)
;(bizzaro-math * 2 3)
;(bizzaro-math / 2 3)
;
(prn (+ 2 3))
(prn (bizzaro-math (+ 2 3)))
(prn (bizzaro-math (- 2 3)))
(prn (bizzaro-math (* 2 3)))
(prn (bizzaro-math (/ 2 3)))
(prn (bizzaro-math (rem 2 3)))