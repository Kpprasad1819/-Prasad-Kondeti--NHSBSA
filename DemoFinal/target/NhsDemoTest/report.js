$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/NhsTest.feature");
formatter.feature({
  "name": "NhsTest Ticket",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Wales Test Ticket Acceptance Criteria",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am a person from Wales",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.nhsStepDefination.i_am_a_person_from_Wales()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I put my circumstances into the Checker tool",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.nhsStepDefination.i_put_my_circumstances_into_the_Checker_tool()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get a result of whether I will get help or not",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.nhsStepDefination.i_should_get_a_result_of_whether_I_will_get_help_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close the application",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.nhsStepDefination.I_close_the_application()"
});
formatter.result({
  "status": "passed"
});
});