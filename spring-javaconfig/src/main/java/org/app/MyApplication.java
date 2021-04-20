 
package org.app;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.spring.javaconfig.CamelConfiguration;
import org.apache.camel.spring.javaconfig.Main;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

 
/**
 * A simple example router from a file system to an ActiveMQ queue and then to a file system
 */
@Configuration
@ComponentScan
public class MyApplication extends CamelConfiguration {

    /**
     * Allow this route to be run as an application
     */
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.setConfigClass(MyApplication.class);
        main.run();
    }

    @Override
    protected void setupCamelContext(CamelContext camelContext) throws Exception {
        // setup the ActiveMQ component
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        connectionFactory.setBrokerURL("vm://localhost?broker.persistent=false&broker.useJmx=false");

        // and register it into the CamelContext
        JmsComponent answer = new JmsComponent();
        answer.setConnectionFactory(connectionFactory);
        camelContext.addComponent("jms", answer);
    }

}
 

