(defproject awesome-clojure "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2657"]
                 ;https://github.com/weavejester/hiccup
                 [hiccup "1.0.5"]
                 [hiccup-bridge "1.0.1"]
                 [org.clojure/data.json "0.2.5"]]

  :prep-tasks [["cljx" "once"]]
  :source-paths ["src/clj"]
  :profiles {:dev {:plugins [[org.clojure/clojurescript "0.0-2657"]
                             [com.keminglabs/cljx "0.5.0"]
                             [lein-cljsbuild "1.0.4"]
                             [codox "0.8.10"]
                             ;[lein-autodoc "0.9.0"]
                             ]
                   :aliases {"cleantest" ["do" "clean," "cljx" "once," "test," "cljsbuild" "test"]}}
             :cljs {:plugins [[lein-cljsbuild "1.0.4"]]}}

  :clj {:builds [{:source-paths ["src/clj" "target/classes" ;"target/test-classes"
                                 ]}]}

  :cljsbuild {:builds [{:source-paths ["src/cljs" "target/classes" ;"target/test-classes"
                                       ]
                        :compiler {
                                   :foreign-libs [{:file "resources/bower_components/reveal.js/js/reveal.min.js" :provides ["Reveal"] }
                                                  {:file "resources/bower_components/reveal.js/plugin/highlight/highlight.js" :provides ["hljs"] }]
                                   :externs ["externs.js"]
                                   :output-to "presentation/js/reveal-cl.js"
                                   :optimizations :advanced
                                   :pretty-print true}}]}

  :cljx {:builds [{:source-paths ["src/cljx"]
                   :output-path "target/classes"
                   :rules :clj}

                  {:source-paths ["src/cljx"]
                   :output-path "target/classes"
                   :rules :cljs}

                  {:source-paths ["test/cljx"]
                   :output-path "target/test-classes"
                   :rules :clj}

                  {:source-paths ["test/cljx"]
                   :output-path "target/test-classes"
                   :rules :cljs}]})
