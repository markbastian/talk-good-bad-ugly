(ns reveal.clj.code-sample
  (:require [hiccup.util]
            [clojure.repl :as r]
            [clojure.repl :as r]))

(defn from-string [sample-str]
  (hiccup.util/escape-html
    (let [lines (clojure.string/split-lines sample-str)
          s (rest (drop-while #(-> % (.contains "Example Start") not) lines))]
      (if (empty? s)
        sample-str
        (reduce
          #(str %1 "\n" %2)
          (take-while #(-> % (.contains "Example End") not) s))))))

(defn from-file [file-name] (from-string (slurp file-name)))

(defn code-block [file-name language]
  [:pre
   [:code
    {:contenteditable "contenteditable", :data-trim "data-trim" :class language}
    (from-file file-name)]])

;(prn (escape-html "MathJax.Hub.Config({
;        tex2jax: {inlineMath: [[\"$\",\"$\"],[\"\\(\",\"\\)\"]]}
;      });"))
;
;(prn "$$\\mathbf{W}_{f}$$")