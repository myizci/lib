package com.cybertek.stepDefinitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.After;

public class Hooks {

    @After
    public void tearDown(){
        Driver.closeDriver();
    }
}
