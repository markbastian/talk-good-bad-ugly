(ns state.challenges
  (:require [reveal.clj.core :as reveal]))

(def immutability
  [:section
   [:h2 "Immutability"]
   [:ul
    [:li "If nothing changes, how do you do anything?"]]])

(def deep-mods
  [:section
   [:h2 "Deep Modification"]
   [:ul
    [:li "How do I modify that field way down there?"]]])

(def cycles
  [:section
   [:h2 "Immutable Cyclical References"]
   [:div
    [:div {:style  "float:left;width:48%;" }
     [:ul
      [:li "Parent-Child"]
      [:li "Ownership"]
      [:li "You can't easily update both entities"]
      [:li "In mutable OOP this is a trivial issue"]
      [:li "...but it adds complexity"]]]
    [:div {:style  "float:right;width:48%;" }
     [:img {:src "images/bidi-mutable.png" } ]]]])

(def cycles-solution
  [:section
   [:h2 "Immutable Cyclical References"]
   [:div
    [:div {:style  "float:left;width:48%;" }
     [:ul
      [:li "Create an entity map"]
      [:li "Use unique IDs for each entity"]
      [:li "Now updates are decoupled"]]]
    [:div {:style  "float:right;width:48%;" }
     [:img {:src "images/bidi-mutable.png" } ]]]])

(def original-van-halen
  { "Van Halen" { :members #{ "Eddie Van Halen"
                             "David Lee Roth"
                             "Alex Van Halen"
                             "Michael Anthony" }}
   "Eddie Van Halen" {:bands #{"Van Halen"} }
   "David Lee Roth" {:bands #{"Van Halen"} }
   "Alex Van Halen" {:bands #{"Van Halen"} }
   "Michael Anthony" {:bands #{"Van Halen"} }})

(def post-1985 (-> original-van-halen
                   (update-in ["Van Halen" :members] disj "David Lee Roth")
                   (update-in ["Van Halen" :members] conj "Sammy Hagar")
                   (update-in ["David Lee Roth" :bands] disj "Van Halen")
                   (update-in ["Sammy Hagar" :bands] conj "Van Halen")))

(defn join-band [state {:keys[musician band]}]
  (-> state
      (update-in [band :members] conj musician)
      (update-in [musician :bands] conj band)))

(defn leave-band [state {:keys[musician band]}]
  (-> state
      (update-in [band :members] disj musician)
      (update-in [musician :bands] disj band)))

;(clojure.pprint/pprint post-1985)

(clojure.pprint/pprint
  (-> original-van-halen
      (leave-band {:musician "David Lee Roth" :band "Van Halen"})
      (join-band {:musician "Sammy Hagar" :band "Van Halen"})))

(def slides
  [[:section
    [:h1 "Challenges"]
    [:h2 "Common barriers to functional thinking"]]
   immutability
   deep-mods
   cycles
   cycles-solution])

;Key concept is that all interactions are through refs

(reveal/write-presentation
  {:out "state.html"
   :slides slides
   :author "Mark Bastian"
   :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
   :title "Clojure: State"})