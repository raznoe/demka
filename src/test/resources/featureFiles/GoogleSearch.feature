@search
Feature: Search Google for links
  As an internet user
  I want to use Google to search for websites
  So that I can find them without knowing the URL

  Scenario: Search for Facebook
    Given I want to go on "Facebook"
    When I search on Google "Facebook"
    Then I should see the search results for "Facebook"

  Scenario: Search for Hotmail
    Given I want to go on "Hotmail"
    When I search on Google "Hotmail"
    Then I should see the search results for "Hotmail"

  Scenario: Search for Yandex
    Given I want to go on "Yandex"
    When I search on Google "Yandex"
    Then I should see the search results for "Yandex"