$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeaturesFolder/FbLogin.feature");
formatter.feature({
  "name": "Facebook Login Feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@e2e"
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
formatter.step({
  "name": "user laucnh chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_laucnh_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter url",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_enter_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User Validate Login Feature by valid Creditial",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@e2e"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user enter userName and passWord",
  "rows": [
    {
      "cells": [
        "empID",
        "empName",
        "empEmailId"
      ]
    },
    {
      "cells": [
        "100",
        "Vel",
        "Vel@gmail.com"
      ]
    },
    {
      "cells": [
        "200",
        "Saranya",
        "Saranya@gmail.com"
      ]
    },
    {
      "cells": [
        "300",
        "Nishanthi",
        "Nishanthi@gmail.com"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_userName_and_passWord(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify result",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_result()"
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
formatter.step({
  "name": "user laucnh chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_laucnh_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter url",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_enter_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User Validate Login Feature by valid Creditial",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@e2e"
    },
    {
      "name": "@functional"
    }
  ]
});
formatter.step({
  "name": "user enter userName and passWord",
  "rows": [
    {
      "cells": [
        "empID",
        "empName",
        "empEmailId"
      ]
    },
    {
      "cells": [
        "100",
        "Vel",
        "Vel@gmail.com"
      ]
    },
    {
      "cells": [
        "200",
        "Saranya",
        "Saranya@gmail.com"
      ]
    },
    {
      "cells": [
        "300",
        "Nishanthi",
        "Nishanthi@gmail.com"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_userName_and_passWord(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify result scenario two",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_result_scenario_two()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat com.steps.StepDefinition.user_verify_result_scenario_two(StepDefinition.java:132)\r\n\tat ✽.user verify result scenario two(file:src/test/resources/FeaturesFolder/FbLogin.feature:26)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});