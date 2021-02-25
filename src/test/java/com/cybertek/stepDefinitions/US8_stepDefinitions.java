package com.cybertek.stepDefinitions;

import com.cybertek.pages.BorrowingBooksPage;
import com.cybertek.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class US8_stepDefinitions {
    BorrowingBooksPage borrowingBooksPage = new BorrowingBooksPage();

    @And("user navigate to BorrowingBooks page")
    public void user_navigate_to_BorrowingBooks_page() {
        borrowingBooksPage.borrowingBooksPage.click();
    }

    @Then("user should see following links on BorrowingBooks page")
    public void user_should_see_following_links_on_borrowing_books_page(List<String > expectedColumnNames){
        List <String> actualColumnNames = BrowserUtils.getElementsText(borrowingBooksPage.borrowedBooksTitles);

        Assert.assertEquals(expectedColumnNames,actualColumnNames);
    }




}
