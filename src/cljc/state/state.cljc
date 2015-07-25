(ns state.state
  (:require [reveal.clj.core :as reveal]))

(def what-is-state
 [:section
  [:h2 "What is State?"]
  [:quote "State, a complete description of a system in classical mechanics"]])

(def what-is-state-2
  [:section
   [:h2 "What is State?"]
   [:ul
    [:li "State: A representation of the current computational universe"]
    [:li "Often confusing because of differing definitions across communities"]
    [:li "There are two kinds of state:"
     [:ul
      [:li "Mutable: A changeable variable used to represent the &quot;current&quot; state of computation"]
      [:li "Immutable: A single, non-changing, constant value"]]]
    [:li "When FPers say &quot;stateless&quot; they mean &quot;immutable&quot;"]]])

(def the-problem-of-state
  [:section
   [:h2 "If nothing changes, how does anything happen?"]
   [:ul
    [:li "This is the problem I will address"]
    [:li "When FPers say &quot;stateless&quot; they mean &quot;immutable&quot;"]
    [:li "To OOPers this is a bizarre concept"]
    [:li "Heat death of the universe"]
    [:li "An analogy..."]]])

(def the-universe
  [:section
   [:h2 "The Traditional Universe"]
   [:ul
    [:li "Time flows forward like a river"]
    [:li "Things/events happen"]
    [:li "State is the management of all possible events and conditions in the universe"]
    [:li "This is the object-oriented view of reality"]]])

(def the-multiverse
  [:section
   [:h2 "The Multiverse"]
   [:ul
    [:li "A universe is a single, discrete, immutable value"]
    [:li "There are infinitely many of these universes"]
    [:li "Events are &quot;Quantum Leaps&quot; into a different universe"]
    [:li "State is simply a reference to one or more universes of interest"]
    [:li "This is the functional view of reality"]]])

(def state-concerns
  [:section
   [:h2 "Concerns of State in Either Model"]
   [:ol
    [:li "Representation: How do I represent a given value?"]
    [:li "Management: How do I keep track of a value(s) of interest?"]
    [:li "Transition: How do I get from one representation to another?"]]])

(def universal-state-management
  [:section
   [:h2 "Universal State Management"]
   [:ol
    [:li "Representation: A mutable instance of a class"]
    [:li "Management: A reference to one or more mutable objects"]
    [:li "Transition: Getters, setters, and methods on tracked mutable objects"]]])

(def multiversic-state-management
  [:section
   [:h2 "Multiversic State Management"]
   [:ol
    [:li "Representation: An immutable value representing the current state(s) of interest (data)"]
    [:li "Management: A concurrency primitive(s) holding a reference to the value(s) of interest"]
    [:li "Transition: Functions"]]])

(def pros-cons-mutability
  [:section
   [:h2 "Pros/Cons of Mutable State"]
   [:ul
    [:li "Pros"
     [:ul
      [:li "Generally conceptully easier to think about"]
      [:li "Performance can be better (with caveats)"]]]
    [:li "Cons"
     [:ul
      [:li "Concurrency is non-trivial"]
      [:li "There is no separation of concerns"]
      [:li "Representation, management, and transition are tied together"]]]]])

(def pros-cons-immutability
  [:section
   [:h2 "Pros/Cons of Immutable State"]
   [:ul
    [:li "Pros"
     [:ul
      [:li "Concurrency is implicit"]
      [:li "Concerns are completely separated"]]]
    [:li "Cons"
     [:ul
      [:li "Often a difficult idea to get your head wrapped around"]
      [:li "Not all languages support this model"]]]]])

(def language-support-representation
  [:section
   [:h2 "Language Support: Representation"]
   [:ul
    [:li "Naively creating one-off instances of all state is a bad idea"]
    [:li "Persistent Data Structures"
     [:ul
      [:li "Data is shared from one state to the next"]
      [:li "Can be efficient and fast"]]]]])

(def language-support-management
  [:section
   [:h2 "Language Support: Management"]
   [:ul
    [:li "Pros"
     [:ul
      [:li "Concurrency is implicit"]
      [:li "Concerns are completely separated"]]]]])

(def language-support-transition
  [:section
   [:h2 "Language Support: Representation"]
   [:ul
    [:li "Functions"
     [:ul
      [:li "That's what FP is all about"]]]]])

(def slides
  [what-is-state
   what-is-state-2
   the-problem-of-state
   the-universe
   the-multiverse
   state-concerns
   universal-state-management
   multiversic-state-management
   pros-cons-mutability
   pros-cons-immutability
   language-support-representation
   language-support-management
   language-support-transition])

(reveal/write-presentation
  {:out "state.html"
   :slides slides
   :author "Mark Bastian"
   :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
   :title "Clojure: State"})