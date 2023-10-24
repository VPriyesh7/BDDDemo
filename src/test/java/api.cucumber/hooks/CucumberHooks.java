package api.cucumber.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
public class CucumberHooks {
    @Before
    public void setUp(){
        System.out.println("----Before Hook ----");
    }
    @After
    public void tearDown(){
        System.out.println("----After Hook ----");
    }
}
