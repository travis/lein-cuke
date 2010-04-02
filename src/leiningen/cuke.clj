(ns leiningen.cuke
  (:use  [clojure.contrib.str-utils2 :only (join)]
         [leiningen.compile :only [eval-in-project]]))


(defn jruby
  [options]
  (.run (org.jruby.Main.
         (doto (new org.jruby.RubyInstanceConfig)
           (.setEnvironment {"GEM_PATH" "lib/gems"})))
        (.split options " ")))

(defn cuke
  "Run cucumber features"
  [project & args]
  (eval-in-project
   project
   `(.run (org.jruby.Main.
           (doto (new org.jruby.RubyInstanceConfig)
             (.setEnvironment {"GEM_PATH" "lib/gems"})))
          (into-array (map str ["lib/gems/bin/cucumber" ~@args])))
   (fn [java]
     (.setFork java false))))
