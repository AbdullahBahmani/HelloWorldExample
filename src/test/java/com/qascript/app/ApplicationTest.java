package com.qascript.app;

import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {

    Application app = new Application();

    @Test
    public void testApplication(){
        try{
<<<<<<< HEAD
            Assert.assertEquals("Hello Wccccorld!", app.getMessage());
        }
        catch (Exception e){
            Assert.fail("Message is yyyyyyyy not Hello World!");
=======
            Assert.assertEquals("Hello World!", app.getMessage());
        }
        catch (Exception e){
            Assert.fail("Message is  not Hello World!");
>>>>>>> 95365e30b219f84a8530e78e50533504ef3063f8
        }
    }
}
