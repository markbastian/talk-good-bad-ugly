(ns reveal.clj.template)

(defn basic [{ :keys [slides author title description]}]
  ["<!doctype html>"
 [:html
  {:lang "en"}
  [:head
   [:meta {:charset "utf-8"}]
   [:title title]
   [:meta
    {:content description, :name "description"}]
   [:meta {:content author, :name "author"}]
   [:meta {:content "yes", :name "apple-mobile-web-app-capable"}]
   [:meta
    {:content "black-translucent",
     :name "apple-mobile-web-app-status-bar-style"}]
   [:meta
    {:content
           "width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no, minimal-ui",
     :name "viewport"}]
   [:link
    {:href "bower_components/reveal.js/css/reveal.css",
     :rel "stylesheet"}]
   [:link#theme
    {:href "bower_components/reveal.js/css/theme/default.css",
     :rel "stylesheet"}]
   "<!-- Code syntax highlighting -->"
   [:link
    {:href "bower_components/reveal.js/lib/css/zenburn.css",
     :rel "stylesheet"}]
   "<!-- Printing and PDF exports -->"
   [:script
    "\n\t\t\tvar link = document.createElement( 'link' );\n\t\t\tlink.rel = 'stylesheet';\n\t\t\tlink.type = 'text/css';\n\t\t\tlink.href = window.location.search.match( /print-pdf/gi ) ? 'css/print/pdf.css' : 'css/print/paper.css';\n\t\t\tdocument.getElementsByTagName( 'head' )[0].appendChild( link );\n\t\t"]
   "<!--[if lt IE 9]>\n\t\t<script src=\"bower_components/html5shiv/dist/html5shiv.js\"></script>\n\t\t<![endif]-->"]
  [:body
   [:div.reveal
    "<!-- Any section element inside of this container is displayed as a slide -->"
    (into [:div.slides] slides)]
   [:script {:src "bower_components/reveal.js/lib/js/head.min.js"}]
   [:script {:src "bower_components/reveal.js/js/reveal.js"}]
   [:script { :type "text/x-mathjax-config" :src "MathJax.Hub.Config({\n        tex2jax: {inlineMath: [[&quot;$&quot;,&quot;$&quot;],[&quot;\\(&quot;,&quot;\\)&quot;]]}\n      });"}]
   [:script { :type "text/javascript" :src "bower_components/MathJax/MathJax.js?config=TeX-AMS_HTML-full"}]
   [:script { :type "text/javascript" :src "js/reveal-cl.js"}]]]])

