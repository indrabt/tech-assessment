# tech-assessment
This project is for tech assessment and automation of web application http://automationpractice.com/index.php and api http://ergast.com/api/f1

The framework is Platform agonistic and automatically download webdriver binaries and set the property for the test 

  
To run the test with your choice of browser (provided the you have browser in your system)
  

```
To run the smoke test
```sh
mvn clean test -Dbrowser=chrome  -Dcucumber.options="--tags @smoke"
mvn allure:serve


#Tech component
* Java 8
* Maven
* Cucumber 4
* JUnit4
* Spring - Dependency Injection
* Allure 
