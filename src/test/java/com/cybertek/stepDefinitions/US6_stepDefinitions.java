package com.cybertek.stepDefinitions;

import com.cybertek.pages.BooksPage;
import com.cybertek.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class US6_stepDefinitions {
BooksPage booksPage = new BooksPage();
    @Then("user should see following links on homepage")
    public void user_should_see_following_links_on_homepage(List<String> expectedColumnNames) {
        List<String> actualColumnNames = BrowserUtils.getElementsText(booksPage.columnHeads);
        Assert.assertEquals(actualColumnNames,expectedColumnNames);
    }
}
