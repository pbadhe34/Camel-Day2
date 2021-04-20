package com.app

import org.apache.camel.builder.RouteBuilder

/**
 * A Camel Groovy DSL Router
 */
 
 /*
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
   
class MyRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Groovy code...
     */
    void configure() {
        from("jetty:http://0.0.0.0:8080")
          .transform { 'Today is ' + new Date() }
    }

}
