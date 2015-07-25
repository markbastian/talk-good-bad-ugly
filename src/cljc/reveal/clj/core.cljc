(ns reveal.clj.core
  (:require [hiccup.core :as hc]
            [reveal.clj.template :as template]))

(defn create-presentation [m] (hc/html (template/basic m)))

(defn write-presentation [m]
  (spit (str "presentation/" (:out m "index.html"))
        (hc/html (template/basic m))))
