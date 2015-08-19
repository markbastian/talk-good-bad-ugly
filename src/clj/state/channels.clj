(ns state.channels
  (:require [clojure.core.async :as async]
            [clojure.xml :as xml]
            [clojure.pprint :as pp]))

(def c (async/chan 10))

(async/>!! c "hello")

(prn (async/<!! c))

(async/go (async/>! c "Say hello without blocking!"))

(prn (async/<!! (async/go (async/<! c))))

(async/close! c)

(let [c1 (async/chan)
      c2 (async/chan)]
  (async/go (let [[v ch] (async/alts! [c1 c2])]
              (pp/pprint (get-in v [:content ]))))
  (async/go (async/>! c1 (xml/parse "http://api.geonames.org/findNearestIntersection?lat=37.451&lng=-122.18&username=demo")))
  (async/go (async/>! c2 (xml/parse "http://ned.usgs.gov/epqs/pqs.php?x=-106&y=36&units=Meters&output=xml"))))
