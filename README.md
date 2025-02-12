# Interviewproject
This framework is organized into three main packages to ensure modularity and maintainability:
1.	Package 1: Project-Specific Methods
Contains the ProjectSpecificMethodBase class, which includes all common methods used across the framework:
    o	preCondition: Sets up the browser and opens the specified URL.
    o	postCondition: Closes the browser after test execution.
    o	startReport: Initializes the Extent Reports for test reporting.
    o	testDetails: Captures test details for reporting.
    o	reportStep: Logs each test step along with screenshots for visual validation.
    o	takeSnap: Captures screenshots during test execution.
    o	stopReport: Flushes and closes the test report after all tests are executed.
2.	Package 2: Page Objects
Implements the Page Object Design Pattern to create methods for each page. A total of 8 pages have been created, each representing a distinct page in the application and encapsulating its respective methods for actions and validations.
3.	Package 3: Test Cases
Contains the test cases, which extend the ProjectSpecificMethodBase class to inherit all the common methods. Test cases create objects for the HomePage and other page classes to perform actions and validations based on the application's workflow.
This modular design helps ensure code reusability and simplifies the process of updating or extending the framework.

