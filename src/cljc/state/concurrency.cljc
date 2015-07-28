(ns state.concurrency
  (:require [reveal.clj.core :as reveal]))

;;This needs a better bridge on the how section
(def overview
  [:section
   [:h2 "Overview"]
   [:ul
    [:li "Concurrency Primtives"
     [:ul
      [:li "Atoms"]
      [:li "Atomic retries"]
      [:li "Refs"]
      [:li "Agents"]]]
    [:li "Patterns"
     [:ul
      [:li "Mapping X -> X"]
      [:li "Mapping X -> X or nil"]
      [:li "Threading"]]]]])

(def slides
  [overview])