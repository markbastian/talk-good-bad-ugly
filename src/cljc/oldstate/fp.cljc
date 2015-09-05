(ns oldstate.fp
  (:require [reveal.clj.core :as reveal]))

(def paradigms-and-languages
  [:section
   [:h2 "Paradigms and Languages"]
   [:ul
    [:li "Paradigm: A programming discipline or practice based upon a certain idea or philosophy"
     [:ul
      [:li "Procedural/Imperative"]
      [:li "Object Oriented"]
      [:li "Functional"]
      [:li "There are others"]]]
    [:li "Languages are generally designed around a given paradigm"]
    [:li "No language is 100% one paradigm or 0% another"]
    [:li "This talk will address some aspects of how FP can and cannot be done in Java and Scala"]]])

(def what-is-fp
  [:section
   [:h2 "What is Functional Programming?"]
   [:blockquote { :cite "http://en.wikipedia.org/wiki/Functional_programming"}
    "&ldquo;In computer science, functional programming is a programming paradigm, a style of building the structure and
    elements of computer programs, that treat computation as the evaluation of mathematical functions and avoids
    changing-state and mutable data.&rdquo;"]
   [:span { :style "position:absolute;bottom:-10;right:150;font-size:0.5em" }
    "http://en.wikipedia.org/wiki/Functional_programming" ]])

(def fn-diagram
  [:section
   [:h2 "Functional Programming"]
   [:p "The canonical function picture"]
   [:img {:src "images/191px-Function_machine2.png"}]
   [:p "The presence of functions is a necessary but not sufficient condition for FP"]])

(def fp-pillars
  [:section
   [:h2 "Pillars of Paradigms"]
   [:div
    [:div {:style  "float:left;width:50%;" }
     [:p "OOP"]
     [:ul
      [:li "Encapsulation"]
      [:li "Polymorphism"]
      [:li "Inheritance"]]]
    [:div {:style  "float:right;width:50%;" }
     [:p "FP"]
     [:ul
      [:li "Functions as Citizens"]
      [:li "Values"]
      [:li "Referential Transparency"]]]]
   [:p "These are not mutally exclusive"]])

(def functions
  [:section
   [:h2 "Functions as Citizens"]
   [:ul
    [:li "Functions are types, just like objects"]
    [:li "They can be passed in to functions (HOF)"]
    [:li "They can be returned from functions (HOF)"]
    [:li "They have mathematical characteristics"
     [:ul
      [:li "Composition"]
      [:li "Partial application"]]]]])

(def values
  [:section
   [:h2 "Values"]
   [:ul
    [:li "Values are immutable data"]
    [:li "Primitives: numbers, strings, booleans, etc."]
    [:li "Value types: Finalized classes with hashcode and equals"]
    [:li "Immutable collections"]
    [:li "State is not a value"]]])

(def referential-transparency
  [:section
   [:h2 "Referential Transparency"]
   [:ul
    [:li "A function that can be replaced by its value is referentially transparent"]
    [:li "The same inputs always map to the same outputs"]
    [:li "In mathematics all functions are referentially transparent"]
    [:li "In programming this is not always the case"]
    [:li "Referential Transparencey = No Side Effects"]
    [:li "Convention over enforced in most languages"]]])

;Where to put global state mangement
;OOP does it easily, but now well
;Clojure does it easily and well,  but you must grok
;This is a language feature, not a paradigm feature

(def language-support
  [:section
   [:h2 "Language Support"]
   [:small [:table
    [:thead [:tr [:th "Aspect"][:th "Java"][:th "Scala"] [:th "Clojure"]]]
    [:tbody
     [:tr [:td "Functions"][:td "Partial (J8)"][:td "First Class"][:td "First Class"]]
     [:tr [:td "Value Classes"][:td "With Difficulty"][:td "Case Classes"][:td "defrecord"]]
     [:tr [:td "Immutable Collections"][:td "No"][:td "Yes"][:td "Yes - Core"]]
     [:tr [:td "Referential Transparency"][:td "Non-default"][:td "if FP"][:td "Default"]]
     [:tr { :class :fragment } [:td "Encapsulation"][:td "Yes"][:td "Yes"][:td "Yes"]]
     [:tr { :class :fragment } [:td "Inheritance"][:td "Yes"][:td "Yes"][:td "Yes"]]
     [:tr { :class :fragment } [:td "Polymorphism"][:td "Single Dispatch"][:td "Single Dispatch"][:td "Multi Dispatch"]]]]]])


(def why-fp
  [:section
   [:h2 "Why FP?"]
   [:ul
    [:li "Implicit concurrency"
     [:ul
      [:li "Not the same as implicit parallelism"]]]
    [:li "Code is easier to reason about"]
    [:li "Greater reuse: Actions vs. Hierarchies"]
    [:li "Simpler abstractions lead to less code"]]])

;Note that it took me several years to get here.
;My goal is to accelerate the process for everyone else.
(def the-challenge
  [:section
   [:h2 "However..."]
   [:ul
    [:li "FP tends to be very confusing coming from an OOP background"]
    [:li "How can you do anything useful when there is no state or side-effects?"
     [:ul
      [:li "The world has state...."]
      [:li "FP has no state..."]]]
    [:li "That is what this talk will address"]]])

(def slides
  [[:section [:h2 "Functional Programming"]]
   paradigms-and-languages
   what-is-fp
   fn-diagram
   fp-pillars
   functions
   values
   referential-transparency
   language-support
   why-fp
   the-challenge])

(reveal/write-presentation
  {:out "state.html"
   :slides slides
   :author "Mark Bastian"
   :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
   :title "Clojure: State"})
