(ns state.patterns
  (:require [reveal.clj.core :as reveal]))

{ :name "Michael Scott"
 :role :manager
 :employer "Dunder Mifflin"
 :age 40 }

{ :name "Java One"
 :location "San Francisco"
 :age 18 }

(defn grow-a-year-older [s] (update s :age inc))

;;Pattens for handling state
(def data
  [:section
   [:h2 "Data"]
   [:ul
    [:li "Represent your domain as Clojure data structures"]
    [:li "{}, [], #{}, ()"]
    [:li "Do not use classes"]
    [:li "defrecords: Some people like them"]]])

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
  [[:section [:h1 "Practices"]]
   thread-ready
   minimize-state-variables])

(reveal/write-presentation
  {:out "state.html"
   :slides slides
   :author "Mark Bastian"
   :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
   :title "Clojure: State"})