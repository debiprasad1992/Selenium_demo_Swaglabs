# Selenium_demo_Swaglabs 
This swagLabd project is written in java and will serve an example of implementing a Selenium test project with page Object model (Selenium 4.11) and maven.
Everything is set up and tests can be added straight away. Used Testrunner & testNg.XML for maganging the test execution, it will work out of the box. To execute the tests just browse to the project location & **run mvn test **execute the tests in your IDE. As well as tests can be triggered from testNg.XML FIle.
For reports **html-cucumber reports** is used & for every run reports are being uploaded to the cloud platform & can be acessed through the result url.
As well as in local space can be found under **target/testclasses** location.
The Project will use Chrome Browser in Headed mode by default / if no other browser is stated 
Note :-Going forward this space will be updated with more other required info.

👩‍👩‍👦‍👦 Parallel Test Execution
The Project is preconfigured to run the tests in parallel. The number of test that will be executed at the same time is configurable (defaults to 2) or can be deactivated if required.
Change the below paramter in testNg.xml
**suite name="BDD Test Suite" verbose="2" parallel="tests"
       thread-count="2">**
