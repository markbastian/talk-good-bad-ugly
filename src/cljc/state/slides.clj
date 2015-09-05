(ns state.slides
  (:require [reveal.clj.core :as reveal]
            [state.fp :as fp]
            [state.challenges :as challenges]))

;Those new to the world of functional programming often find themselves stymied by the problem of managing state in a
;stateless world. You are told that functional programs should be stateless (that is, have no mutable state), and yet
;any meaningful application must have some mutable state. This session presents a technique for managing state in
;Clojure applications by walking the audience through common Clojure concurrency primitives, explaining methods for
;working with them, and demonstrating how to write applications that separate the concerns of application state and
;functional design. Audience members will leave the session with an understanding of how to write functional APIs while
;also developing rich, stateful, concurrent applications.

(def intro
  [:section
   [:h2 "Functional Programming"]
   [:h4 "Writing Stateless Code in a Stateful World with Clojure"]
   [:p "Mark Bastian"]
   [:small [:p
            [:a
             {:href "mailto:markbastian@gmail.com?Subject=FP Stateless Talk"}
             "markbastian@gmail.com"]]
    [:p [:a {:href "https://twitter.com/mark_bastian" } "@mark_bastian"]]]
   [:p "10/26/15"]])

(def overview
  [:section
   [:h2 "Overview"]
   [:ul
    [:li "Why this talk"]
    [:li "Functional Programming"]
    [:li "Value, State, and Immutability"]
    [:li "Challenges and Solutions"]
    [:li "Conclusions"]]])

(def why
  [:section
   [:h2 "Why This Talk"]
   [:ul
    [:li "Many best practices focus on immutability and statelessness"]
    [:li "Modern languages trend towards Functional Programming (e.g. Scala and Clojure)"]
    [:li "This can be a difficult concept to understand"]
    [:li "This talk addresses many of the challenges I faced"]]])

(def goals
  [:section
   [:h2 "Goals"]
   [:ul
    [:li "Overcome FP hurdles"]
    [:li "Learn language opportunities and limitations"]
    [:li "Become more functional"]
    [:li "Ultimate Goal: Consider Clojure"]]])

(def comparison
  [:section
   [:h2 "Comparison of Paradigms"]
   [:table
    [:thead [:tr [:th "Aspect"][:th "OOP"][:th "FP"]]]
    [:tbody
     [:tr [:td "State"][:td "Object Fields"][:td "Values/Data"]]
     [:tr [:td "Transition"][:td "Object Methods"][:td "Functions"]]
     [:tr [:td "Management"][:td "Object References"][:td "Concurrency Primitives"]]
     [:tr [:td "I/O"][:td "Object Methods"][:td "Loose Coupling"]]
     [:tr [:td "Concerns"][:td "Complected"][:td "Separated"]]]]])

(def conclusion
  [:section
   [:h2 "In Conclusion:"]
   [:ul
    [:li "You can be functional"]
    [:li "Programming with values is achievable"]
    [:li "Clojure"
     [:ul
      [:li "Extremely well designed and thought out"]
      [:li "Try it out"]
      [:li "Also hosted - use it from Java"]]]
    [:li "Come see my other talk"]]])

(def slides
  [intro
   overview
   why
   goals
   (into [:section] fp/slides)
   comparison
   (into [:section] challenges/slides)
   conclusion])

(reveal/write-presentation
  {:out "state.html"
   :slides slides
   :author "Mark Bastian"
   :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
   :title "Clojure: State"})
