(ns state.practice
  (:require [reveal.clj.core :as reveal]))

;;Representation
;;Management
;;Transition

(def fp-in-practice
  [:section
   [:h2 "FP in Practice"]
   [:ul
    [:li "A practical roadmap of how to get there"]
    [:li "What languages support each stage"]]])

(def stages
  [:section
   [:h2 "Stages of FP"]
   [:ul
    [:li "Lambdas"]
    [:li "Persistent collections"]
    [:li "Immutable classes"]
    [:li "Concurrent state management"]]])

;http://www.oracle.com/technetwork/java/javase/8-whats-new-2157071.html
;They enable you to treat functionality as a method argument, or code as data.
(def lambdas
  [:section
   [:h2 "Lambdas/Closures"]
   [:ul
    [:li "Closures allow single, stateless calculations"]]])

(def persistent-collections
  [:section
   [:h2 "Persistent Collections"]
   [:ul
    [:li "Immutable"]
    [:li "Shared data for efficiency and speed"]
    [:li "Functional operations"]]])

(def immutable-classes
  [:section
   [:h2 "Stages of FP"]
   [:ul
    [:li "Lambdas"]
    [:li "Persistent collections"]
    [:li "Immutable classes"]
    [:li "Concurrent state management"]]])

(def concurrent-state-management
  [:section
   [:h2 "Stages of FP"]
   [:ul
    [:li "Lambdas"]
    [:li "Persistent collections"]
    [:li "Immutable classes"]
    [:li "Concurrent state management"]]])

(def slides
  [[:section [:h1 "How"]]
    fp-in-practice
   stages
   lambdas
   persistent-collections
   immutable-classes
   concurrent-state-management])

(reveal/write-presentation
  {:out "state.html"
   :slides slides
   :author "Mark Bastian"
   :description "FP in Practice"
   :title "FP in Practice"})