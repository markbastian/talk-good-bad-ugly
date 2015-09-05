(ns state.deep-mods
  (:require [reveal.clj.code-sample :as c]))

(def deep-mods
  [:section
   [:h2 "Deep Modification"]
   [:ul
    [:li "How do I modify a deeply nested field?"]]])

(def deep-mods-explained
  [:section
   [:h2 "Deep Modification"]
   [:ul
    [:li "A weakness of value classes without API support"]
    [:li "One solution: Wide and shallow"]
    [:li "Clojure collections make deep modification trivial"]]])

(def deep-mods-example
  [:section
   [:h2 "Deep Modification Problem"]
   [:div { :style "width:100%;font-size:80%;"}
    (c/code-block "resources/state/deep-struct.txt")]])

(def deep-mods-assoc
  [:section
   [:h2 "Deep Modification"]
   [:p "Replacing Earth's Status"]
   [:small { :style "width:100%;"}
    (c/code-block "resources/state/mostly-harmless-fix-1.txt")]])

(def deep-mods-update
  [:section
   [:h2 "Deep Modification"]
   [:p "Updating Earth's Status"]
   [:small { :style "width:100%;"}
    (c/code-block "resources/state/mostly-harmless-fix-2.txt")]])

(def deep-mods-update-disj
  [:section
   [:h2 "Deep Modification"]
   [:p "Removing Pluto"]
   [:small { :style "width:100%;"}
    (c/code-block "resources/state/deep-mod-disj.txt")]])

(def conclusion
  [:section
   [:h2 "Deep Modifications: Summary"]
   [:ul
    [:li "Deeply nested immutable collections can be challenging to update"]
    [:li "Java doesn't have immutable collections"]
    [:li "Scala doesn't have easy deep modification"]
    [:li "Clojure handles deep modification of immutable collections with ease"]]])

(def slides
  [[:section
    [:h1 "Modification"]
    [:h2 "Wrangling Deeply Nested Data Structures"]]
   deep-mods
   deep-mods-explained
   deep-mods-example
   deep-mods-assoc
   deep-mods-update
   deep-mods-update-disj
   conclusion])