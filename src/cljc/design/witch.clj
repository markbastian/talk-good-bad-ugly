(ns design.witch
  (:require [reveal.clj.core :as reveal]
            [clojure.pprint :as pp]))

(def monty-python
  [:section
   [:h2 "Monty Python"]
   [:ul
    [:li "Pick a scene from Monty Python and the Holy Grail"]
    [:li "How would you model this in Java?"]
    [:li "How would you model this in Clojure?"]]])

(def witch-trial
  [:section
   [:h2 "The Witch Trial"]
   [:ul
    [:li "A woman is accused of being a witch"]
    [:li "Bedemir is the judge"]
    [:li "A man was a newt"]
    [:li "Arthur makes Bedemir a Knight"]
    [:li "How would you model this?"]]])

(def java-version
  [:section
   [:h2 "The Witch Trial: Java/OOP"]
   [:ul
    [:li "Everyone is a Person"]
    [:li "Witch, Villager, Knight, and King extend Person"]
    [:li "What is Bedemir?"]
    [:li "How does Bedemir become a Knight?"]
    [:li "How does the villager become a newt (and get better)?"]]])

(def scene-initial-state { "Bedevir" { :roles #{ :judge } }
                          "Arthur" { :roles #{ :king }}
                          "Peasant" { :roles #{ :critic } } })

(pp/pprint scene-initial-state)

(defn curse [m who]
  (update-in m [who :roles] conj :newt))

(pp/pprint (update-in scene-initial-state ["Peasant" :roles] disj :critic))
(pp/pprint (curse scene-initial-state "Peasant"))

(def clojure-scene
  [:section
   [:h2 "The Witch Trial: Clojure"]
   [:ul
    [:li "Everything is just data"]]])

(def slides
  [[:section [:h1 "How"]]
   monty-python
   witch-trial
   java-version
   clojure-scene])

(reveal/write-presentation
  {:out "state.html"
   :slides slides
   :author "Mark Bastian"
   :description "FP in Practice"
   :title "FP in Practice"})