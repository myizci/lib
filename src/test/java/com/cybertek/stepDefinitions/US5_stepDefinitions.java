package com.cybertek.stepDefinitions;

import com.cybertek.pages.BooksPage;
import com.cybertek.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US5_stepDefinitions {
    BooksPage booksPage = new BooksPage();

    @And("user navigate to Books page")
    public void user_navigate_to_Books_page(){
        booksPage.navigateToBooksPage();
    }

    @Then("user can see default book record value as {int}")
    public void userCanSeeDefaultBookRecordValueAs(int defaultValue ) {
        Select select = new Select(booksPage.showRecordsDropDown);
        Assert.assertEquals(String.valueOf(defaultValue), select.getFirstSelectedOption().getText());
    }

    @Then("user can see the record options")
    public void user_can_see_the_record_options(List<String> options) {
        Select select = new Select(booksPage.showRecordsDropDown);
        List<WebElement> list = select.getOptions();
        List<String> listString = BrowserUtils.getElementsText(list);
        Assert.assertEquals(listString,options);
    }


}
