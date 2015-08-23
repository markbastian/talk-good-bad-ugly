(ns state.representation
  (:require [reveal.clj.core :as reveal]))

(def comparison
  [:section
   [:h2 "Comparison of Paradigms"]
   [:table
    [:thead [:tr [:th "Aspect"][:th "OOP"][:th "FP"]]]
    [:tbody
     [:tr {:class "fragment highlight-green"} [:td "State"][:td "Object Fields"][:td "Values/Data"]]
     [:tr [:td "Transition"][:td "Object Methods"][:td "Functions"]]
     [:tr [:td "Management"][:td "Object References"][:td "Concurrency Primitives"]]
     [:tr [:td "I/O"][:td "Object Methods"][:td "Loose Coupling"]]
     [:tr [:td "Concerns"][:td "Complected"][:td "Separated"]]]]])

(def oop
  [:section
   [:h2 "The Object Oriented Approach"]
   [:ul
    [:li "The domain is represented by objects"]
    [:li "Top-down decomposition"
     [:ul
      [:li "Is-a"]
      [:li "Has-a"]]]
    [:li "Object hierarchies are interdependent an non-separable"]]])

(def fp-clojure
  [:section
   [:h2 "The Clojure Approach"]
   [:ul
    [:li "The domain is represented by data"]
    [:li "This is relatively unique to Clojure"]
    [:li "Other FPs (e.g Scala) are still class driven"]]])

(def data-representation
  [:section
   [:h2 "Representing Data in Clojure"]
   [:ul
    [:li "Primitives:"
     [:ul
      [:li "Primitives:"]
      [:li "Data structures:"]]]
    [:li "Data structures:"
     [:ul
      [:li "Primitives:"]
      [:li "Data structures:"]]]]])

(def slides
  [[:section
    [:h1 "State Representation"]
    [:h2 "How do I represent my domain?"]]
   comparison
   oop
   fp-clojure
   data-representation])

(reveal/write-presentation
  {:out "state.html"
   :slides slides
   :author "Mark Bastian"
   :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
   :title "Clojure: State"})