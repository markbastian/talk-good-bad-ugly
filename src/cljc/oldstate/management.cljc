(ns oldstate.management
  (:require [reveal.clj.core :as reveal]
            [reveal.clj.code-sample :as c]))

(def comparison
  [:section
   [:h2 "Comparison of Paradigms"]
   [:table
    [:thead [:tr [:th "Aspect"] [:th "OOP"] [:th "FP"]]]
    [:tbody
     [:tr [:td "State"] [:td "Object Fields"] [:td "Values/Data"]]
     [:tr [:td "Transition"] [:td "Object Methods"] [:td "Functions"]]
     [:tr {:class "fragment highlight-green"} [:td "Management"] [:td "Object References"] [:td "Concurrency Primitives"]]
     [:tr [:td "I/O"] [:td "Object Methods"] [:td "Loose Coupling"]]
     [:tr {:class :fragment} [:td "Concerns"] [:td "Complected"] [:td "Separated"]]]]])

(def oop
  [:section
   [:h2 "The Object Oriented Approach"]
   [:ul
    [:li "Top level objects own children and so on."]
    [:li "Your program keeps track of its objects."]
    [:li "use JCIP within your classes."]
    [:li "There is no separation of this concern."]]])

(def fp-clojure
  [:section
   [:h2 "The Clojure Approach"]
   [:ul
    [:li "Persistend references to values"]
    [:li "Atoms, agents, refs"]]])

(def atoms
  [:section
   [:h2 "Atoms"]
   [:p "Uncoordinated, Synchronous"]
   (c/code-block "resources/state/atoms.txt"
                 {:style "float:left;width:48%;height:100%;font-size:40%;"})
   (c/code-block "resources/state/atoms-out.txt"
                 {:style "float:right;width:48%;height:100%;"})])

(def swap-vs-reset
  [:section
   [:h2 "Swap vs. Reset"]
   [:ul
    [:li "swap! compares and retries - it never loses an operation"]
    [:li "reset! just sets the value of the atom"]]
   (c/code-block "resources/state/atom-swap-reset.txt"
                 {:style "float:left;width:48%;height:100%;font-size:40%;"})
   (c/code-block "resources/state/atom-swap-reset-out.txt"
                 {:style "float:right;width:48%;height:100%;"})])

(def agents
  [:section
   [:h2 "Agents"]
   [:p "Uncoordinated, Asynchronous"]
   (c/code-block "resources/state/agents.txt"
                 {:style "float:left;width:48%;height:100%;font-size:40%;"})
   (c/code-block "resources/state/agents-out.txt"
                 {:style "float:right;width:48%;height:100%;"})])

(def refs
  [:section
   [:h2 "Refs"]
   [:p "Coordinated, Synchronous"]
   (c/code-block "resources/state/refs.txt"
                 {:style "float:left;width:48%;height:100%;font-size:40%;"})
   (c/code-block "resources/state/refs-out.txt"
                 {:style "float:right;width:48%;height:100%;"})])

(def slides
  [[:section
    [:h1 "State Management"]
    [:h2 "How do I track my domain?"]]
   comparison
   oop
   fp-clojure])

(reveal/write-presentation
  {:out         "state.html"
   :slides      slides
   :author      "Mark Bastian"
   :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
   :title       "Clojure: State"})