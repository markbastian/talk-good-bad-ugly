(ns awesome.targets
  (:require [reveal.clj.core :as reveal]
            [reveal.clj.code-sample :as code-sample]))

(def header
  [:section
   [:h2 "Clojure Targets Are Awesome!"]])

(def meme
  [:section
   [:h2 "Write Code Once"]
   [:a [:img { :src "./Memes/SuccessKidClojure.jpg" }]]])

(def would-not-it-be-cool?
  [:section
   [:h2 "Wouldn't it be cool if..."]
   [:ul
    [:li "You could write code that runs on the JVM?"]
    [:li "And run as JavaScript in the browser?"]
    [:li "That would be awesome!"]]])

(def cljx
  [:section
   [:h2 "Clojure, ClojureScript, CLJX"]
   [:ul
    [:li "Clojure is a hosted Lisp on the JVM"]
    [:li "ClojureScript is a hosted Lisp that compiles to JavaScript"]
    [:li "CLJX is a Leiningen plugin that allows you to write common code to compile to both targets"]]])

(def conclusion
  [:section
   [:h2 "In Conclusion:"]
   [:h2 "Clojure Compilation Targets are Awesome!"]
   [:ul
    [:li "Why write everything twice (or more)"]
    [:li "Do it in Clojure!"]]])

(def slides
  [header
   meme
   would-not-it-be-cool?
   cljx
   conclusion])

(reveal/write-presentation
  {:out "awesome.html"
   :slides slides
   :author "Mark Bastian"
   :description "Clojure is Awesome!"
   :title "Clojure is Awesome!"})
