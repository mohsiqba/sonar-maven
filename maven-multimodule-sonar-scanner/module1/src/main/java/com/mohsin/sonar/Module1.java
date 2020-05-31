package com.mohsin.sonar;

public class Module1 {

  public void coveredByUnitTest() {
    System.out.println("This method is covered by unit test");
  }

  public void coveredByGlobalIntegrationTest() {
    System.out.println("This method is covered by global integration test");
  }

  public void uncovered() {
    System.out.println("This method is not covered");
  }

  public void coveredByModuleIntegrationTest() {
    System.out.println("This method is covered by module integration test");
  }

}
