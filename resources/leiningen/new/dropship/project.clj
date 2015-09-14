(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: describe your microservice"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main ^:skip-aot {{sanitized}}.core
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [http-kit "2.1.18"]
                 [ring "1.3.2"]
                 [ring/ring-json "0.4.0"]
                 [scenic "0.2.5"]
                 [cheshire "5.5.0"]
                 [org.clojure/data.json "0.2.6"]]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :dev {:dependencies [[midje "1.6.3"]
                                  [ring-mock "0.1.5"]]
                   :plugins [[lein-midje "3.1.1"]]}})
