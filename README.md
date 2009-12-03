# lein-cuke

lein-cuke is a [Leiningen](http://github.com/technomancy/leiningen) plugin that provides
[Cucumber](http://cukes.info) support via [cuke4duke](http://github.com/aslakhellesoy/cuke4duke)

## Installation

   Add something like `[lein-cuke "0.0.1-SNAPSHOT"]` to the `:dev-dependencies` block in your project.clj, like:

    (defproject pickles "0.0.1"
      :description "Vinegar + cucumber + time"
      :repositories [["clojars" "http://clojars.org/repo"]]
      :dev-dependencies [[lein-cuke "0.0.1-SNAPSHOT"]])


   Look [here](http://clojars.org/lein-cuke) for the latest.

## Usage

Do this:

    $ lein deps # install dependencies in lib/
    $ lein cuke-gems # install needed gems
    $ # create cucumber hierarchy - todo: add a target for this
    $ lein cuke # start red-green-refactoring!