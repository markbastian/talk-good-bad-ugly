(ns oldstate.slides
  (:require [reveal.clj.core :as reveal]
            [reveal.clj.code-sample :as c]
            [oldstate.state :as state]
            [oldstate.representation :as r]
            [oldstate.transition :as t]
            [oldstate.management :as m]
            [oldstate.input-output :as io]
            [oldstate.fp :as fp]))

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

(def data-2
  [:section
   [:h2 "Start with Data"]
   [:ul
    [:li "Directly model your domain"]
    [:li "The data structure will naturally evolve"]]])

(def conclusion
 [:section
  [:h2 "In Conclusion:"]
  [:h2 "Yes, you can be stateless"]
  [:ul
   [:li "It's a different way of thinking"]
   [:li "Threading and api design"]
   [:li "Come see my other talk"]]])

(def overview
 [:section
  [:h2 "Overview"]
  [:ul
   [:li "Why this talk"]
   [:li "Functional Programming"]
   [:li "The Challenges and Their Solutions"]
   [:li "Conclusions"]]])

(def why
  [:section
   [:h2 "Why This Talk"]
   [:ul
    [:li "Many best practices focus on immutability and statelessness"]
    [:li "Modern languages trend towards FP (e.g. Scala and Clojure)"]
    [:li "I want you to fast track to Clojure"]]])

(def outcomes
  [:section
   [:h2 "Outcomes"]
   [:ul
    [:li "Goal: Clojure"]
    [:li "Learn what can and can't be done in whatever language you are using"]]])

(def slides
 [intro
  overview
  why
  outcomes
  (into [:section] fp/slides)
  (into [:section] state/slides)
  ;;Are these next two right?
  (into [:section] r/slides)
  (into [:section] t/slides)
  (into [:section] m/slides)
  (into [:section] io/slides)
  overview
  conclusion])

(reveal/write-presentation
 {:out "state.html"
  :slides slides
  :author "Mark Bastian"
  :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
  :title "Clojure: State"})

