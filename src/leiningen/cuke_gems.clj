(ns leiningen.cuke-gems
  (:use [leiningen.cuke :only [jruby]]))

(defn cuke-gems
  "Run cucumber features"
  [project]
  (jruby "-S gem install -i lib/gems --no-rdoc --no-ri cucumber"))
