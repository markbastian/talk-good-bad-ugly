(ns reveal.clj.util.create-template
  (:require [hiccup.core :refer :all]
            [hiccup.util :refer :all]
            [hiccup-bridge.core :as hicv]
            [clojure.pprint :as pprint]))

(defn create-template [s]
  (vec (hicv/html->hiccup (slurp s))))

(pprint/pprint (create-template "resources/reduced.html"))
