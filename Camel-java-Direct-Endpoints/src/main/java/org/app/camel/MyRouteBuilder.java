package org.app.camel;

import org.apache.camel.builder.RouteBuilder;

/**
 * A Camel Java DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

        // here is a sample which processes the input files
        // (leaving them in place - see the 'noop' flag)
        // then performs content based routing on the message using XPath
    	 
    from("direct:commonPoint").
     to("file:src/data")
     .to("stream:out")
      .to("direct:inPoint");
    			 
    	from("stream:in")         
        //.log("${body}")
    	 .to("stream:out")
    	 .to("direct:inPoint");
    	
    	
    	//from("stream:in").to("file:src/data");       
         
         
      
		    
		/*
		 * System.out.println("Pl. enter text here"); System.out.println("\n*****\n");
		 * 
		 * from("stream:in").to("file:src/out");
		 */
    	
    	
			/*
			 * from("stream:in").to("file:src/out");
			 * from("http://www.google.com").to("stream:out");
			 */
    	
    }

}
