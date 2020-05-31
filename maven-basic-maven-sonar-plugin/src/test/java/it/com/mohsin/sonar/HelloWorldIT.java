package com.mohsin.sonar;

import org.junit.Test;

public class HelloWorldIT {

    @Test
    public void sayHelloIT() {
        new HelloWorld().sayHelloIT();
    }

    @Test
    public void coveredIT() {
        new HelloWorld().coveredIT();
    }
}
