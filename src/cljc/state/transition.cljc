(ns state.transition
  (:require [reveal.clj.core :as reveal]
            [reveal.clj.code-sample :as c]))

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

(def oop-example
  [:section
   [:h2 "OOP Example"]
   [:p "How do I do this?"]
   [:p "Each behavior "]])

(def fp-clojure
  [:section
   [:h2 "The Clojure Approach"]
   [:ul
    [:li "Value vs. State Transition"]
    [:li "Functions"]
    [:li "You can do this in most languages"
     [:ul
      [:li "However, class methods are coupled to classes"]]]]])

(def clojure-example-wander
  [:section
   [:h2 "Clojure Example"]
   [:p "Wandering"]
   [:small (c/code-block "resources/state/wander.txt" "clj" {:style  "width:800px;" })]
   [:p "Averaging"]
   [:small (c/code-block "resources/state/average-flock.txt" "clj" {:style  "width:800px;" })]])

(def clojure-example-sim
  [:section
   [:h2 "Clojure Example"]
   [:p "Flocking Function - Flock Simulation"]
   (c/code-block "resources/state/sim.txt" "clj")
   [:p "Key Concept: Full State In -> Full State Out"]])

(def functions
  [:section
   [:h2 "Functions"]
   [:ul
    [:li "Many small functions are preferable to a few large ones"]
    [:li "Compose behaviors from your small functions"]
    [:li "Functions that operate on data are more flexible than functions that operate on classes"]
    [:li "Work up to functions that take your entire state in and return a new state"]]])

(def conclusion
  [:section
   [:h2 "Conclusions"]
   [:ul
    [:li "Start small and simple"]
    [:li "Compose behaviors from your small functions"]
    [:li "Work towards state -> state functions"]
    [:li "These can also be chained (-> state foo bar fern doc baz)"]
    [:li "Clojure functions care about data, not domain"]]])

(def slides
  [[:section
    [:h1 "State Transition"]
    [:h2 "How do I modify my domain?"]]
   comparison
   oop
   oop-example
   fp-clojure
   clojure-example-wander
   clojure-example-sim
   functions
   conclusion])

(reveal/write-presentation
  {:out "state.html"
   :slides slides
   :author "Mark Bastian"
   :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
   :title "Clojure: State"})