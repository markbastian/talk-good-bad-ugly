(ns reveal.cljs.reveal-bridge)

;(set! (.-onkeyup line1-field) #(validate-line line1-field line1-out :line1))

;(def math-conf (clj->js { :tex2jax { :inlineMath [[\\"$\\",\\"$\\"],[\\"\\(\\",\\"\\)\\"]]} }))

;(set! (.-config js/MathJax) math-conf)

(.initialize
  js/Reveal
  (clj->js {
   :controls true
   :progress true
   :history true
   :center true
   :transition "slide"
   :dependencies
   [{:src "bower_components/reveal.js/lib/js/classList.js" :condition #(-> js/document .-body .-classList not)}
   {:src "bower_components/reveal.js/plugin/markdown/marked.js" :condition #(-> js/document (.querySelector "[data-markdown]") not not)}
   {:src "bower_components/reveal.js/plugin/markdown/markdown.js" :condition #(-> js/document (.querySelector "[data-markdown]") not not)}
   { :src "bower_components/reveal.js/plugin/highlight/highlight.js"
     :async true
     :condition (fn [] (.querySelector js/document "pre code"))
     :callback (fn [] (.initHighlightingOnLoad js/hljs)) }
   {:src "bower_components/reveal.js/plugin/zoom-js/zoom.js" :async true}
   {:src "bower_components/reveal.js/plugin/notes/notes.js" :async true}]
   }))