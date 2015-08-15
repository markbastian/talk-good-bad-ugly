(ns reveal.clj.core
  (:require [reveal.clj.template :as template]))

(defn create-presentation [m] (template/basic m))

(defn write-presentation [m]
  (spit (str "presentation/" (:out m "index.html"))
        (template/basic m)))
