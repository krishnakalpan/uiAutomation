# uiAutomation

Automation framework for mobile and web applications

This framework is implemented in datadriven approach.where the tests reads a input excel/cvs/json file to identify the data that needs  to pass the tests for inputData and expected Data.

The UI automation is done using pageObjectModel where objects/webelements and actions that belong to a page are created in respective page object class example SearchPage.java. 

The driver dependency is injected to the constructor of the pageObject. The page object model is create for easy maintenance and segregate data&Objects of each page. 

BseTest.java contains helper methods that reads data from excel and also it can contain methods to load global variable that consists of API endpoints, db server details and urls of AUT.

UITest extends this BaseTest and beforeSuite invokes the test harness methods.

All verifications will be moved to custom methods so that later enhanced reports

can be implemented for each assert / verification 



Java version: TBD
Selenium Versions: TBD
Supported browser and app versions : TBD

