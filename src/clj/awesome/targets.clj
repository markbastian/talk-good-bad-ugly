(ns awesome.targets
  (:require [reveal.clj.core :as reveal]
            [reveal.clj.code-sample :as code-sample]))

(def header
  [:section
   [:h2 "Clojure Targets Are Awesome!"]])

(def meme
  [:section
   [:h2 "Homoiconicity"]
   [:a [:img { :src "./Memes/CodeIsData.jpg" }]]])

(def would-not-it-be-cool?
  [:section
   [:h2 "Wouldn't it be cool if..."]
   [:ul
    [:li "You could write code that runs on the JVM?"]
    [:li "And run as JavaScript in the browser?"]
    [:li "That would be awesome!"]]])

(def conclusion
  [:section
   [:h2 "In Conclusion:"]
   [:h2 "Clojure Compilation and Transformation Targets are Awesome!"]
   [:ul
    [:li "Remember, Clojure is homoiconic:"
     [:ul
      [:li "Code is data; data is code"]
      [:li "It's easy to transform data (hence code)"]]
     [:li "What would it take to do this in Java?"]]]])

(def slides
  [header
   meme
   would-not-it-be-cool?
   conclusion])

(reveal/write-presentation
  {:out "awesome.html"
   :slides slides
   :author "Mark Bastian"
   :description "Clojure is Awesome!"
   :title "Clojure is Awesome!"})
