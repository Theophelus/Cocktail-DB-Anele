## API Automation Tests with Rest Assured Cocktail DB.

##### This project consist of api automated tests for Cocktail DB endpoints using Rest assured, Java, with maven for dependency management, Testng for test executions, Allure reports for reporting and Github actions for CI activities 
***
##### The Cocktail DB is a public database of cocktails and drinks from around the world https://www.thecocktaildb.com/. The Cocktail DB has a public API to retrieve data about ingredients and drinks. See the documentation here https://www.thecocktaildb.com/api.php.
***
## Prerequisites
##### Ensure you have the following technologies to run the tests on your local machine.

- Intellij
- Java SDK
- Git
- Maven
- 
***

## Technologies Used:

- Java
- Rest Assured
- GitHub
- Maven
- Allure Reports
- Testng
- Intellij IDE
- Json Validation Schema

***

## Follow these steps to successfully run the project on your local machine

- Clone the project using this url: https://github.com/Theophelus/Cocktail-DB-Anele.git
- Checkout the project and run **`mvn clean install test`** to run all test cases on the project

***

## Continuous Integration with GitHub Actions:
##### I have implemented GitHub Action workflow to set up automated workflows that trigger build process everytime there is push to a master branch. A also wanted to implement Allure reports and deploy to github-pages, but could not configure correctly.

- On the landing page of the  project, click **Actions** tab on top.
- Click the first workflow execution on the list
- Click on the Build run
- Then view results
- Or click on this link to view: https://github.com/Theophelus/Cocktail-DB-Anele/actions/runs/8255529414/job/22582194327

***

## Project Structure

- **main/java** contains all common class and utils folder with reusable methods
- **test/java** contains all the test cases to be executed
- **pom.xml** file contains all the dependencies and plugins for the project to glue together
- **test/resources** contains test data

***

## Requirements and Automated Test Cases.
##### This is a PDF document that contains all the requirements and the test cases that have been automated/covered, located under project document name:
- Functional Requirements with Corresponding Test Cases: https://github.com/Theophelus/Cocktail-DB-Anele/blob/main/Functional%20Requirements%20with%20Corresponding%20Test%20Cases.pdf

***
