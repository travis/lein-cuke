Feature: Show cuke in help
  So that I may know how to run cucumber with leiningen
  As a busy Behavior Driven Developer
  I want to see the cuke task in "lein help"

  Scenario: cuke should be included in help output
    Given I have installed lein-cuke
    When I run "lein help"
    Then I should see "cuke" in the output
