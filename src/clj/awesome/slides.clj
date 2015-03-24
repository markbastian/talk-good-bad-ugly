(ns awesome.slides
  (:require [awesome.collections]
            [awesome.targets]
            [awesome.concurrency]
            [awesome.homoiconicity]
            [awesome.repls]
            [reveal.clj.core :as reveal]))

(def intro
  [:section
   [:h2 "Clojure is Awesome!"]
   [:h3 "A sampling of things that make Clojure awesome"]
   [:p "Mark Bastian"]
   [:p
    [:a
     {:href "mailto:markbastian@gmail.com?Subject=Syntax"}
     "markbastian@gmail.com"]]
   [:p]
   [:p "3/24/2015"]])

(def what-is-clojure?
  [:section
   [:h2 "What is Clojure?"]
   [:ul
    [:li "A functional language hosted on the JVM"]
    [:li "A practical Lisp"]]])

(def conclusion
  [:section
   [:h2 "In Conclusion:"]
   [:h2 "Clojure is Awesome!"]
   [:ul
    [:li "Do you want to be awesome?"]
    [:li "Try Clojure!"]]])

(def slides
  [intro
   what-is-clojure?
   (into [:section] awesome.collections/slides)
   (into [:section] awesome.targets/slides)
   (into [:section] awesome.homoiconicity/slides)
   (into [:section] awesome.concurrency/slides)
   (into [:section] awesome.repls/slides)
   conclusion])

(reveal/write-presentation
  {:out "awesome.html"
   :slides slides
   :author "Mark Bastian"
   :description "Clojure is Awesome!"
   :title "Clojure is Awesome!"})
