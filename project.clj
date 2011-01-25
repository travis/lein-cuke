(defproject lein-cuke "0.0.2"
  :description "Cucumber runner for leiningen"
  :repositories {"cukes" "http://cukes.info/maven"
                 "clojars" "http://clojars.org/repo"}
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [cuke4duke "0.4.3"
                  :exclusions [org.clojure/clojure
                               org.clojure/clojure-contrib]]]
  :dev-dependencies [[lein-clojars "0.5.0-SNAPSHOT"]])

