 
package org.app;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

    @Autowired
    private SomeBean someBean;

    @Override
    public void configure() throws Exception {
        // you can configure the route rule with Java DSL here

        // populate the message queue with some messages
        from("file:src/data?noop=true")
                .to("jms:queue:inbox");

        from("jms:queue:inbox")
                .bean(someBean);
    }

}
