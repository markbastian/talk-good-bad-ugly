(ns state.fp
  (:require [reveal.clj.core :as reveal]))

(def what-is-fp
 [:section
  [:h2 "Functional Programming"]
  [:ul
   [:li "Functional Programming models computation as the evaluation of mathematical functions"]
   [:li "Mathematical functions have no side-effects"]
   [:li "Inputs and outputs are values (i.e. no mutable state)"]]])

(def what-is-fp2
 [:section
  [:h2 "What is Functional Programming?"]
  [:blockquote { :cite "http://en.wikipedia.org/wiki/Functional_programming"}
  "&ldquo;In computer science, functional programming is a programming paradigm, a style of building the structure and
  elements of computer programs, that treat computation as the evaluation of mathematical functions and avoids
  changing-stat and mutable data.&rdquo;"]
  [:span { :style "position:absolute;bottom:-10;right:150;font-size:0.5em" }
   "http://en.wikipedia.org/wiki/Functional_programming" ]])

(def tenets
 [:section
  [:h2 "Tenets of Functional Programming"]
  [:ul
   [:li "Functions: Relations that consistently map an input to a single output"]
   [:li "Data is immutable (values)"]
   [:li "Functions have no side-effects"]]])

(def comparison
 [:section
  [:h2 "Comparison of Paradigms"]
  [:table
   [:thead [:tr [:th "Aspect"][:th "OOP"][:th "FP"]]]
   [:tbody
    [:tr [:td "State"][:td "Mutable"][:td "Immutable/Values"]]
    [:tr [:td "Verbs"][:td "Methods"][:td "Functions"]]]]])

(def comparison2
 [:section
  [:h2 "Comparison of Paradigms"]
  [:table
   [:thead [:tr [:th "Aspect"][:th "OOP"][:th "FP"]]]
   [:tbody
    [:tr [:td "State"][:td "Object Fields"][:td "Values"]]
    [:tr [:td "Transition"][:td "Object Methods"][:td "Functions"]]
    [:tr [:td "Management"][:td "Object References"][:td "Concurrency Primitives"]]]]])

(def functions
 [:section
  [:h2 "Functions"]
  [:ul
   [:li
    "Functions are types in FP, not just methods"
    [:ul
     [:li "They can be assigned"]
     [:li "They can be passed around and returned"]]]
   [:li
    "FP Functions are Mathematical Functions, with all of their special properties:"
    [:ul
     [:li "Consistent results"]
     [:li "Composition, substitution, partial evaluation, etc."]]]]])

(def values
 [:section
  [:h2 "Values"]
  [:ul
   [:li "Values are immutable"]
   [:li "Primitives (double, int, string, etc.) are values"]
   [:li "Value Types and Immutable Collections: Immutable classes with equality and hashcode"]
   [:li "Values are implicitly concurrent"]
   [:li "Values don't require deep copying since they can share history"]
   [:li "Values are required for functional consistency"]
   [:li "Values are easy to reason about"]
   [:li "In FP, it's values all the way down"]]])

(def side-effects
 [:section
  [:h2 "No Side Effects"]
  [:ul
   [:li "Anything that affects computation besides the function internals is a side effect"]
   [:li "Mathematical functions have no side-effects"]
   [:li "Examples of side-effects include disk i/o, printing, rendering, and loading configuration files"]
   [:li "In practice, there will be side-effects"]
   [:li "FP seeks to minimize and contain them"]
   [:li "Watch &ldquo;The Value of Values&rdquo; by Rich Hickey"]]])

(def why-fp
  [:section
   [:h2 "Why FP?"]
   [:ul
    [:li "Implicit concurrency"]
    [:li "Code is easier to reason about"]
    [:li "Greater reuse"]
    [:li "Easier abstractions lead to less code"]]])

(def awesome
  [:section
   [:h2 "Functional Programming is Awesome!"]])

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
    [:li "That is what this talk is about"]]])

(def slides
  [[:section [:h2 "Functional Programming"]]
   what-is-fp
   what-is-fp2
   comparison2
   tenets
   functions
   values
   side-effects
   why-fp
   awesome
   the-challenge])

(reveal/write-presentation
  {:out "state.html"
   :slides slides
   :author "Mark Bastian"
   :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
   :title "Clojure: State"})
