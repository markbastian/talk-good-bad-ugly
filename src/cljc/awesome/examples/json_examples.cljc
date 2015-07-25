(ns awesome.examples.json-examples
  (:require [clojure.data.json :as json]))

(prn (json/write-str {:a [1 2 3 4] :b 2}))

(def m (json/read-str "{\":a\":1,\"b\":2}"))
(prn m)