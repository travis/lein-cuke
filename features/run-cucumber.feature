Feature: Run cucumber
  So that I may drive feature development using cucumber
  As a busy Behavior Driven Developer
  I want this plugin to run cucumber

  Scenario: Our dummy features should be run by "lein cuke dummy-features"
    Given I have installed lein-cuke
    When I run "lein cuke dummy-features"
    Then I should see "You can implement step definitions for undefined steps with these snippets" in the output
