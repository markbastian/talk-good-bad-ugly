(ns gbh.slides
  (:require [reveal.clj.core :as reveal]))

;Those new to the world of functional programming often find themselves stymied by the problem of managing state in a
;stateless world. You are told that functional programs should be stateless (that is, have no mutable state), and yet
;any meaningful application must have some mutable state. This session presents a technique for managing state in
;Clojure applications by walking the audience through common Clojure concurrency primitives, explaining methods for
;working with them, and demonstrating how to write applications that separate the concerns of application state and
;functional design. Audience members will leave the session with an understanding of how to write functional APIs while
;also developing rich, stateful, concurrent applications.

(def intro
  [:section { :data-background "file:./images/the-good-the-bad-and-the-ugly-t-anderson-banner.jpg"
             :data-background-size "80%"}
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
   [:h2 "Overview"]
   [:ul
    [:li "Personal History"]
    [:li "What it's all about"]
    [:li "Language Shootout"]
    [:li "Tooling Shootout"]
    [:li "Learning and Productivity"]
    [:li "Interoperability"]]])

(def history
  [:section
   [:h2 "Personal History"]
   [:ul
    [:li "Pre 2003: VBA, VB, FORTRAN, C/C++"]
    [:li "~2003: Java"]
    [:li "~2009: Scala"]
    [:li "~2013: Clojure"]]])

(def java-scala-clojure
  [:section
   [:h2 "The Contenders"]
   [:div
    [:img {:src "images/clojure-text.png" :style "position:absolute;top:60%;left:65%;"}]
    [:img {:src "images/scala.jpg" :style "position:absolute;top:60%;left:30%;"}]
    [:img {:src "images/java.png" :style "position:absolute;top:60%;left:10%;"}]]])

(def fesa
  [:section
   [:h2 "Points"]
   [:ul
    [:li "New languages are awesome (maybe)"]
    [:li "Java has issues"]
    [:li "TANSTAAFL"]
    [:li "What do you gain?"]
    [:li "What challenges might you face?"]]])

(def goals
  [:section
   [:h2 "Goals"]
   [:ul
    [:li "Learn what is awesome and not so awesome about Java, Scala, and Clojure"]
    [:li "Understand why you might want to choose one over the other"]
    [:li "Understand some of the pitfalls of interoperability"]
    [:li "Learn about tooling support and issues"]]])

(def conclusion
  [:section
   [:h2 "In Conclusion:"]
   [:ul
    [:li "You can be functional"]
    [:li "Programming with values is achievable"]
    [:li "Clojure"
     [:ul
      [:li "Extremely well designed and thought out"]
      [:li "Try it out"]
      [:li "Also hosted - use it from Java"]]]
    [:li "Come see my other talk"]]])

(def slides
  [intro
   java-scala-clojure
   overview
   history
   goals
   conclusion])

(reveal/write-presentation
  {:out "gbh.html"
   :slides slides
   :author "Mark Bastian"
   :description "The Good, the Bad and the Ugly: A Polyglot's Perspective on Java, Scala, and Clojure"
   :title "The Good, the Bad and the Ugly"})
