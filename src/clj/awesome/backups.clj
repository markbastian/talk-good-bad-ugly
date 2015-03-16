(ns awesome.backups)

(def lame-serialization
  [:section
   [:h2 "Java Serialization"]
   [:ul
    [:li "java.io.Serialization: If anything changes, you are doomed"]
    [:li "JSON/XML APIs"
     [:ul
      [:li "JAXB Serialization"
       [:ul
        [:li "Annotatate Everything!"]
        [:li "Immutable classes are very hard"]]]
      [:li "XMLStream: Works but is useless"]]]]])

(def awesome-serialization
  [:section
   [:h2 "Clojure Serialization"]
   [:ul
    [:li "Clojure is homoiconic"
     [:ul
      [:li "Code is data"]]]
    [:li "Clojure Extensible Data Notation (EDN)"
     [:ul
      [:li "Looks like JSON"]
      [:li "It's actually just Clojure data structures"]
      [:li "Trivial to adapt to classes"]
      [:li "Built in"]]]]])
