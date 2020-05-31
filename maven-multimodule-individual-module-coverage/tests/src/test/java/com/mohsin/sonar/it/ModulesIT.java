package com.mohsin.sonar.it;

import com.mohsin.sonar.Module1;
import com.mohsin.sonar.Module2;
import org.junit.Test;

public class ModulesIT {

  @Test
  public void integrationTest1() {
    new Module1().coveredByGlobalIntegrationTest();
  }

  @Test
  public void integrationTest2() {
    new Module2().coveredByIntegrationTest();
  }
  
}
