package com.mohsin.sonar.it;

import com.mohsin.sonar.Module1;
import com.mohsin.sonar.Module2;
import org.junit.Test;

public class ModulesTest {

  @Test
  public void integrationTest1() {
    new Module1().coveredByIntegrationTest();
  }

  @Test
  public void integrationTest2() {
    new Module2().coveredByIntegrationTest();
  }
  
}
