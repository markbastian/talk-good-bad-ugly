(ns state.slides
 (:require [reveal.clj.core :as reveal]))

(def intro
 [:section
  [:h2 "Managing State in a Stateless World"]
  [:h3 "Tips and Patterns for Managing State in Clojure"]
  [:p "Mark Bastian"]
  [:p
   [:a
    {:href "mailto:markbastian@gmail.com?Subject=Syntax"}
    "markbastian@gmail.com"]]
  [:p [:a {:href "https://twitter.com/mark_bastian" } "@mark_bastian"]]
  [:p "3/24/2015"]])

(def the-challenge
 [:section
  [:h2 "The Big Challenge"]
  [:ul
   [:li "The most confusing thing about FP"
    [:ul
     [:li "The world has state...."]
     [:li "FP has no state..."]
     [:li "What gives?"]]]
   [:li "Patterns"
    [:ul
     [:li "Mapping X -> X"]
     [:li "Mapping X -> X or nil"]
     [:li "Threading"]]]]])

(def overview
 [:section
  [:h2 "Overview"]
  [:ul
   [:li "Concurrency Primtives"
    [:ul
     [:li "Atoms"]
     [:li "Atomic retries"]
     [:li "Refs"]
     [:li "Agents"]]]
   [:li "Patterns"
    [:ul
     [:li "Mapping X -> X"]
     [:li "Mapping X -> X or nil"]
     [:li "Threading"]]]]])

(def clojure-vs
 [:section
  [:h2 "Other Languages?"]
  [:ul
   [:li "Scala"
    [:ul
     [:li "Akka"]
     [:li "Not baked in"]
     [:li "Actors"]
     [:li "STM"]]]
   [:li "Clojure"
    [:ul
     [:li "Batteries included"]]]]])

(def conclusion
 [:section
  [:h2 "In Conclusion:"]
  [:h2 "Yes, you can be stateless"]
  [:ul
   [:li "It's a different way of thinking"]
   [:li "Threading and api design"]
   [:li "Come see my other talk"]]])

(def slides
 [intro
  the-challenge
  clojure-vs
  overview
  conclusion])

(reveal/write-presentation
 {:out "state.html"
  :slides slides
  :author "Mark Bastian"
  :description "Managing state in a stateless world"
  :title "Clojure: State"})

