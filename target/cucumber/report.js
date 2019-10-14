$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/possimulation/possimlogon.feature");
formatter.feature({
  "line": 1,
  "name": "Point Of Sale Simulation Logon",
  "description": "As a user\nI want to validate the Point Of Sale Simulation Logon\nSo that I can validate the security",
  "id": "point-of-sale-simulation-logon",
  "keyword": "Feature"
});
formatter.before({
  "duration": 109917,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "validate the possim positive logon",
  "description": "",
  "id": "point-of-sale-simulation-logon;validate-the-possim-positive-logon",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@RegressionLogon"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I open the bluerayon test application using possim",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I logon to the system using the following values:",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 10
    },
    {
      "cells": [
        "cmacgo__wan",
        "password45!"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "The item page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "The application window is closed",
  "keyword": "And "
});
formatter.match({
  "location": "HopePageSteps.open_bluerayon_test_application_using_possim()"
});
formatter.result({
  "duration": 3191841026,
  "status": "passed"
});
formatter.match({
  "location": "HopePageSteps.logon_to_system_using_following_values(DataTable)"
});
formatter.result({
  "duration": 523171745,
  "status": "passed"
});
formatter.match({
  "location": "PosSimItemsSteps.logon_validation_page_is_displayed()"
});
formatter.result({
  "duration": 274694798,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"id\",\"selector\":\"pageHeaderItems\"}\nCommand duration or timeout: 225 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027chrismac2.local\u0027, ip: \u0027172.20.147.18\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.11.6\u0027, java.version: \u00271.8.0_51\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d46.0, platform\u003dMAC, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: df475bc4-0495-9b4b-891b-ad4d8e0b190c\n*** Element info: {Using\u003did, value\u003dpageHeaderItems}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:413)\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\n\tat com.macgowan.pages.possimulation.PosSimItemsPage.getItemPageHeaderElement(PosSimItemsPage.java:22)\n\tat com.macgowan.steps.possimulator.PosSimItemsSteps.logon_validation_page_is_displayed(PosSimItemsSteps.java:46)\n\tat ✽.Then The item page is displayed(features/possimulation/possimlogon.feature:12)\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"id\",\"selector\":\"pageHeaderItems\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027chrismac2.local\u0027, ip: \u0027172.20.147.18\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.11.6\u0027, java.version: \u00271.8.0_51\u0027\nDriver info: driver.version: unknown\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///var/folders/q9/g34lf2p1191bnkkvwcf6bq7m0000gn/T/anonymous5308597434034993623webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10770)\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElement(file:///var/folders/q9/g34lf2p1191bnkkvwcf6bq7m0000gn/T/anonymous5308597434034993623webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10779)\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/h(file:///var/folders/q9/g34lf2p1191bnkkvwcf6bq7m0000gn/T/anonymous5308597434034993623webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12661)\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_(file:///var/folders/q9/g34lf2p1191bnkkvwcf6bq7m0000gn/T/anonymous5308597434034993623webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12666)\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.execute/\u003c(file:///var/folders/q9/g34lf2p1191bnkkvwcf6bq7m0000gn/T/anonymous5308597434034993623webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12608)\n",
  "status": "failed"
});
formatter.match({
  "location": "PosSimItemsSteps.close_application_window()"
});
formatter.result({
  "status": "skipped"
});
formatter.before({
  "duration": 26616,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "validate the possim negative logon with username",
  "description": "",
  "id": "point-of-sale-simulation-logon;validate-the-possim-negative-logon-with-username",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@RegressionLogon"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I open the bluerayon test application using possim",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I logon to the system using the following values:",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 19
    },
    {
      "cells": [
        "baduser",
        "password45!"
      ],
      "line": 20
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "The logon error page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "The application window is closed",
  "keyword": "And "
});
formatter.match({
  "location": "HopePageSteps.open_bluerayon_test_application_using_possim()"
});
formatter.result({
  "duration": 3137703345,
  "status": "passed"
});
formatter.match({
  "location": "HopePageSteps.logon_to_system_using_following_values(DataTable)"
});
formatter.result({
  "duration": 561354752,
  "status": "passed"
});
formatter.match({
  "location": "PosSimItemsSteps.logon_error_page_is_displayed()"
});
formatter.result({
  "duration": 236745929,
  "status": "passed"
});
formatter.match({
  "location": "PosSimItemsSteps.close_application_window()"
});
formatter.result({
  "duration": 6061152,
  "status": "passed"
});
formatter.before({
  "duration": 19156,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "validate the possim negative logon with password",
  "description": "",
  "id": "point-of-sale-simulation-logon;validate-the-possim-negative-logon-with-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@RegressionLogon"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I open the bluerayon test application using possim",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I logon to the system using the following values:",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 28
    },
    {
      "cells": [
        "cmacgowan",
        "badpassword"
      ],
      "line": 29
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "The logon error page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "The application window is closed",
  "keyword": "And "
});
formatter.match({
  "location": "HopePageSteps.open_bluerayon_test_application_using_possim()"
});
formatter.result({
  "duration": 6115587584,
  "status": "passed"
});
formatter.match({
  "location": "HopePageSteps.logon_to_system_using_following_values(DataTable)"
});
formatter.result({
  "duration": 385294810,
  "status": "passed"
});
formatter.match({
  "location": "PosSimItemsSteps.logon_error_page_is_displayed()"
});
formatter.result({
  "duration": 224148813,
  "status": "passed"
});
formatter.match({
  "location": "PosSimItemsSteps.close_application_window()"
});
formatter.result({
  "duration": 5286402,
  "status": "passed"
});
formatter.before({
  "duration": 24296,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "validate the possim negative logon with username and password",
  "description": "",
  "id": "point-of-sale-simulation-logon;validate-the-possim-negative-logon-with-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@RegressionLogon"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "I open the bluerayon test application using possim",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "I logon to the system using the following values:",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 37
    },
    {
      "cells": [
        "baduser",
        "badpassword"
      ],
      "line": 38
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "The logon error page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "The application window is closed",
  "keyword": "And "
});
formatter.match({
  "location": "HopePageSteps.open_bluerayon_test_application_using_possim()"
});
formatter.result({
  "duration": 2910440488,
  "status": "passed"
});
formatter.match({
  "location": "HopePageSteps.logon_to_system_using_following_values(DataTable)"
});
formatter.result({
  "duration": 508600486,
  "status": "passed"
});
formatter.match({
  "location": "PosSimItemsSteps.logon_error_page_is_displayed()"
});
formatter.result({
  "duration": 132905390,
  "status": "passed"
});
formatter.match({
  "location": "PosSimItemsSteps.close_application_window()"
});
formatter.result({
  "duration": 5537301,
  "status": "passed"
});
});