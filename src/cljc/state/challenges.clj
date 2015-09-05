(ns state.challenges
  (:require [reveal.clj.core :as reveal]
            [state.cycles :as cycles]
            [state.deep-mods :as deep-mods]
            [state.immutability :as immutability]
            [state.concurrency :as concurrency]))

(def the-barriers
  [:section
   [:h2 "The Challenges"]
   [:ul
    [:li "Immubility"]
    [:li "Deep Modification"]
    [:li "Cyclical Relationships"]
    [:li "Application State"]]])

(def slides
  (reduce into [[:section
    [:h1 "Challenges"]
    [:h2 "Common barriers to functional thinking"]]
   the-barriers]
          [immutability/slides
           deep-mods/slides
           cycles/slides
           concurrency/slides]))

;Key concept is that all interactions are through refs

(reveal/write-presentation
  {:out "state.html"
   :slides slides
   :author "Mark Bastian"
   :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
   :title "Clojure: State"})