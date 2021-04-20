package org.app;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.TemplatedRouteBuilder;
import org.apache.camel.main.ConfigureRouteTemplates;

public class MyTemplateBuilder implements ConfigureRouteTemplates {

    /**
     * Configure and adds routes from route templates.
     */
    public void configure(CamelContext context) {

        // create two routes from the template

        TemplatedRouteBuilder.builder(context, "myTemplate")
            .parameter("name", "java-one")
            .parameter("greeting", "java-Hello")
            .add();

        TemplatedRouteBuilder.builder(context, "myTemplate")
            .parameter("name", "java-two")
            .parameter("greeting", "java-Bonjour")
            .parameter("myPeriod", "10s")
            .add();
    }
}
