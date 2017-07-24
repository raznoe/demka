@expedia
Feature: Searching for flight


  Scenario: Search for flight
    Given User is on expedia homepage
    When User searches for flight from "YYZ" to "XNA"
    Then User presented with flight results

