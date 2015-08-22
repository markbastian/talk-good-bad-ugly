(ns state.transition
  (:require [reveal.clj.core :as reveal]))

(def comparison
  [:section
   [:h2 "Comparison of Paradigms"]
   [:table
    [:thead [:tr [:th "Aspect"][:th "OOP"][:th "FP"]]]
    [:tbody
     [:tr [:td "State"][:td "Object Fields"][:td "Values/Data"]]
     [:tr {:class "fragment highlight-green"} [:td "Transition"][:td "Object Methods"][:td "Functions"]]
     [:tr [:td "Management"][:td "Object References"][:td "Concurrency Primitives"]]
     [:tr [:td "I/O"][:td "Object Methods"][:td "Loose Coupling"]]
     [:tr { :class :fragment } [:td "Concerns"][:td "Complected"][:td "Separated"]]]]])

(def oop
  [:section
   [:h2 "The Object Oriented Approach"]
   [:ul
    [:li "Objects methods"
     [:ul
      [:li "Setters"]
      [:li "Any method that modifies state"]]]
    [:li "Mutators are tied to their objects"]]])

(def fp-clojure
  [:section
   [:h2 "The Clojure Approach"]
   [:ul
    [:li "Value Transition"]
    [:li "Functions"]
    [:li "You can do this in most languages"
     [:ul
      [:li "However, class methods are coupled to classes"]]]]])

(def slides
  [[:section
    [:h1 "State Transition"]
    [:h2 "How do I modify my domain?"]]
   comparison
   oop
   fp-clojure])

(reveal/write-presentation
  {:out "state.html"
   :slides slides
   :author "Mark Bastian"
   :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
   :title "Clojure: State"})