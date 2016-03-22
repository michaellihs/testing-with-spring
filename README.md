Testing with Spring and Spring Boot
===================================

Contains documentation, code snippets and samples about how to test Spring (Boot) applications



Setup the Project
-----------------

1. Clone project to some local directory
1. Install dependencies with `mvn install`



Run the Tests
-------------

There are several commands with which you can run different tests

    mvn clean test                        # Runs Unit tests (configurable in `pom.xml`)
    mvn clean test -P UnitTests           # Runs only unit tests
    mvn clean test -P Integration Tests   # Runs only integration tests
    mvn clean test -P Functional Tests    # Runs only functional tests

Check `pom.xml` for how filtering is implemented.



Tagging Tests
=============

Tests need to be tagged in order to filter them when run with Maven. Therefore use the following syntax:

```` java
// For Unit Tests
@Category(ch.lihsmi.UnitTests.class)
public class ExampleUnitTest {

    // ... implementation of unit test

}



// For Integration Tests
@Category(ch.lihsmi.IntegrationTests.class)
public class ExampleIntegrationTest {

    // ... implementation of integration test

}



// For Functional Tests
@Category(ch.lihsmi.FunctionalTests.class)
public class ExampleFunctionalTest {

    // ... implementation of functional test

}
````
