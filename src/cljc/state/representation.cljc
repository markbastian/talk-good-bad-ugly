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

;(def vars
;  [:section
;   [:h2 "Vars"]
;   [:p "Thread-Local Binding"]
;   (c/code-block "resources/state/vars.txt"
;                 {:style  "float:left;width:48%;height:100%;font-size:40%;" })
;   (c/code-block "resources/state/vars-out.txt"
;                 {:style  "float:right;width:48%;height:100%;" })])

(def oop-example
  [:section
   [:h2 "OOP Boids, Take 1"]
   [:div
    [:div {:style  "float:left;width:48%;" }
     [:ul
      [:li "8 Classes/Interfaces"]
      [:li "159 LOC"]
      [:li "Only relationships"]
      [:li "Strong interdependence"]
      [:li "No methods yet"]
      [:li "No instances"]]]
    [:div {:style  "float:right;width:48%;" }
     [:img {:src "images/flocking-v0.png" } ]]]])

(def oop-example-2
  [:section
   [:h2 "OOP Boids, Take 2"]
   [:div
    [:div {:style  "float:left;width:48%;" }
     [:ul
      [:li "12 Classes/Interfaces"]
      [:li "179 LOC"]
      [:li "Only relationships"]
      [:li "Strong interdependence"]
      [:li "No methods yet"]
      [:li "No instances"]]]
    [:div {:style  "float:right;width:48%;" }
     [:img {:src "images/flocking-v1.png" } ]]]])

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
  (c/code-block "resources/state/single-boid.txt")])

(def clojure-example-2
 [:section
  [:h2 "Clojure Example"]
  [:p "Multiple Boids"]
  (c/code-block "resources/state/two-boids.txt")])

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
   [:li "...and the car is registered to its owner"]
   [:li "Solution: Use unique identifiers"
    [:ul
     [:li "Unique is subjective"]
     [:li "It's OK to mix types"]]]]])

(def data-tips
  [:section
   [:h2 "Data Modeling Tips"]
   [:ul
    [:li "Entity Maps"]
    [:li "Cycles via identifiers"]
    [:li "Use UUIDs or other unique identifiers"]
    [:li "Names make poor identifiers"]]])

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
   oop-example-2
   fp-clojure
   data-representation
   clojure-example
   clojure-example-2
   principles
   gotchas
   data-tips
   conclusion])

(reveal/write-presentation
  {:out "state.html"
   :slides slides
   :author "Mark Bastian"
   :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
   :title "Clojure: State"})