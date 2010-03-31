(ns leiningen.cuke
  (:use  [clojure.contrib.str-utils2 :only (join)]))

(defn jruby
  [options]
  (.run (org.jruby.Main.
         (doto (new org.jruby.RubyInstanceConfig)
           (.setEnvironment {"GEM_PATH" "lib/gems"})))
        (.split options " ")))

(defn cuke
  "Run cucumber features"
  [project & args]
  (jruby (join " " (cons "lib/gems/bin/cucumber" args))))
