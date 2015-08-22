(ns state.management
  (:require [reveal.clj.core :as reveal]))

(def comparison
  [:section
   [:h2 "Comparison of Paradigms"]
   [:table
    [:thead [:tr [:th "Aspect"][:th "OOP"][:th "FP"]]]
    [:tbody
     [:tr [:td "State"][:td "Object Fields"][:td "Values/Data"]]
     [:tr [:td "Transition"][:td "Object Methods"][:td "Functions"]]
     [:tr {:class "fragment highlight-green"} [:td "Management"][:td "Object References"][:td "Concurrency Primitives"]]
     [:tr [:td "I/O"][:td "Object Methods"][:td "Loose Coupling"]]
     [:tr { :class :fragment } [:td "Concerns"][:td "Complected"][:td "Separated"]]]]])

(def oop
  [:section
   [:h2 "The Object Oriented Approach"]
   [:ul
    [:li "Top level objects own children and so on."]
    [:li "Your program keeps track of its objects."]
    [:li "use JCIP within your classes."]
    [:li "There is no separation of this concern."]]])

(def fp-clojure
  [:section
   [:h2 "The Clojure Approach"]
   [:ul
    [:li "Persistend references to values"]
    [:li "Atoms, agents, refs"]]])

(def slides
  [[:section
    [:h1 "State Management"]
    [:h2 "How do I track my domain?"]]
   comparison
   oop
   fp-clojure])

(reveal/write-presentation
  {:out "state.html"
   :slides slides
   :author "Mark Bastian"
   :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
   :title "Clojure: State"})