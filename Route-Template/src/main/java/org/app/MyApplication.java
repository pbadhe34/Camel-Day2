 
package org.app;

import org.apache.camel.main.Main;

/**
 * Main class that boot the Camel application
 */
public final class MyApplication {

    private MyApplication() {
    }

    public static void main(String[] args) throws Exception {
        // use Camels Main class
        Main main = new Main();
        // and add route templates via routes builder
        main.configure().addRoutesBuilder(MyRouteTemplates.class);
        // add configuration class which setup the routes from the route templates

        // to configure route templates we can use java code as below from a template builder class,
        // gives more power as its java code.
        // or we can configure as well from application.properties,
        // less power as its key value pair properties
        // and you can also use both java and properties together

        // in this case use properties by default and have disabled java
        //To ebanlve java templare builder eneble next line
        // main.bind("myTemplateBuilder", new MyTemplateBuilder());

        // now keep the application running until the JVM is terminated (ctrl + c or sigterm)
        main.run(args);
    }

}
