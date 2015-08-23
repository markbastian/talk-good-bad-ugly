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

(def state-changes
 [:section
  [:h2 "Interacting with State"]
  [:ul
   [:li "Producing Changes"
    [:ul
     [:li "UI layer (Swing, etc.) will call swap!, reset!, alter, etc."]
     [:li "A single <b>set-validator!</b> can be used for input validation across ALL modifiers."]]]
   [:li "Consuming Changes"
    [:ul
     [:li "Any number of <b>add-watch</b>es can be added to your reference"]
     [:li "When watches are triggered, make changes to output system"]
     [:li "Note: Watch for sync issues (SwingUtilities/invokeLater)"]]]
   [:li "Concerns of I/O independent of value management"]]])


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
   state-changes
   thread-ready
   minimize-state-variables])

(reveal/write-presentation
  {:out "state.html"
   :slides slides
   :author "Mark Bastian"
   :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
   :title "Clojure: State"})
