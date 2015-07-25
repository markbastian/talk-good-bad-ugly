(ns awesome.concurrency
  (:require [reveal.clj.code-sample :as code-sample]
            [reveal.clj.core :as reveal]))

(def header
  [:section
   [:h2 "Clojure Concurrency is Awesome!"]])

(def meme
  [:section
   [:h2 "Java Concurrency"]
   [:a [:img { :src "./Memes/SimplyWriteConcurrent.jpg" }]]])

(def lame-concurrency
  [:section
   [:h2 "Java Concurrency"]
   [:ul
    [:li "java.util.concurrent has DOZENS of classes for concurrency"]
    [:li "java.util.concurrent.atomic"]
    [:li "java.util.concurrent.locks"]
    [:li "How do I understand this?"
     [:ul
      [:li "JCIP - 384 pages"]
      [:li "Are you kidding me?"]
      [:li "http://docs.oracle.com/cd/A97688_16/generic.903/bp/java.htm"]]]
    [:li "So not awesome!"]]])

(def awesome-concurrency
  [:section
   [:h2 "Clojure Concurrency"]
   [:ul
    [:li "Everything is immutable (implicity thread safe)"]
    [:li "3 Primitives"
     [:ul
      [:li "agents: Asynchronous & Uncoordinated"]
      [:li "atoms: Synchronous & Uncoordinated"]
      [:li "ref: Synchronous & Coordinated"]]]
    [:li "This is awesome!"]]])

(def conclusion
  [:section
   [:h2 "In Conclusion:"]
   [:h2 "Clojure Concurrency Awesome!"]
   [:ul
    [:li "Java concurrency is NOT awesome"]
    [:li "Immutability gives concurrency"]
    [:li "Clojure concurrency primitives are easy to use"]]])

(def slides
  [header
   meme
   lame-concurrency
   awesome-concurrency
   conclusion])

(reveal/write-presentation
  {:out "awesome.html"
   :slides slides
   :author "Mark Bastian"
   :description "Clojure is Awesome!"
   :title "Clojure is Awesome!"})

