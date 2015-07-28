(ns state.slides
 (:require [reveal.clj.core :as reveal]
           [state.state :as st]
           [state.concurrency :as sc]
           [state.practice :as sp]))



(def overview
 [:section
  [:h2 "Overview"]
  [:ul
   [:li "What is stateless code?"]
   [:li "How do I get there?"]
   [:li "Considerations"]]])

;;FP in the small is easy
;; - persistent collections
;;   - Native in Scala, Clojure
;; - small, immutable classes
;;   - Native support in Scala () and Clojure

;;Evolution
;; - Persistent collections with functional interfaces
;; - Immutable classes - Have to give up beans
;; - Immutable state with native concurrency - Need native concurrency support

(def the-goal
 [:section
  [:h2 "Goals of this Presentation"]
  [:ul
   [:li "Explain why programming statelessly is a very good thing"]
   [:li "Overcome the conceptual hurdles"]
   [:li "Demonstrate FP in practice"]]])

(def fp-in-the-small
 [:section
  [:h2 "Overview"]
  [:ul
   [:li "What is state and how do I think about it?"]
   [:li "Stateless programming in practice"]
   [:li "????"]]])

(def background
 [:section
  [:h2 "Background"]
  [:ul
   [:li "Late 90's: Started programming - OOP is all the rage"]
   [:li "Late 00's: Started Scala"]
   [:li "2013/2014: Clojure"]]])

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

;;best practices
;;Decouple state management from value calculations

;;look for patterns in data (code) <- we are homoiconic, remember

;;Function families
;; X -> X
;; X -> binary
;; X -> or X nil (queries)

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

(def intro
 [:section
  [:h3 "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"]
  [:p "Mark Bastian"]
  [:p
   [:a
    {:href "mailto:markbastian@gmail.com?Subject=Syntax"}
    "markbastian@gmail.com"]]
  [:p [:a {:href "https://twitter.com/mark_bastian" } "@mark_bastian"]]
  [:p "3/24/2015"]])

(def slides
 [intro
  overview
  (into [:section] st/slides)                               ;what
  (into [:section] sp/slides)                               ;how
  (into [:section] sc/slides)                               ;examples?
  the-challenge                                             ;move
  clojure-vs                                                ;move
  conclusion])

(reveal/write-presentation
 {:out "state.html"
  :slides slides
  :author "Mark Bastian"
  :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
  :title "Clojure: State"})

