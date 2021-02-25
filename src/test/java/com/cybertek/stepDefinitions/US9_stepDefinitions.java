package com.cybertek.stepDefinitions;

import com.cybertek.pages.UsersPage;
import com.cybertek.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US9_stepDefinitions {
    UsersPage usersPage = new UsersPage();

    @When("user click User Group dropdown")
    public void user_click_user_group_dropdown() {
        Select select = new Select(usersPage.userGroupDropDown2);
        select.getFirstSelectedOption().click();
    }


    @Then("user should see following links on Users page")
    public void user_should_see_following_links_on_users_page(List<String> expectedUserGroup) {
        Select select = new Select(usersPage.userGroupDropDown2);
        List<String> actualUserGroup = BrowserUtils.getElementsText(select.getOptions());
        Assert.assertEquals(expectedUserGroup, actualUserGroup);
    }

}
