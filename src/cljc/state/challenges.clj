(ns state.challenges
  (:require [reveal.clj.core :as reveal]
            [reveal.clj.code-sample :as c]
            [clojure.pprint :as pp]))

(def the-barriers
  [:section
   [:h2 "The Barriers"]
   [:ul
    [:li "Immubility"]
    [:li "Deep Modification"]
    [:li "Cyclical Relationships"]
    [:li "Application State"]]])

(def immutability
  [:section
   [:h2 "Immutability"]
   [:ul
    [:li "If nothing changes, how do you do anything?"]]])

(def deep-mods
  [:section
   [:h2 "Deep Modification"]
   [:ul
    [:li "How do I modify a deeply nested field?"]]])

(def deep-mods-explained
  [:section
   [:h2 "Deep Modification"]
   [:ul
    [:li "A weakness of value types without API support"]
    [:li "One solution: Wide and shallow"]
    [:li "Clojure collections make deep modification trivial"]]])

(def deep-mods-example
  [:section
   [:h2 "Deep Modification Problem"]
   (c/code-block "resources/state/deep-struct.txt")])

(def deep-mods-assoc
  [:section
   [:h2 "Deep Modification"]
   [:p "Replacing Earth's Status"]
   [:small { :style "width:100%;"} (c/code-block "resources/state/mostly-harmless-fix-1.txt")]])

(def deep-mods-update
  [:section
   [:h2 "Deep Modification"]
   [:p "Updating Earth's Status"]
   [:small { :style "width:100%;"} (c/code-block "resources/state/mostly-harmless-fix-2.txt")]])

(def deep-mods-update-disj
  [:section
   [:h2 "Deep Modification"]
   [:p "Removing Pluto"]
   [:small { :style "width:100%;"} (c/code-block "resources/state/deep-mod-disj.txt")]])

(def cycles
  [:section
   [:h2 "Immutable Cyclical References"]
   [:ul
    [:li "How can immutable interdependent relationships be created"]]])

(def application-state
  [:section
   [:h2 "Application State"]
   [:ul
    [:li "How can an application maintain complex state over time?"]
    [:li "Is this the same as Immutability?"]]])

(def cycles-explained
  [:section
   [:h2 "Immutable Cyclical References"]
   [:div
    [:div {:style  "float:left;width:48%;" }
     [:ul
      [:li "Parent-Child"]
      [:li "Ownership"]
      [:li "You can't easily update both entities"]
      [:li "In mutable OOP this is a trivial issue"]
      [:li "...but it adds complexity"
       [:ul
        [:li "Serialization"]
        [:li "3rd Party Registrar"]]]]]
    [:div {:style  "float:right;width:48%;" }
     [:img {:src "images/bidi-mutable-band.jpg" } ]]]])

(def cycles-solution
  [:section
   [:h2 "Immutable Cyclical References"]
   [:div
    [:div {:style  "float:left;width:43%;" }
     [:ul
      [:li "Create an entity map"]
      [:li "Use unique IDs for each entity"]
      [:li "Now updates are decoupled"]]]
    [:div {:style  "float:right;width:55%;" }
     (c/code-block "resources/state/vhorig-tall.txt")]]])

(def cycles-code
  [:section
   [:h2 "Constructing Models with Cycles"]
   (c/code-block "resources/state/vhorig.txt")])

(def cycles-update
  [:section
   [:h2 "Updating Immutable Cycles"]
   (c/code-block "resources/state/band-add-remove.txt")])

(def cycles-in-use
  [:section
   [:h2 "Cycles in Action"]
   (c/code-block "resources/state/cycles-repl.txt")])

(def cycles-tips
  [:section
   [:h2 "Tips With Cyclic References"]
   [:ul
    [:li "Do you need a cyclical relationship?"]
    [:li "Keys should be invariant over all time"
     [:ul
      [:li "Names are horrible keys"]
      [:li "UUIDs make good keys"]]]
    [:li "Don't fear heterogeneous keys"]]])

(def slides
  [[:section
    [:h1 "Challenges"]
    [:h2 "Common barriers to functional thinking"]]
   the-barriers
   immutability
   deep-mods
   deep-mods-explained
   deep-mods-example
   deep-mods-assoc
   deep-mods-update
   deep-mods-update-disj
   cycles
   cycles-explained
   cycles-solution
   cycles-code
   cycles-update
   cycles-in-use
   cycles-tips])

;Key concept is that all interactions are through refs

(reveal/write-presentation
  {:out "state.html"
   :slides slides
   :author "Mark Bastian"
   :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
   :title "Clojure: State"})