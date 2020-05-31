package com.mohsin.sonar.it;

import com.mohsin.sonar.Module1;
import org.junit.Test;

public class Module1IT {
    @Test
    public void coveredByModuleIntegrationTest() {
        Module1 module1 = new Module1();
        module1.coveredByModuleIntegrationTest();
    }
}
