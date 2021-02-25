package com.cybertek.stepDefinitions;

import com.cybertek.pages.BooksPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Login_stepDefinitions {
    LoginPage loginPage = new LoginPage();
    BooksPage booksPage = new BooksPage();

    @Given("user on login page")
    public void user_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Given("user login as a {string}")
    public void user_login_as_a(String role) {
        loginPage.login(role);
    }
    @Then("user on {string}")
    public void user_on(String page) {
        BrowserUtils.waitForVisibility(booksPage.booksLink,5);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(page));

    }

}
