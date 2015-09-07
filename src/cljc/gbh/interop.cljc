(ns gbh.interop
  (:require [reveal.clj.core :as reveal]))

(def intro
  [:section
   [:h2 "The Good, the Bad and the Ugly"]
   [:h4 "A Polyglot's Perspective on Java, Scala, and Clojure"]
   [:p "Mark Bastian"]
   [:small [:p
            [:a
             {:href "mailto:markbastian@gmail.com?Subject=Good, Bad, Ugly Talk"}
             "markbastian@gmail.com"]]
    [:p [:a {:href "https://twitter.com/mark_bastian" } "@mark_bastian"]]]
   [:p "10/26/15"]])

(def overview
  [:section
   [:h1 "Interoperability"]
   [:h2 "How well do they play together?"]])

(def recommendations
  [:section
   [:h2 "Recommendations"]
   [:ul
    [:li "Never mix languages in a project"
     [:ul
      [:li "Caveat: Clojure as a scripting environment"]
      [:li "Clojure ingest and bridge file is just OK"]]]]])

(def java-from-clojure
  [:section
   [:h2 "Calling Java from Clojure"]
   [:ul
    [:li "Easy"]
    [:li "Varags require array wrapping"]]])

(def clojure-from-java
  [:section
   [:h2 "Calling Clojure from Java"]
   [:ul
    [:li "3 ways to do it"]
    [:li "AOT: It's Java"]
    [:li "RT"]
    [:li "Clojure collections are Java collections"
     [:ul
      [:li "Read only"]
      [:li "No generics - do a cast"]]]
    [:li "or are there two ways?"]]])

(def java-from-scala
  [:section
   [:h2 "Calling Java from Scala"]
   [:ul
    [:li "Easy"]
    [:li "Java Collections require JavaConversions for implicit usage"]]])

(def scala-from-java
  [:section
   [:h2 "Calling Scala from Java"]
   [:ul
    [:li "Ugh"]
    [:li "MODULE$"]
    [:li "Commonly named class, object, and trait"]
    [:li "Collections are completely different"]
    [:li "traits do not carry implementations - they are just interfaces"]
    [:li "Implicit arguments are lost"]
    [:li "AbstractFunctionX for closures"]]])

(def slides
  [overview
   java-from-scala
   scala-from-java
   java-from-clojure
   clojure-from-java
   recommendations])

(reveal/write-presentation
  {:out "gbh.html"
   :slides slides
   :author "Mark Bastian"
   :description "The Good, the Bad and the Ugly: A Polyglot's Perspective on Java, Scala, and Clojure"
   :title "The Good, the Bad and the Ugly"})