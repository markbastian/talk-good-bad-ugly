(ns state.oop
  (:require [reveal.clj.core :as reveal]))

(def overview
  [:section
   [:h2 "Overview"]
   [:ul
    [:li ""]]])

(def whats-it-about-oop
  [:section
   [:h2 "Object Oriented Programming"]
   [:ul
    [:li "Objects contain state in the form of fields"]
    [:li "Objects contain methods"]
    [:li "Fields are generally mutable (setters)"]
    [:li "They are often observable or observed (e.g. Beans, PCLs, etc.)"]
    [:li "Wiring all of these items up produces a program"]]])

(def slides
  [[:section [:h1 "Object Oriented Programming"]]
   whats-it-about-oop])

(reveal/write-presentation
  {:out "state.html"
   :slides slides
   :author "Mark Bastian"
   :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
   :title "Clojure: State"})
