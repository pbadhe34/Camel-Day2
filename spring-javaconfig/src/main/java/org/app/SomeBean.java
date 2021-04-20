package org.app;

import org.springframework.stereotype.Component;

@Component
public class SomeBean {

    public void someMethod(String body) {
        System.out.println("Received: " + body);
    }

}
