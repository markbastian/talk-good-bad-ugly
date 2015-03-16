(ns awesome.collections
  (:require [reveal.clj.code-sample :as code-sample]
            [reveal.clj.core :as reveal]))

(def header
  [:section [:h2 "Clojure Collections Are Awesome!"]])

(def meme
  [:section
   [:h2 "Java Collections"]
   [:a [:img { :src "./Memes/CollectionLiterals.jpg" }]]])

(def collection-representation
  [:section
   [:h2 "Clojure Collections Representation"]
   [:ul
    [:li "Clojure collections have a very simple representation"]
    [:li "This makes them very easy to read and work with"]]])

(def collection-are-java
  [:section
   [:h3 "Clojure Collections are Java Collections"]
   (code-sample/code-block "resources/awesome/collections/are-java.txt" "java")
   [:p "Note: Read Only"]])

(def collection-init
  [:section
   [:h2 "Syntax: Collection Initialization"]
   [:p "Java"]
   (code-sample/code-block "resources/awesome/collections/jcollectioninit.txt" "java")
   [:p "Clojure"]
   (code-sample/code-block "src/clj/no_syntax/examples/collection_init.clj" "clojure")])

(def collection-addition-java
  [:section
   [:h2 "Java Collection Initialization"]
   (code-sample/code-block "resources/awesome/collections/jcollectionaddition.txt" "java")])

(def collection-addition-not-java
  [:section
   [:h2 "Clojure Collection Initialization"]
   [:p "Clojure"]
   (code-sample/code-block "src/clj/no_syntax/examples/collection_addition.clj" "clojure")
   [:ul
    [:li "Inlining like this is called a &quot;collection literal&quot;"]
    [:li "Scala also has collection literals"]
    [:li "Sorry, Java"]]])

(def collection-overview
  [:section
   [:h2 "Clojure Collections API"]
   [:ul
    [:li "Clojure collections have a unified API"]
    [:li "Common Clojure data structures are:"
     [:ul
      [:li "Nested: It is common for collections to be collections of collections"]
      [:li "Functions: vectors, sets, and vectors are functions"]
      [:li "Heterogeneous: Collection elements can be of any type"]]]
    [:li "Note: Lists are different"]
    [:ul
     [:li "They are rarely used to represent data"]
     [:li "They are used to represent code"]]]])

(def unified-interface-for-updates
  [:section
   [:h2 "Unified Interface for Updates"]
   [:p "Clojure"]
   (code-sample/code-block "resources/awesome/collections/conj.txt" "clojure")
   [:p "One function for &quot;efficient&quot; collection addition"]])

(def unified-interface-for-gets
  [:section
   [:h2 "Unified Interface for Gets"]
   [:p "Clojure"]
   (code-sample/code-block "resources/awesome/collections/get.txt" "clojure")
   [:p "Same interface for any random access data structure"]])

(def reasonable-failure-nil
  [:section
   [:h2 "Unified Interface for Failure"]
   [:p "Clojure"]
   (code-sample/code-block "resources/awesome/collections/get-nil.txt" "clojure")
   [:ul
    [:li "If something is missing, return nil"]
    [:li "Clojure nil is Java null"]
    [:li "No NPEs!"]]])

(def reasonable-failure-default
  [:section
   [:h2 "Unified Interface for Defaults"]
   [:p "Clojure"]
   (code-sample/code-block "resources/awesome/collections/get-default.txt" "clojure")
   [:p "Get takes an optional final argument to return when the item is missing from the collection"]])

(def nested-data-gets
  [:section
   [:h2 "Nested Heterogeneous Data"]
   [:p "Clojure"]
   (code-sample/code-block "resources/awesome/collections/nested.txt" "clojure")
   [:ul
    [:li "I can flexibly define my data any way I want"]
    [:li "Complex access is trivial using get-in"]
    [:li "No NPEs!"]
    [:li "I can provide defaults when data is missing"]]])

(def nested-data-updates
  [:section
   [:h2 "Nested Heterogeneous Data: Updating"]
   [:p "Clojure"]
   (code-sample/code-block "resources/awesome/collections/nested-updates.txt" "clojure")
   [:ul
    [:li "I can update complex data structures using a unified API"]
    [:li "assoc = associate: Add or replace a value"]
    [:li "update: Update a value via a function"]
    [:li "Provided path works for any random access data structure"]]])

(def nested-data-homoiconic
  [:section
   [:h3 "Nested Heterogeneous Data: Serialization"]
   [:p "Clojure"]
   (code-sample/code-block "resources/awesome/collections/data-serialized.txt" "clojure")
   [:ul
    [:li "Clojure data and code are represented identically (homoiconicity)"]
    [:li "A simple consequence of this is that serialization is trival"]
    [:li "Note: clojure.edn/read-string won't execute code"]]])

(def conclusion
  [:section
   [:h2 "In Conclusion:"]
   [:h2 "Clojure Collections are Awesome!"]
   [:ul
    [:li "There's more; For example:"
     [:ul
      [:li "Clojure collections are Java read-only collections"]
      [:li "There are tons of functions for using collections"]]
     [:li "But I can't cover everything here"]]]])

;http://www.lispcast.com/3-things-java-can-steal-from-clojure
;
;Full talk?
; Can be used in Java
; EDN
; more examples
; edn with non-primitives
; Make points on what scala and java don't have 
; More examples of functions, such as map, zipmap, etc.

(def slides
  [header
   meme
   collection-representation
   collection-are-java
   collection-init
   collection-addition-java 
   collection-addition-not-java
   collection-overview
   unified-interface-for-updates
   unified-interface-for-gets
   reasonable-failure-nil
   reasonable-failure-default
   nested-data-gets
   nested-data-updates
   nested-data-homoiconic
   conclusion])

(reveal/write-presentation
  {:out "awesome.html"
   :slides slides
   :author "Mark Bastian"
   :description "Clojure is Awesome!"
   :title "Clojure is Awesome!"})
