(ns reveal.clj.code-sample
  (:require [hiccup.util]))

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

(defn code-block
  ([file-name]
   [:pre
    [:code
     {:contenteditable "contenteditable", :data-trim "data-trim"}
     (from-file file-name)]])
  ([file-name style]
   [:pre style
    [:code
     {:contenteditable "contenteditable", :data-trim "data-trim"}
     (from-file file-name)]]))