
package org.app;

import org.apache.camel.spring.Main;

/**
 * A main class to run the example from your editor.
 */
public final class CamelConsoleMain {

    private CamelConsoleMain() {
    }

    public static void main(String[] args) throws Exception {
    	System.out.println("CamelConsoleMain Java is running");
        // Main makes it easier to run a Spring application
        Main main = new Main();
        // configure the location of the Spring XML file
        main.setApplicationContextUri("META-INF/spring/camel-context.xml");
        // run and block until Camel is stopped (or JVM terminated)
        main.run();
    }
}
