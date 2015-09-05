(ns state.immutability
  (:require [reveal.clj.core :as reveal]
            [reveal.clj.code-sample :as c]))

(def immutability-discussion
  [:section
   [:h2 "Immutability: It's Effective"]
   [:ul
    [:li "Override equals for logical equality"]
    [:li "Override hashCode when you override equals"]
    [:li "Minimize mutability"]
    [:li "Hashcodes that change with state are very bad"]
    [:li "An example..."]]])

(def canonical-mutable-java
  [:section
   [:h2 "Canonical Mutable Class"]
   [:div
    [:div {:style "float:left;width:50%;" }
     [:ul
      [:li "Private fields"]
      [:li "getters/setters"]
      [:li "No equality semantics"]
      [:li "Beware of mutating hashcodes"]]]
    [:div {:style  "float:right;width:50%;font-size:80%" }
     (c/code-block "resources/state/MutablePerson.txt")]]])

(def canonical-mutable-java-hashcode-equals
  [:section
   [:h2 "Adding Hashcode and Equals"]
   [:p "Because people have logical equality"]
   [:div
    [:div {:style  "float:left;width:50%;font-size:60%" }
     (c/code-block "resources/state/MutablePersonHCE.txt")]
    [:div {:style  "float:right;width:50%;font-size:65%" }
     (c/code-block "resources/state/HashCodeFail.txt")]]])

(def canonical-immutable-java
  [:section
   [:h2 "Canonical Immutable (Value) Class"]
   [:div
    [:div {:style "float:left;width:50%;" }
     [:ul
      [:li "All fields final"]
      [:li "Single constructor"]
      [:li "Equals and hashCode"]
      [:li "Just like Effective Java"]
      [:li "How do I change anything?"]
      [:li "What about beans/change events?"
       [:ul
        [:li "Addressed later"]]]]]
    [:div {:style  "float:right;width:50%;font-size:45%" }
     (c/code-block "resources/state/ImmutablePerson.txt")]]])

(def immutable-java-updates
  [:section
   [:h2 "Updating Value Classes"]
   [:div
    [:div {:style "float:left;width:50%;" }
     [:ul
      [:li "Destructive updates"]
      [:li "One per updatable field"]]]
    [:div {:style  "float:right;width:50%;font-size:60%" }
     (c/code-block "resources/state/ImmutablePersonMutators.txt")]]])

(def tedious-immutable-java
  [:section
   [:h2 "Challenges of Value Classes in Java"]
   [:ul
    [:li "Lots of code generation"]
    [:li "Error prone"]]])

(def updates-in-scala
  [:section
   [:h2 "Value Types: Scala Case Classes"]
   [:div {:style  "width:100%;font-size:80%" }
    (c/code-block "resources/state/ScalaCaseClasses.txt")]
   [:ul
    [:li "Hashcode/Equals auto-generated"]
    [:li "@BeanProperty annotation generates getter"]
    [:li "Auto-generation of copy methods"]]])

(def updates-in-clojure
  [:section
   [:h2 "Values Types: Clojure Records"]
   [:div
    [:div {:style  "float:left;width:50%;" }
     [:ul
      [:li "Creates a Java class"]
      [:li "Hashcode/Equals auto-generated"]
      [:li "Same methods for classes as collections"
       [:ul
        [:li "assoc"]
        [:li "update"]
        [:li "into"]
        [:li "dissoc"]]]
      [:li "Despite all this coolness, we usually just use maps"]]]
    [:div {:style  "float:right;width:50%;font-size:80%" }
     (c/code-block "resources/state/ClojureRecords.txt")]]])

(def beyond-value-classes
  [:section
   [:h2 "Beyond Value Classes"]
   [:ul
    [:li "If you believe in immutability it doesn't stop with classes"]
    [:li "You need immutable collections"]
    [:li "No support in Java"]
    [:li "Full support in Scala and Clojure"]]])

(def immutability-how
  [:section
   [:h2 "Immutability: Summary"]
   [:ul
    [:li "Value classes are possible in any language"]
    [:li "The key concept is destructive updates"]
    [:li "Some languages implementations require more care than others"]]])

(def slides
  [[:section
    [:h1 "Immutability"]
    [:h2 "If nothing changes, how do you do anything?"]]
   immutability-discussion
   canonical-mutable-java
   canonical-mutable-java-hashcode-equals
   canonical-immutable-java
   immutable-java-updates
   tedious-immutable-java
   updates-in-scala
   updates-in-clojure
   immutability-how
   beyond-value-classes])

(reveal/write-presentation
  {:out "state.html"
   :slides slides
   :author "Mark Bastian"
   :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
   :title "Clojure: State"})