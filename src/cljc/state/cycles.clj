(ns state.cycles
  (:require [reveal.clj.code-sample :as c]))

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

(def conclusion
  [:section
   [:h2 "Cycles: Summary"]
   [:ul
    [:li "Don't just use this pattern with cyclic graphs for value classes"]
    [:li "Loosely coupling objects via IDs is a good solution in many instances"]
    [:li "Java and Scala require homogeneous keys and values"]
    [:li "Clojure's support for heterogeneity makes this pattern simple"]]])

(def slides
  [[:section
    [:h1 "Cycles"]
    [:h2 "Dealing with Recursive Data"]]
   cycles-explained
   cycles-solution
   cycles-code
   cycles-update
   cycles-in-use
   cycles-tips
   conclusion])
