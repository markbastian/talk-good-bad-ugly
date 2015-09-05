(defproject
  talk-good-bad-ugly "0.1.0-SNAPSHOT"
  :description "The Good, The Bad, and The Ugly - A Polyglot's Perspective on Java, Scala, and Clojure"
  :url "https://github.com/markbastian/talk-good-bad-ugly"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.48"]
                 [hiccup "1.0.5"]
                 [hiccup-bridge "1.0.1"]
                 [org.clojure/data.json "0.2.5"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]]

  :jar-exclusions [#"\.swp|\.swo|\.DS_Store"]
  :profiles {:uberjar {:aot :all}
             :dev {:plugins [[lein-cljsbuild "1.0.6"]
                             [org.clojure/clojurescript "1.7.48"]
                             [lein-figwheel "0.3.7"]
                             [lein-scalac "0.1.0"]]}
             :cljs {:plugins [[lein-cljsbuild "1.0.6"]
                              [lein-figwheel "0.3.7"]] }}

  :source-paths ["src/clj" "src/cljc"]
  :java-source-paths ["src/java"]
  :scala-source-paths ["src/scala"]

  :clj {:builds [{ :source-paths ["src/clj" "src/cljc" "test"] }]}

  :cljsbuild {:builds [{ :source-paths ["src/cljs" "src/cljc"]
                        :compiler {
                                   :externs ["externs.js"]
                                   ;:output-to "presentation/js/reveal-cl.js"
                                   :optimizations :advanced
                                   :pretty-print true}}]})
