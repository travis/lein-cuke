(ns leiningen.cuke)

(defn jruby
  [options]
  (.run (org.jruby.Main.
         (doto (new org.jruby.RubyInstanceConfig)
           (.setEnvironment {"GEM_PATH" "lib/gems"})
           )
         )
        (.split options " ")
        )
  )

(defn cuke
  "Run cucumber features"
  [project]
  (jruby "lib/gems/bin/cucumber")
  )