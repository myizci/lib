package com.cybertek.stepDefinitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.pages.LogoutPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Logout_stepDefinitions {

    LogoutPage logoutPage = new LogoutPage();
    LoginPage loginPage = new LoginPage();

    @Given("user logout")
    public void user_logout() {
        logoutPage.logout();
    }

    @Then("user land on login page")
    public void user_land_on_login_page() {
        BrowserUtils.waitForVisibility(loginPage.getUsernameBox(),5);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));
    }
}
