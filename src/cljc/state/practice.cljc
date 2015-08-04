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

;Where do HOFs go?
(def stages
  [:section
   [:h2 "Stages of FP"]
   [:ul
    [:li "Lambdas/Closures/First Class Functions"]
    [:li "Persistent collections"]
    [:li "Immutable classes"]
    [:li "Concurrent state management"]]])

;http://www.oracle.com/technetwork/java/javase/8-whats-new-2157071.html
;They enable you to treat functionality as a method argument, or code as data.
;https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
(def lambdas
  [:section
   [:h2 "Lambdas/Closures"]
   [:ul
    [:li "Lambdas are simply anonymous functions"]
    [:li "Closures are lambdas that "]]])

(def persistent-collections
  [:section
   [:h2 "Persistent Collections"]
   [:ul
    [:li "Immutable"]
    [:li "Shared data for efficiency and speed"]
    [:li "Functional operations"]]])

(def immutable-classes
  [:section
   [:h2 "Value Classes"]
   [:ul
    [:li "Final"]
    [:li "Implement equals and hashcode"]
    [:li "Often have convenience methods for 1-off copies"]
    [:li "Language support"
     [:ul
      [:li "Java: No"]
      [:li "Scala: Case classes"]
      [:li "Clojure: defrecords, but everyone uses persistent collections instead"]]]]])

(def concurrent-state-management
  [:section
   [:h2 "Managing State Concurrently"]
   [:ul
    [:li "Java: No"]
    [:li "Scala: No, but you can use Akka"]
    [:li "Clojure: Yes - and you can use it in Java or Scala"]]])

(def clojure-state-management
  [:section
   [:h2 "Clojure Concurrency Primitives"]
   [:ul
    [:li "Atoms"
     [:ul
      [:li "Synchronous, Uncoordinated"]
      [:li "The workhorse of Clojure concurrency"]]]
    [:li "Agents"
     [:ul
      [:li "Asynchronous, Uncoordinated"]
      [:li "Reactive"]]]
    [:li "Refs"
     [:ul
      [:li "Synchronous, Coordinated"]
      [:li "Banking and other transactional operations"]]]]])

(def slides
  [[:section [:h1 "How"]]
    fp-in-practice
   stages
   lambdas
   persistent-collections
   immutable-classes
   concurrent-state-management
   clojure-state-management])

(reveal/write-presentation
  {:out "state.html"
   :slides slides
   :author "Mark Bastian"
   :description "FP in Practice"
   :title "FP in Practice"})