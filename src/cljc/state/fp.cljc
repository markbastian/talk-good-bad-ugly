(ns state.fp
  (:require [reveal.clj.core :as reveal]))

(def what-is-fp2
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
  [:h2 "Properties of Functions"]
  [:img {:src "images/191px-Function_machine2.png"}]
  [:ul {:style  "float:right;width:50%;" }
   [:li "Map inputs to outputs"]
   [:li "Values vs. variables"]
   [:li "No side-effects"]]])

(def why-fp
  [:section
   [:h2 "Why FP?"]
   [:ul
    [:li "Implicit concurrency"]
    [:li "Code is easier to reason about"]
    [:li "Greater reuse"]
    [:li "Easier abstractions lead to less code"]]])

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
   what-is-fp2
   fn-diagram
   why-fp
   the-challenge])

(reveal/write-presentation
  {:out "state.html"
   :slides slides
   :author "Mark Bastian"
   :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
   :title "Clojure: State"})
