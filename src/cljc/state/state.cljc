(ns state.state
  (:require [reveal.clj.core :as reveal]))

(def what-is-state
 [:section
  [:h2 "What is State?"]
  [:blockquote { :cite "https://en.wikipedia.org/wiki/State" }
   "&ldquo;State, a complete description of a system in classical mechanics&rdquo;"]
  [:span { :style "position:relative;bottom:0;right:-210;font-size:0.5em" }
   "https://en.wikipedia.org/wiki/State" ]
  [:blockquote { :cite "https://www.google.com/search?q=what+is+state&oq=what+is+state" }
   "&ldquo;the particular condition that someone or something is in at a specific time.&rdquo;"]
  [:span { :style "position:relative;bottom:0;right:-80;font-size:0.5em" }
   "https://www.google.com/search?q=what+is+state&oq=what+is+state" ]])

(def program-state
 [:section
  [:h2 "What is Program State?"]
  [:ul
   [:li "A representation of the system"]
   [:li "Often confusing because of differing definitions across communities"]
   [:li "There are two views on state:"
    [:ul
     [:li "Mutable: A changeable variable used to represent the &ldquo;current&rdquo; state of computation"
      [:ul
       [:li "This is OOP state"]]]
     [:li "Immutable: A single, non-changing, constant value"
      [:ul
       [:li "This is FP state (what we want)"]]]]]]])

(def the-problem-of-state
  [:section
   [:h2 "But..."]
   [:ul
    [:li "If nothing changes, how does anything happen?"]
    [:li "An analogy..."]]])

(def the-universe
  [:section                                                 ;{ :data-background "images/CMB_Timeline300_no_WMAP.jpg" :cite "http://map.gsfc.nasa.gov/media/060915/index.html" }
   [:h2 "The Traditional Universe"]
   [:ul
    [:li "Time flows forward like a river"]
    [:li "Things/events happen"]
    [:li "State is the management of all possible events and conditions in the universe"]
    [:li "This is the object-oriented view of reality"]]])

(def the-multiverse
  [:section                                                 ;{ :data-background "images/multiverse.jpg" :cite "http://listverse.com/2012/09/23/10-immense-things-found-in-space/" }
   [:h2 "The Multiverse"]
   [:ul
    [:li "A universe is a single, discrete, immutable value frozen in time"]
    [:li "There are infinitely many of these universes"]
    [:li "Events are &ldquo;Quantum Leaps&rdquo; into a different universe"]
    [:li "State is simply a reference to one or more universes of interest"]
    [:li "This is the functional view of reality"]]])

(def multiverse-advantages
  [:section
   [:h2 "What if things were Multiversic?"]
   [:ul
    [:li "Universes are stable"]
    [:li "It is trivial to inspect a universe"]
    [:li "Universes can share commonalities"]
    [:li "A device is needed to transit universes"]
    [:li "You must keep track of extant universes"]]])

(def this-is-fp
  [:section
   [:h2 "Multiversic = FP"]
   [:ul
    [:li "Values are stable"]
    [:li "Values are trivial to inspect and understand"]
    [:li "Values can share data"]
    [:li "Functions are the means of transitioning between values"]
    [:li "Keeping track of values is a separate concern"]]])

(def state-concerns
  [:section
   [:h2 "Concerns of State in Either Model"]
   [:ul
    [:li "Representation: How do I represent state?"]
    [:li "Transition: How do I get from one state representation to another?"]
    [:li "Management: How do I keep track of states(s) of interest?"]
    [:li "Interaction: How do I interact with my state(s) of interest?"]]])

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
     [:tr { :class :fragment } [:td "Concerns"][:td "Complected"][:td "Separated"]]]]])

(def conclusion
  [:section
   [:h2 "Conclusions on State"]
   [:ul
    [:li "OOP binds all aspects together via objects"
     [:ul
      [:li "Familiar pattern"]]]
    [:li "FP/Clojure addresses each aspect differently"
     [:ul
      [:li "Unfamiliar pattern"]]]
    [:li "The remainder of this talk will focus on how Clojure addressses these aspects"]]])

(def slides
  [[:section [:h1 "State"]]
   what-is-state
   program-state
   the-problem-of-state
   the-universe
   the-multiverse
   multiverse-advantages
   this-is-fp
   state-concerns
   comparison
   conclusion])

(reveal/write-presentation
  {:out "state.html"
   :slides slides
   :author "Mark Bastian"
   :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
   :title "Clojure: State"})

