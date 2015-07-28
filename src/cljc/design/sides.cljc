(ns design.sides
  (:require [reveal.clj.core :as reveal]))

(def intro
  [:section
   [:h3 "Domain Modeling and API Design in Clojure"]
   [:p "Mark Bastian"]
   [:p
    [:a
     {:href "mailto:markbastian@gmail.com?Subject=Syntax"}
     "markbastian@gmail.com"]]
   [:p [:a {:href "https://twitter.com/mark_bastian" } "@mark_bastian"]]
   [:p "3/24/2015"]])

(def clojure-is-data
  [:section
   [:h2 "Clojure is a Data Language"]
   [:ul
    [:li "Code is Data"]
    [:li "Data is the API"]]])

(def steps-to-api-design
  [:section
   [:h2 "Designing an API"]
   [:ul
    [:li "Construct a scenario"]
    [:li "...as data"]
    [:li "Done!"]]])

(def data-types
  [:section
   [:h2 "Data Types (1/2 the language)"]
   [:ul
    [:li "Strings, numbers, characters, booleans, nil, keywords"]
    [:li "() - List {} [] #{}"]
    [:li "{} - Map"]
    [:li "[] - Vector"]
    [:li "#{} - Set"]]])

(def evaluation
  [:section
   [:h2 "Evaluation"]
   [:ul
    [:li "(fn a0 a1 ... an)"]
    [:li "Lists call functions of their arguments"]]])

(def heterogeneous
  [:section
   [:h2 "Clojure Collections: Nested and Heterogeneous"]
   [:ul
    [:li "Nested: Collections can contain collections"]
    [:li "Heterogeneous: Can be of any type"]]])

(def component-entity-system
  [:section
   [:h2 "Component Entity System"]
   [:ul
    [:li "Discuss the design"]]])

(def slides
  [intro
   clojure-is-data
   steps-to-api-design])

(reveal/write-presentation
  {:out "apidesign.html"
   :slides slides
   :author "Mark Bastian"
   :description "Domain Modeling and API Design in Clojure"
   :title "Clojure: API Design"})
