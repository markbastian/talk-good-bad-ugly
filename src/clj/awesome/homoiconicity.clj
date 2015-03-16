(ns awesome.homoiconicity
  (:require [reveal.clj.code-sample :as code-sample]
            [reveal.clj.core :as reveal]))

(def header
  [:section
   [:h2 "Clojure Homoiconicity is Awesome!"]])

(def meme
  [:section
   [:h2 "Homoiconicity"]
   [:a [:img { :src "./Memes/CodeIsData.jpg" }]]])

(def definition
  [:section
   [:h2 "What is Homoiconicity?"]
   [:ul
    [:li "Homoiconic code is represented in its own data structures"]
    [:li "Is the following code or data?"]]
   (code-sample/code-block "resources/awesome/homoiconicity/code-or-data.txt" "clojure")])

(def code-as-data-macros
  [:section
   [:h2 "Code as Data: Macros"]
   [:ul
    [:li "What do you do with data?"
     [:ul
      [:li "Manipulate, transform, analyze"]]]
    [:li "If code is data, I can..."
     [:ul
      [:li "Manipulate, transform, and analyze it"]
      [:li "This is what macros are all about"]]]]])

(def a-simple-macro
  [:section
   [:h2 "A Simple Macro"]
   [:ul
    [:li "Tired of printlns everywhere?"]
    [:li "Check this out..."]]
   (code-sample/code-block "resources/awesome/homoiconicity/macro.txt" "clojure")])

(def code-as-data-formats
  [:section
   [:h2 "Code as Data: Data Formats"]
   [:ul
    [:li "What else do you do with data?"
     [:ul
      [:li "Manipulate, transform, analyze"]
      [:li "Serialize, deserialize"]
      [:li "This is what XML and JSON are all about"]
      [:li "HTML documents are also data"]]]
    [:li "If code is data, I can..."
     [:ul
      [:li "Easily convert my code to a different data or document format"]]]]])

(def clojure-is-json
  [:section
   [:h3 "Clojure is JSON"]
   [:p "Clojure"]
   (code-sample/code-block "resources/awesome/targets/json.txt" "clojure")
   [:a { :href "https://github.com/clojure/data.json" } "https://github.com/clojure/data.json"]])

(def clojure-is-html
  [:section
   [:h3 "Clojure is HTML"]
   [:p "Clojure"]
   (code-sample/code-block "resources/awesome/targets/html.txt" "clojure")
   [:ul
    [:li [:a { :href "https://github.com/weavejester/hiccup" } "https://github.com/weavejester/hiccup"]]
    [:li [:a { :href "https://github.com/hozumi/hiccup-bridge" } "https://github.com/hozumi/hiccup-bridge"]]]])

(def conclusion
  [:section
   [:h2 "In Conclusion:"]
   [:h2 "Clojure Homoiconicity is Awesome!"]
   [:ul
    [:li "With Homoiconicity:"
     [:ul
      [:li "Code is data; data is code"]
      [:li "It's easy to transform data (hence code)"]]
     [:li "What would it take to do this in Java?"]]]])

;http://stackoverflow.com/questions/3159836/is-there-a-way-to-get-a-collection-of-clojure-special-forms-programatically

(def slides
  [header
   meme
   definition
   code-as-data-macros
   a-simple-macro
   code-as-data-formats
   clojure-is-json
   clojure-is-html
   conclusion])

(reveal/write-presentation
  {:out "awesome.html"
   :slides slides
   :author "Mark Bastian"
   :description "Clojure is Awesome!"
   :title "Clojure is Awesome!"})
