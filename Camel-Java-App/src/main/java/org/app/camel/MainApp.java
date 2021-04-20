package org.app.camel;

import org.apache.camel.main.Main;

/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
        Main main = new Main();
        main.configure().addRoutesBuilder(new MyRouteBuilder());
        //Blocking method
        main.run(args);
        
         System.out.println("Is Camel running ?");
        
      //  main.getCamelContext();
         
         main.stop();
         main.shutdown();
    }

}

