(ns reveal.clj.util.create-template
  (:require [hiccup-bridge.core :as hicv]
            [clojure.pprint :as pprint]))

(defn create-template [s]
  (vec (hicv/html->hiccup (slurp s))))

pprint/pprint (create-template "resources/reduced.html"))

;(pprint/pprint (create-template "http://markbastian.github.io/fp-firehose/fp-firehose.html#/2/2"))
