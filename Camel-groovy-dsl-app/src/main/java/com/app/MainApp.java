package com.app;

import org.apache.camel.main.Main;

/**
 * /*
   The groovy routebilder is depreacted in new versions of Camel
   But works with camel vers 2.25.3 as here
   But groovy script can be embeded is xml or java dsl
   
     Java DSL
   
   // lets route if a line item is over 100
   from("queue:foo").filter(groovy("request.lineItems.any { i -> i.value > 100 }")).to("queue:bar")
   
   In Spring DSL:

        <route>
            <from uri="queue:foo"/>
            <filter>
                <groovy>request.lineItems.any { i -> i.value > 100 }</groovy>
                <to uri="queue:bar"/>
            </filter>
        </route>
        */
 
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {

        System.out.println("\n\n\n\n");
        System.out.println("===============================================");
        System.out.println("Open your web browser on http://localhost:8080");
        System.out.println("Press ctrl+c to stop this example");
        System.out.println("===============================================");
        System.out.println("\n\n\n\n");

        Main main = new Main();
        main.addRouteBuilder(new MyRouteBuilder());
        main.run(args);
    }

}

