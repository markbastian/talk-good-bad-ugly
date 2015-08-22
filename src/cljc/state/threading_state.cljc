(ns state.threading-state
  (:require [reveal.clj.core :as reveal]))

;;Pattens for handling state
(def state-representation
  [:section
   [:h2 "Representing Application State"]
   [:ul
    [:li "Use a very small number of <b>values</b> to represent application state."
     [:ul
      [:li "Small number is preferably 1"]]]
    [:li "Maintain a persistent reference to your values using concurrency primitives"
     [:ul
      [:li "Atoms, agents, refs"]]]
    [:li "Round-trip state values"
     [:ul                                                   ;Make separate slide/topic
      [:li "Primitive ->"]
      [:li "Self similar functions"]
      [:li "swap! or alter. Not reset."]
      [:li "-> Primitive"]]]]])

(def functions
  [:section
   [:h2 "Functions"]
   [:ul
    [:li "Many small functions are preferable to a few large ones"]
    [:li "Compose behaviors from your small functions"]
    [:li "Functions that operate on data are more flexible than
    functions that operate on classes"]]])

(def minimize-state-variables
  [:section
   [:h2 "Separate Concerns"]
   [:ul
    [:li "Lots of small functions"]
    [:li "Dissassociate functions from other concerns"
     [:ul
      [:li "Concurrency primitives"]
      [:li "Event handlers"]
      [:li "Other UI "]]]]])

(def thread-ready
  [:section
   [:h2 "Thread-Ready State"]
   [:ul
    [:li "Write your API such that X' = f(X)"]
    [:li "X, X' are persistent data structures"]
    [:li "X, X' are stucturally similar"]]])

(def slides
  [[:section [:h1 "Threading State"]]
   state-representation
   thread-ready
   minimize-state-variables])

(reveal/write-presentation
  {:out "state.html"
   :slides slides
   :author "Mark Bastian"
   :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
   :title "Clojure: State"})
