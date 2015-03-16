(ns no-syntax.examples.collection-addition)

;Example Start
(def names #{ "Curly" "Larry" "Moe"})
(def ages [20 21 22])
(def names->ages (zipmap names ages))
;Example End