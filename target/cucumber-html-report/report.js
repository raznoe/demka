$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Expedia.feature");
formatter.feature({
  "line": 2,
  "name": "Searching for flight",
  "description": "",
  "id": "searching-for-flight",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@expedia"
    }
  ]
});
formatter.before({
  "duration": 109272,
  "status": "passed"
});
formatter.before({
  "duration": 1115819,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Search for flight",
  "description": "",
  "id": "searching-for-flight;search-for-flight",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User is on expedia homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User searches for flight from \"YYZ\" to \"XNA\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User presented with flight results",
  "keyword": "Then "
});
formatter.match({
  "location": "Expedia_Steps.userIsOnExpediaHomepage()"
});
formatter.result({
  "duration": 14817441978,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "YYZ",
      "offset": 31
    },
    {
      "val": "XNA",
      "offset": 40
    }
  ],
  "location": "Expedia_Steps.userSearchesForFlightFromTo(String,String)"
});
formatter.result({
  "duration": 12077823526,
  "status": "passed"
});
formatter.match({
  "location": "Expedia_Steps.userPresentedWithFlightOption()"
});
formatter.result({
  "duration": 2323926695,
  "status": "passed"
});
formatter.uri("GoogleSearch.feature");
formatter.feature({
  "line": 2,
  "name": "Search Google for links",
  "description": "As an internet user\nI want to use Google to search for websites\nSo that I can find them without knowing the URL",
  "id": "search-google-for-links",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@search"
    }
  ]
});
formatter.before({
  "duration": 26073,
  "status": "passed"
});
formatter.before({
  "duration": 164955,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Search for Facebook",
  "description": "",
  "id": "search-google-for-links;search-for-facebook",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I want to go on \"Facebook\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I search on Google \"Facebook\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see the search results for \"Facebook\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Facebook",
      "offset": 17
    }
  ],
  "location": "GoogleSearch_Steps.i_want_to_go_on(String)"
});
formatter.result({
  "duration": 114520,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Facebook",
      "offset": 20
    }
  ],
  "location": "GoogleSearch_Steps.iSearchOnGoogle(String)"
});
formatter.result({
  "duration": 3439807339,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Facebook",
      "offset": 37
    }
  ],
  "location": "GoogleSearch_Steps.i_should_see_the_search_results_for(String)"
});
formatter.result({
  "duration": 84784964,
  "status": "passed"
});
});