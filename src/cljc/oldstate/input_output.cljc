(ns oldstate.input-output
  (:require [reveal.clj.core :as reveal]))

(def comparison
  [:section
   [:h2 "Comparison of Paradigms"]
   [:table
    [:thead [:tr [:th "Aspect"][:th "OOP"][:th "FP"]]]
    [:tbody
     [:tr [:td "State"][:td "Object Fields"][:td "Values/Data"]]
     [:tr [:td "Transition"][:td "Object Methods"][:td "Functions"]]
     [:tr [:td "Management"][:td "Object References"][:td "Concurrency Primitives"]]
     [:tr {:class "fragment highlight-green"} [:td "I/O"][:td "Object Methods"][:td "Loose Coupling"]]
     [:tr { :class :fragment } [:td "Concerns"][:td "Complected"][:td "Separated"]]]]])

(def oop
  [:section
   [:h2 "The Object Oriented Approach"]
   [:ul
    [:li "Objects contain methods for event notification"]
    [:li "Full object state is exposed at all levels"]]])

(def fp-clojure
  [:section
   [:h2 "The Clojure Approach"]
   [:ul
    [:li "Input is an interaction with refs"]
    [:li "Output (e.g. rendering) is a function of a single value"]
    [:li "It is decoupled from current processing"]]])

(def slides
  [[:section
    [:h1 "Input/Output"]
    [:h2 "How do I interact with my domain?"]]
   comparison
   oop
   fp-clojure])

;Key concept is that all interactions are through refs

(reveal/write-presentation
  {:out "state.html"
   :slides slides
   :author "Mark Bastian"
   :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
   :title "Clojure: State"})