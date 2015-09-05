(ns state.fp
  (:require [reveal.clj.core :as reveal]))

(def fn-diagram
  [:section
   [:h2 "Functional Programming"]
   [:div
    [:div {:style "float:left;width:50%;" }
     [:ul
      [:li "First class functions"]
      [:li "Values"]
      [:li "Referential tranparency"]]]
    [:div  {:style "float:right;width:50%;" }
     [:img {:src "images/191px-Function_machine2.png"}]]]])

(def functions
  [:section
   [:h2 "Functions"]
   [:h3 "(First class functions)"]
   [:ul
    [:li "Functions != methods"]
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
    [:li "Value classes: Finalized classes with hashcode and equals"]
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
    [:li "Referential Transparency = No Side Effects"]
    [:li "Convention over enforcement in most languages"]]])

(def slides
  [[:section [:h1 "Functional Programming"]]
   fn-diagram
   functions
   values
   referential-transparency])

(reveal/write-presentation
  {:out "state.html"
   :slides slides
   :author "Mark Bastian"
   :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
   :title "Clojure: State"})
