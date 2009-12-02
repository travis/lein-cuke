(require 'leiningen.core
         ['clojure.contrib.str-utils2 :as 'str]
         ['clojure.contrib.shell-out :as 'shell])


(def output (atom ""))

(Before (reset! output ""))

(Given #"^I have installed lein-cuke"
       #())

(When #"^I run \"(.*)\""
      #(reset! output
               (apply shell/sh (.split %1 " "))))

(Then #"^I should see \"(.*)\" in the output"
      #(assert (str/contains? @output %1)))
