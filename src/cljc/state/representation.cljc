(ns state.representation
  (:require [reveal.clj.core :as reveal]
            [reveal.clj.code-sample :as c]))

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
    [:li "Object hierarchies are interdependent and non-separable"]]])

(def oop-example
 [:section
  [:h2 "OOP Example"]
  [:p "Flocking Class Hierarchy"]
  [:img {:src "images/flocking.svg"}]
  [:p "Just relationships, no fields yet"]])

(def fp-clojure
  [:section
   [:h2 "The Clojure Approach"]
   [:ul
    [:li "The domain is represented by data"]
    [:li "This is relatively unique to Clojure"]
    [:li "Other Functional Languages (e.g Scala) are still class driven"]]])

(def data-representation
  [:section
   [:h2 "Representing Data in Clojure"]
   [:ul
    [:li "Primitives:"
     [:ul
      [:li "Strings, numbers, characters, booleans, nil, and keywords"]]]
    [:li "Data structures:"
     [:ul
      [:li "{}: Map"]
      [:li "[]: Vector"]
      [:li "#{}: Set"]
      [:li "(): List"]]]]])

(def clojure-example
 [:section
  [:h2 "Clojure Example"]
  [:p "Flocking Data Representation"]
  (c/code-block "resources/state/single-boid.txt" "clj")])

(def clojure-example-2
 [:section
  [:h2 "Clojure Example"]
  [:p "Multiple Boids"]
  (c/code-block "resources/state/two-boids.txt" "clj")])

(def principles
 [:section
  [:h2 "Guiding Principles"]
  [:ul
   [:li "Start with an example"]
   [:li "Model the problem as data"]
   [:li "Keep it simple"]
   [:li "If you get the data right, everything else will fall into place"]
   [:li "Don't worry too much"
    [:ul
     [:li "Problems become self-evident"]
     [:li "It's generally easy to change"]]]]])

(def gotchas
 [:section
  [:h2 "A Gotcha: Recursive References"]
  [:ul
   [:li "Suppose a person owns a car"]
   [:li "...and the car is registered to it's owner"]
   [:li "Solution: Use unique identifiers"
    [:ul
     [:li "Unique is subjective"]
     [:li "It's OK to mix types"]]]]])

(def conclusion
 [:section
  [:h2 "State Representation"]
  [:table
   [:thead [:tr [:th "Aspect"][:th "OOP"][:th "FP"]]]
   [:tbody
    [:tr [:td "State"][:td "Mutable Fields"][:td "Immutable Data"]]
    [:tr [:td "Representation"][:td "Complex"][:td "Simple"]]
    [:tr [:td "Relationships"][:td "Interdependent"][:td "Dependent"]]]]])

(def slides
  [[:section
    [:h1 "State Representation"]
    [:h2 "How do I represent my domain?"]]
   comparison
   oop
   oop-example
   fp-clojure
   data-representation
   clojure-example
   clojure-example-2
   principles
   gotchas
   conclusion])

(reveal/write-presentation
  {:out "state.html"
   :slides slides
   :author "Mark Bastian"
   :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
   :title "Clojure: State"})