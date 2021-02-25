package com.cybertek.stepDefinitions;

import com.cybertek.pages.UsersPage;
import com.cybertek.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US10_stepDefinitions {
    UsersPage usersPage = new UsersPage();
    @When("user click Status dropDown")
    public void user_click_status_drop_down() {
        Select select = new Select(usersPage.statusDropDown2);
        select.getFirstSelectedOption().click();

    }




    @Then("user should see following links under Status")
    public void user_should_see_following_links_under_status(List<String> expectedStatus) {
        Select select = new Select(usersPage.statusDropDown2);
        List<String> actualStatus =BrowserUtils.getElementsText(select.getOptions());

        Assert.assertEquals(actualStatus,expectedStatus);

    }

    @Then("user should see following column names on Users page")
    public void user_should_see_following_column_names_on_users_page(List<String> expectedColumnNames) {
            List<String> actualColumnNames = BrowserUtils.getElementsText(usersPage.userManagementColumnNames);
            Assert.assertEquals(expectedColumnNames,actualColumnNames);
    }




}
