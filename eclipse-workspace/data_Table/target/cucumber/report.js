$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GoogleSearch.feature");
formatter.feature({
  "line": 1,
  "name": "Google search",
  "description": "",
  "id": "google-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate google search text field",
  "description": "",
  "id": "google-search;validate-google-search-text-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I navigate to google page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I validate the search text field",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearch.i_open_the_browser()"
});
formatter.result({
  "duration": 23458052553,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearch.i_navigate_to_google_page()"
});
formatter.result({
  "duration": 10941007021,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\".//*[@id\u003d\u0027gsr\u0027]/div[4]\"}\n  (Session info: chrome\u003d64.0.3282.186)\n  (Driver info: chromedriver\u003d2.34.522940 (1a76f96f66e3ca7b8e57d503b4dd3bccfba87af1),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.8.0\u0027, revision: \u0027924c4067df\u0027, time: \u00272017-11-30T11:20:39.408Z\u0027\nSystem info: host: \u0027USER-PC\u0027, ip: \u0027169.254.246.114\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00279.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptSslCerts: true, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.34.522940 (1a76f96f66e3ca..., userDataDir: C:\\Users\\ADMINI~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 64.0.3282.186, webStorageEnabled: true}\nSession ID: 695db9fe8b11a5e26bd5fb3a753c32cc\n*** Element info: {Using\u003dxpath, value\u003d.//*[@id\u003d\u0027gsr\u0027]/div[4]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat stepdefinitions.GoogleSearch.i_navigate_to_google_page(GoogleSearch.java:30)\r\n\tat ✽.When I navigate to google page(GoogleSearch.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "GoogleSearch.i_validate_the_search_text_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 10,
  "name": "Validate gmail account",
  "description": "",
  "id": "google-search;validate-gmail-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I navigate to gmail page",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I validate gmail link",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearch.i_open_the_browser()"
});
formatter.result({
  "duration": 16818977412,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearch.i_navigate_to_gmail_page()"
});
formatter.result({
  "duration": 103042,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearch.i_validate_gmail_link()"
});
formatter.result({
  "duration": 81694,
  "status": "passed"
});
});