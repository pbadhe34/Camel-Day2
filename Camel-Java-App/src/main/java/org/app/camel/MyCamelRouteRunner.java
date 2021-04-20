package org.app.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;

public class MyCamelRouteRunner {

	public static void main(String[] args) throws Exception {
		 CamelContext ctx = new DefaultCamelContext();		 
		 MyRouteBuilder route1 = new MyRouteBuilder();		 
		 ctx.addRoutes(route1);
		 ProducerTemplate templ = ctx.createProducerTemplate();	 
		 
		 String data = "Text Data common";
		 ctx.start();
		// templ.sendBody("file:src/data", data);
		 //templ.sendBody("stream:out", data);
		 
		 templ.sendBody("direct:commonPoint", data);		 
		
			
		 Thread.sleep(125000);
		 Object recddata = ctx.createConsumerTemplate().receiveBody("direct:inPoint");
		 System.out.println("data consumed is "+recddata); 
		
			
		 ctx.stop();
		 ctx.shutdown();
		 

	}

}
