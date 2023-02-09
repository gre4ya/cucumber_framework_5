$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/techGlobalLogin.feature");
formatter.feature({
  "name": "TechGlobal Training Functionalities",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Validate login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters username as \"\u003cusername\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should see a \"\u003cmessage\u003e\" message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "message"
      ]
    },
    {
      "cells": [
        "TechGlobal",
        "1234",
        "Invalid Password entered!"
      ]
    },
    {
      "cells": [
        "TechGlobal",
        "Test1234",
        "You are logged in"
      ]
    },
    {
      "cells": [
        "Tech",
        "1234",
        "Invalid Username entered!"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"https://techglobal-training.netlify.app/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.userNavigatesTo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Practices dropdown in the header",
  "keyword": "When "
});
formatter.match({
  "location": "TechGlobalSteps.userClicksOnPracticesDropdownInTheHeader()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the \"Frontend Testing\" option",
  "keyword": "And "
});
formatter.match({
  "location": "TechGlobalSteps.userSelectsTheOption(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the \"Login Form\" option",
  "keyword": "And "
});
formatter.match({
  "location": "TechGlobalSteps.userSelectsTheOption(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see \"Login Form\" heading",
  "keyword": "Then "
});
formatter.match({
  "location": "TechGlobalSteps.userShouldSeeHeading(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "user enters username as \"TechGlobal\" and password as \"1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "TechGlobalSteps.user_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see a \"Invalid Password entered!\" message",
  "keyword": "Then "
});
formatter.match({
  "location": "TechGlobalSteps.user_should_see_a_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"https://techglobal-training.netlify.app/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.userNavigatesTo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Practices dropdown in the header",
  "keyword": "When "
});
formatter.match({
  "location": "TechGlobalSteps.userClicksOnPracticesDropdownInTheHeader()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the \"Frontend Testing\" option",
  "keyword": "And "
});
formatter.match({
  "location": "TechGlobalSteps.userSelectsTheOption(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the \"Login Form\" option",
  "keyword": "And "
});
formatter.match({
  "location": "TechGlobalSteps.userSelectsTheOption(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see \"Login Form\" heading",
  "keyword": "Then "
});
formatter.match({
  "location": "TechGlobalSteps.userShouldSeeHeading(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "user enters username as \"TechGlobal\" and password as \"Test1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "TechGlobalSteps.user_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see a \"You are logged in\" message",
  "keyword": "Then "
});
formatter.match({
  "location": "TechGlobalSteps.user_should_see_a_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"https://techglobal-training.netlify.app/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.userNavigatesTo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Practices dropdown in the header",
  "keyword": "When "
});
formatter.match({
  "location": "TechGlobalSteps.userClicksOnPracticesDropdownInTheHeader()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the \"Frontend Testing\" option",
  "keyword": "And "
});
formatter.match({
  "location": "TechGlobalSteps.userSelectsTheOption(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the \"Login Form\" option",
  "keyword": "And "
});
formatter.match({
  "location": "TechGlobalSteps.userSelectsTheOption(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see \"Login Form\" heading",
  "keyword": "Then "
});
formatter.match({
  "location": "TechGlobalSteps.userShouldSeeHeading(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "user enters username as \"Tech\" and password as \"1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "TechGlobalSteps.user_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see a \"Invalid Username entered!\" message",
  "keyword": "Then "
});
formatter.match({
  "location": "TechGlobalSteps.user_should_see_a_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});