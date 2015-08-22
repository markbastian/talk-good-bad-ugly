(ns state.concurrency
  (:require [reveal.clj.core :as reveal]
            [reveal.clj.code-sample :as c]))

;;This needs a better bridge on the how section
(def overview
  [:section
   [:h2 "State Management"]
   [:ul
    [:li "Ultimately, you will likely need persistent references to changing values"]
    [:li "Clojure provides facilities for managing these references"]
    [:li "Reference types"
     [:ul
      [:li "Atoms: Uncoordinated, synchronous"]
      [:li "Refs: Coordinated, synchronous"]
      [:li "Agents: Independent, asynchronous"]]]]])

(def vars
  [:section
   [:h2 "Vars"]
   [:p "Thread-Local Binding"]
   (c/code-block "resources/state/vars.txt" "clj"
                 {:style  "float:left;width:48%;height:100%;font-size:40%;" })
   (c/code-block "resources/state/vars-out.txt" "clj"
                 {:style  "float:right;width:48%;height:100%;" })])

(def atoms
  [:section
   [:h2 "Atoms"]
   [:p "Uncoordinated, Synchronous"]
   (c/code-block "resources/state/atoms.txt" "clj"
                 {:style  "float:left;width:48%;height:100%;font-size:40%;" })
   (c/code-block "resources/state/atoms-out.txt" "clj"
                 {:style  "float:right;width:48%;height:100%;" })])

(def swap-vs-reset
  [:section
   [:h2 "Swap vs. Reset"]
   [:ul
    [:li "swap! compares and retries - it never loses an operation"]
    [:li "reset! just sets the value of the atom"]]
   (c/code-block "resources/state/atom-swap-reset.txt" "clj"
                 {:style  "float:left;width:48%;height:100%;font-size:40%;" })
   (c/code-block "resources/state/atom-swap-reset-out.txt" "clj"
                 {:style  "float:right;width:48%;height:100%;" })])

(def agents
  [:section
   [:h2 "Agents"]
   [:p "Uncoordinated, Asynchronous"]
   (c/code-block "resources/state/agents.txt" "clj"
                 {:style  "float:left;width:48%;height:100%;font-size:40%;" })
   (c/code-block "resources/state/agents-out.txt" "clj"
                 {:style  "float:right;width:48%;height:100%;" })])

(def refs
  [:section
   [:h2 "Refs"]
   [:p "Coordinated, Synchronous"]
   (c/code-block "resources/state/refs.txt" "clj"
                 {:style  "float:left;width:48%;height:100%;font-size:40%;" })
   (c/code-block "resources/state/refs-out.txt" "clj"
                 {:style  "float:right;width:48%;height:100%;" })])

(def channels
  [:section
   [:h2 "Channels"]
   [:p "Coordinated, Synchronous"]
   (c/code-block "resources/state/refs.txt" "clj"
                 {:style  "float:left;width:48%;height:100%;font-size:40%;" })
   (c/code-block "resources/state/refs-out.txt" "clj"
                 {:style  "float:right;width:48%;height:100%;" })])

(def slides
  [overview
   vars
   atoms
   swap-vs-reset
   agents
   refs
   channels])

(reveal/write-presentation
  {:out "state.html"
   :slides slides
   :author "Mark Bastian"
   :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
   :title "Clojure: State"})