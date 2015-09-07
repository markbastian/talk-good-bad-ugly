(ns gbh.tooling
  (:require [reveal.clj.core :as reveal]))

(def tooling
  [:section
   [:h2 "Aspects of Tooling"]
   [:ul
    [:li "Integrated Development Environments"]
    [:li "Build Tools"]
    [:li "REPLs"]]])

(def ides
  [:section
   [:h2 "Integrated Development Environment (IDE)"]
   [:ul
    [:li "Arguably a developer's best friend"]
    [:li "Auto-completion"]
    [:li "Project management and tasking"]
    [:li "Various executions and tasks"]
    [:li "How do they support different languages?"]]])

(def ides-eclipse
  [:section
   [:h2 "IDEs: Eclipse"]
   [:ul
    [:li "First one I used"]
    [:li "Arguably the most popular free IDE"]
    [:li "RCP is reviled"]
    [:li "Excellent Java support, but no implicit Maven support"]
    [:li "Early Scala plugin was very, very slow and memory intensive"]
    [:li "False Scala errors"]
    [:li "Current Scala and Clojure (Counterclockwise) plugins are good"]]])

(def ides-netbeans
  [:section
   [:h2 "IDEs: NetBeans"]
   [:ul
    [:li "Native pom support"]
    [:li "Best RCP platform"]
    [:li "False errors when invoking Scala"]
    [:li "Poorly supported Scala plugin"]
    [:li "No working Clojure plugin for current version of NB"]]])

(def ides-intellij-idea
  [:section
   [:h2 "IDEs: IntelliJ IDEA"]
   [:ul
    [:li "Awesome support for Java, Scala, and Clojure"]
    [:li "Understands build.xml, pom.xml, build.sbt, project.clj"]
    [:li "Java out of the box"]
    [:li "Top-notch Scala plugin"]
    [:li "Excellent free Clojure plugin (https://cursiveclojure.com)"]]])

(def ides-summary
  [:section
   [:h2 "IDEs Summary"]
   [:table
    [:thead [:tr [:th "IDE"][:th "Java"][:th "Scala"][:th "Clojure"]]]
    [:tbody
     [:tr [:td "Eclipse"][:td "Yes"][:td "Yes"][:td "Yes"]]
     [:tr [:td "NetBeans"][:td "Yes"][:td "OK"][:td "No"]]
     [:tr [:td "IntelliJ"][:td "Excellent"][:td "Excellent"][:td "Excellent"]]
     [:tr [:td "Emacs"][:td "No"][:td "No"][:td "Excellent"]]]]])

(def repls
  [:section
   [:h2 "Read-Evaluate Print Loops"]
   [:ul
    [:li "Another way to develop"]
    [:li "Interactive sessions"]
    [:li "You type commands, they execute immediately"]
    [:li "Scala and Clojure have exellent REPL support"
     [:ul
      [:li "Eclipse"]
      [:li "IntelliJ"]
      [:li "Emacs"]
      [:li "Command Line"]]]
    [:li "Rumored Java REPL coming"]]])

(def build-tools
  [:section
   [:h2 "Build Tools"]
   [:ul
    [:li "Ant"]
    [:li "Maven"]
    [:li "SBT"]
    [:li "Leiningen (Lein)"]
    [:li "REPL"]]])

(def ant
  [:section
   [:h2 "Ant"]
   [:h1 { :class :fragment } "Don't"]])

(def maven
  [:section
   [:h2 "Maven"]
   [:ul
    [:li "Excellent"]
    [:li "Complicated"]
    [:li "Very large pom.xml files"]]])

(def sbt
  [:section
   [:h2 "Simple Build Tool (SBT)"]
   [:ul
    [:li "Anything but simple"]
    [:li "fseaae"]]])

(def lein
  [:section
   [:h2 "Leiningen (Lein)"]
   [:ul
    [:li "Awesome!"]
    [:li "project file is written in Clojure (homoiconicity FTW!)"]
    [:li "Generates pom.xml if desired"]]])

(def slides
  [[:section [:h1 "Tooling"]]
   tooling
   ides
   ides-eclipse
   ides-netbeans
   ides-intellij-idea
   ides-summary
   repls
   build-tools
   ant
   maven
   sbt
   lein])

(reveal/write-presentation
  {:out "gbh.html"
   :slides slides
   :author "Mark Bastian"
   :description "The Good, the Bad and the Ugly: A Polyglot's Perspective on Java, Scala, and Clojure"
   :title "The Good, the Bad and the Ugly"})
