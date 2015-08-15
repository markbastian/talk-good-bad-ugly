(defproject
  talk-stateless-code "0.1.0-SNAPSHOT"
  :description "A set of slides about Clojure awesomeness"
  :url "https://github.com/markbastian/awesome-clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "0.0-3308"]
                 [hiccup "1.0.5"]
                 [hiccup-bridge "1.0.1"]
                 [org.clojure/data.json "0.2.5"]]

  :jar-exclusions [#"\.swp|\.swo|\.DS_Store"]
  :profiles {:uberjar {:aot :all}
             :dev {:plugins [[lein-cljsbuild "1.0.6"]
                             [org.clojure/clojurescript "0.0-3308"]]}
             :cljs {:plugins [[lein-cljsbuild "1.0.6"]] }}

  :source-paths ["src/clj" "src/cljc"]

  :clj {:builds [{ :source-paths ["src/clj" "src/cljc" "test"] }]}

  :cljsbuild {:builds [{ :source-paths ["src/cljs" "src/cljc"]
                        :compiler {
                                   :externs ["externs.js"]
                                   :output-to "presentation/js/reveal-cl.js"
                                   :optimizations :advanced
                                   :pretty-print true}}]})
