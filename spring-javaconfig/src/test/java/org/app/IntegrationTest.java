  
package org.app;

import org.apache.camel.spring.javaconfig.Main;
import org.junit.Assert;
import org.junit.Test;

public class IntegrationTest extends Assert {
    
    @Test
    public void testCamelRulesDeployCorrectlyInSpring() throws Exception {
        // let's boot up the Spring application context for 2 seconds to check that it works OK
        Main.main("-duration", "2s", "-cc", "org.apache.camel.example.spring.javaconfig.MyApplication", "-bp", "org.apache.camel.example.spring.javaconfig");
    }

}
