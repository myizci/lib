package com.cybertek.stepDefinitions;

import com.cybertek.pages.BooksPage;
import com.cybertek.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US3_stepDefinitions {
    BooksPage booksPage = new BooksPage();

    @Then("user should see following links")
    public void user_should_see_following_links(List<String> modules) {
        List<WebElement> list = booksPage.topMenuItems;
        List<String> listText = BrowserUtils.getElementsText(list);

        Assert.assertTrue(modules.equals(listText));


    }

}
