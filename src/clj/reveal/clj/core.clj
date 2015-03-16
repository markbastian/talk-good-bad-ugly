(ns reveal.clj.core
  (:require [hiccup.core :refer :all]
            [reveal.clj.template :as template]))

(defn create-presentation [m] (html (template/basic m)))

(defn write-presentation [m] (spit (str "presentation/" (:out m "index.html")) (html (template/basic m))))
