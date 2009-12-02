(require 'leiningen.core
         ['clojure.contrib.shell-out :as 'shell])

(def help-output (atom ""))

(Given #"^I have installed lein-cuke"
       #())

(When #"^I run \"lein help\""
      #(reset! help-output
               (shell/sh "lein" "help")))

(Then #"^I should see \"cuke\" in the output"
      #(assert (not (= (.indexOf @help-output "cuke") -1))))
