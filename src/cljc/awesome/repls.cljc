(ns awesome.repls
  (:require [reveal.clj.core :as reveal]
            [reveal.clj.code-sample :as code-sample]))

(def header
  [:section
   [:h2 "Clojure REPLs are Awesome!"]])

(def intro-to-repls
  [:section
   [:h2 "What is a REPL?"]
   [:ul
    [:li "Read-Evaluate-Print-Loop"]
    [:li "An interactive shell session"]]])

(def the-lein-repl
  [:section
   [:h2 "The Lein Repl"]
   [:ul
    [:li "lein repl"]
    [:li "Puts you in a repl for your project"]
    [:li "All your files are on your classpath"]]])

(def commands
  [:section
   [:h2 "Awesome REPL Commands"]
   [:ul
    [:li "The REPL has all kinds of cool interactive commands"]
    [:li "doc: Print documentation"]
    [:li "source: Prints the source"]
    [:li "find-doc: Find documentation with a string"]
    [:li "javadoc: Load javadoc in a browser"]
    [:li "and more..."]]])

(def repl-doc
  [:section
   [:h2 "lein: Doc"]
   (code-sample/code-block "resources/awesome/repl/doc.txt" "clojure")])

(def repl-source
  [:section
   [:h2 "lein: source"]
   (code-sample/code-block "resources/awesome/repl/source.txt" "clojure")])

(def repl-find-doc
  [:section
   [:h2 "lein: Find-doc"]
   (code-sample/code-block "resources/awesome/repl/find-doc.txt" "clojure")])

(def the-gorilla-repl
  [:section
   [:h2 "The Gorilla Repl"]
   [:ul
    [:li "lein gorilla"]
    [:li "Launches a gorilla repl at "]]])

(def conclusion
  [:section
   [:h2 "In Conclusion:"]
   [:h2 "Clojure REPLs are Awesome!"]
   [:ul
    [:li "The REPL provides and interactive environment"]
    [:li "Great for testing, prototyping, and debugging"]]])

(def slides
  [header
   intro-to-repls
   the-lein-repl
   commands
   repl-doc
   repl-source
   repl-find-doc
   the-gorilla-repl
   conclusion])

;Be sure to discuss things like doc, source, find-doc (or whatever it is), macroexpand 
; (or maybe in the homoiconicity section), etc.

(reveal/write-presentation
  {:out "awesome.html"
   :slides slides
   :author "Mark Bastian"
   :description "Clojure is Awesome!"
   :title "Clojure is Awesome!"})


