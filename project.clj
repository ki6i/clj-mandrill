(defproject clj-mandrill "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                  [clj-http "0.5.5"]
                  [cheshire "4.0.3"]]
  :aot [clj-mandrill.interop]
  :profiles {:dev {:dependencies [[clj-http-fake "0.4.1"]]}})
