(ns state.fp
  (:require [reveal.clj.core :as reveal]))

;;Note - get slides from FP talk

(def what-is-fp
  [:section
   [:h2 "Functional Programming"]
   [:ul
    [:li "Functional Programming models computation as the evaluation of mathematical functions"]
    [:li "Mathematical functions have no side-effects"]
    [:li "Inputs and outputs are values (i.e. no mutable state)"]]])

(def what-is-a-function
  [:section
   [:h2 "What is a Function?"]
   [:ul
    [:li "Functions are relations that map an input to an output"]
    [:li "Functions have no side-effects"]
    [:li "Functions inputs and outputs are values"]]])

(def values
  [:section
   [:h2 "Values"]
   [:ul
    [:li "Values are constant, immutable data"]
    [:li "Values are stateless"]
    [:li "They are a neccessary condition for FP"]
    [:li "Watch this talk by Rich Hickey"
     [:ul [:li [:a {:href "https://youtu.be/-6BsiVyC1kM"} "&quot;The Value of Values&quot;"]]]]]])

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

(def the-challenge
  [:section
   [:h2 "However..."]
   [:ul
    [:li "FP tends to be very confusing coming from an OOP background"]
    [:li "How can you do anything useful when there is no state or side-effects"
     [:ul
      [:li "The world has state...."]
      [:li "FP has no state..."]]]
    [:li "That is what this talk is about"]]])

(def slides
  [[:section [:h1 "Functional Programming"]]
   what-is-fp
   what-is-a-function
   values
   why-fp
   awesome
   the-challenge])

(reveal/write-presentation
  {:out "state.html"
   :slides slides
   :author "Mark Bastian"
   :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
   :title "Clojure: State"})
