(ns state.slides
 (:require [reveal.clj.core :as reveal]
           [reveal.clj.code-sample :as c]
           [state.state :as state]
           [state.concurrency :as concurrency]
           [state.practice :as practice]
           [state.fp :as fp]))

;;FP in the small is easy
;; - persistent collections
;;   - Native in Scala, Clojure
;; - small, immutable classes
;;   - Native support in Scala () and Clojure

;;Evolution
;; - Persistent collections with functional interfaces
;; - Immutable classes - Have to give up beans
;; - Immutable state with native concurrency - Need native concurrency support

;(def the-challenge
; [:section
;  [:h2 "The Big Challenge"]
;  [:ul
;   [:li "The most confusing thing about FP"
;    [:ul
;     [:li "The world has state...."]
;     [:li "FP has no state..."]
;     [:li "What gives?"]]]
;   [:li "Patterns"
;    [:ul
;     [:li "Mapping X -> X"]
;     [:li "Mapping X -> X or nil"]
;     [:li "Threading"]]]]])

;;best practices
;;Decouple state management from value calculations

;;look for patterns in data (code) <- we are homoiconic, remember

;;Function families
;; X -> X
;; X -> binary
;; X -> or X nil (queries)

(def concerns
  [:section
   [:h2 "Separation of Concerns"]
   [:ul
    [:li "Data"]
    [:li "Functions"]
    [:li "State Management"]
    [:li "UI/UX"]]])

(def atomic-bridges
  [:section
   [:h2 "Atomic Bridges"]
   [:ul
    [:li "Clojure atoms, agents, and refs should manage all state"]
    [:li "add-watch is your friend"]
    [:li "They are the bridge"]
    [:li "All interactions are with the refs"]
    [:li "Compared to beans' complexity"]]])

(def data
  [:section
   [:h2 "Data is King"]
   [:ul
    [:li "Model everything as data"]
    [:li "Clojure Data Structures"
     [:ul
      [:li "Heterogeneous"]
      [:li "Nestable"]
      [:li "Common interfaces"]]]]])

(def data-tips
  [:section
   [:h2 "Data Modeling Tips"]
   [:ul
    [:li "Entity Maps"]
    [:li "Cycles via identifiers"]
    [:li "Use UUIDs or other unique identifiers"]
    [:li "Names make poor identifiers"]]])

(def data-2
  [:section
   [:h2 "Start with Data"]
   [:ul
    [:li "Directly model your domain"]
    [:li "The data structure will naturally evolve"]]])

(def clojure-vs
 [:section
  [:h2 "Other Languages?"]
  [:ul
   [:li "Scala"
    [:ul
     [:li "Akka"]
     [:li "Not baked in"]
     [:li "Actors"]
     [:li "STM"]]]
   [:li "Clojure"
    [:ul
     [:li "Batteries included"]]]]])

(def conclusion
 [:section
  [:h2 "In Conclusion:"]
  [:h2 "Yes, you can be stateless"]
  [:ul
   [:li "It's a different way of thinking"]
   [:li "Threading and api design"]
   [:li "Come see my other talk"]]])

(def intro
 [:section
  [:h2 "Functional Programming"]
  [:h4 "Writing Stateless Code in a Stateful World with Clojure"]
  [:p "Mark Bastian"]
  [:small [:p
   [:a
    {:href "mailto:markbastian@gmail.com?Subject=Syntax"}
    "markbastian@gmail.com"]]
  [:p [:a {:href "https://twitter.com/mark_bastian" } "@mark_bastian"]]]
  [:p "3/24/2015"]])

(def overview
 [:section
  [:h2 "Overview"]
  [:ul
   [:li "Functional Programming"]
   [:li "State and Statelessness"]
   [:li "Getting There"]
   [:li "Examples"]]])

(def canvas
  [:section
   [:h2 "Example"]
   [:div {:style  "float:left;width:400px;" }
    [:ul
     [:li "Flocking Behaviors"]
     [:li "Based on Craig Reynold's Flocking Algorithms"]
     [:li "Completely Stateless*"]]]
   [:canvas {:id "flocking-canvas" :width 400 :height 400}]
   [:script { :type "text/javascript" :src "js/flocking.js"}]
   [:script { :type "text/javascript" }
    "flocking.game_launcher.launch_app(document.getElementById(\"flocking-canvas\"), 400, 400, 20);"]
   ])

(def predator-prey
  [:section
   [:h2 "Stateless Predator Prey"]
   [:div {:style  "float:left;width:400px;" }
    [:div
    [:small [:label { :style "display: inline-block; width: 250px;" } "Initial Prey Population"]]
    [:input {:id "prey-population-slider" :type "range" :min 0 :max 500 :step 1 }]]
   [:div
    [:small [:label { :style "display: inline-block; width: 250px;" } "Initial Predator Population"]]
    [:input {:id "predator-population-slider" :type "range" :min 0 :max 500 :step 1 }]]
   [:div
    [:small [:label { :style "display: inline-block; width: 250px;" } "Reproduction Rate"]]
    [:input {:id "reproduction-rate-slider" :type "range" :min 0 :max 500 :step 1 }]]
   [:div
    [:small [:label { :style "display: inline-block; width: 250px;" } "Predation Rate"]]
    [:input {:id "predation-rate-slider" :type "range" :min 0 :max 500 :step 1 }]]
   [:div
    [:small [:label { :style "display: inline-block; width: 250px;" } "Growth Rate"]]
    [:input {:id "growth-rate-slider" :type "range" :min 0 :max 500 :step 1 }]]
   [:div
    [:small [:label { :style "display: inline-block; width: 250px;" } "Death Rate"]]
    [:input {:id "death-rate-slider" :type "range" :min 0 :max 500 :step 1 }]]]
   [:canvas {:id "rk-canvas" :width 400 :height 400 :style "border:1px solid #000000;" }]
   [:script { :type "text/javascript" :src "js/rk.js"}]
   [:script { :type "text/javascript" } "numerics.canvasui.init(document.getElementById(\"rk-canvas\"));"]])


(def overview
 [:section
  [:h2 "Overview"]
  [:ul
   [:li "A brief review of OOP"]
   [:li "Functional Programming"]
   [:li "State"]
   [:li "Evolution"]
   [:li "Examples"]
   [:li "Conclusion"]]])

;Overview -
;The Problem - The transition to FP is very difficult in part due to understanding programming with no state.
;FP is good, though, becase.... (why)
;What does it actually mean to be stateless (what)
;It can be done, though (how)
;Do I focus on Clojure or do I transition from Java -> Scala -> Clojure?
;At some point (maybe in why), discuss all of the best practice talks about immutability. Note that this flies in the face of beans+listeners, etc.
; Stage 1 - Lambdas/Closures (all with J8+)
; Stage 2 - Persistent Collections (Scala, Clojure)
; Stage 3 - Immutable classes (Scala, Clojure, Java with pain)
; Stage 4 - Concurrency primitives (Clojure only by default)
(def whats-it-about-oop
 [:section
  [:h2 "Object Oriented Programming"]
  [:h3 "A Familiar Paradigm"]
  [:ul
   [:li "Objects contain state in the form of fields"]
   [:li "Fields are generally mutable (setters)"]
   [:li "They are often observable or observed (e.g. Beans, PCLs, etc.)"]
   [:li "Wiring all of these items up produces a program"]]])

(def whats-it-about-fp
 [:section
  [:h2 "Functional Program"]
  [:h3 "A Growingly Popular Paradigm"]
  [:ul
   [:li "Computation is modeled as the application of functions to values"]
   [:li "Values = no mutable state"]
   [:li "To those new to FP, this makes NO sense"]
   [:li "How can you do anything useful if nothing changes?"]]])

;;$$ are not inline
(def equations
  [:section
   [:p "$${dR\\over dt} = \\alpha R - \\beta R F$$"]
   [:p "$$f(x) = sin(x)$$"]
   [:p "This is an equation \\({dR\\over dt} = \\alpha R - \\beta R F\\) that is inline."]])

(def functions
  [:section
   [:p "$${dR\\over dt} = \\alpha R - \\beta R F$$"]
   [:p "This is an equation \\({dR\\over dt} = \\alpha R - \\beta R F\\) that is inline."]])


(def code
  [:section
   [:h2 "Code"]
   (c/code-block "src/cljc/state/test.clj" "clj")])

(def slides
 [code
  equations
  intro
  ;whats-it-about-oop
  ;whats-it-about-fp
  canvas
  predator-prey
  data-tips
  overview
  (into [:section] fp/slides)                                  ;why? - Why FP? Maybe grab some from the FP talk.
  (into [:section] state/slides)                               ;what
  ;;Are these next two right?
  (into [:section] practice/slides)                               ;how
  (into [:section] concurrency/slides)                               ;examples?
  ;the-challenge                                             ;move
  clojure-vs                                                ;move
  conclusion])

(reveal/write-presentation
 {:out "state.html"
  :slides slides
  :author "Mark Bastian"
  :description "Functional Programming: Writing Stateless Code in a Stateful World with Clojure"
  :title "Clojure: State"})

