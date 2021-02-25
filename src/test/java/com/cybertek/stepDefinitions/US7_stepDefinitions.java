package com.cybertek.stepDefinitions;

import com.cybertek.pages.BooksPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US7_stepDefinitions {
    BooksPage booksPage = new BooksPage();
    @Then ("user can choose  each category")
    public void searchBookCategories(List<String > categories){
        Select select = new Select(booksPage.bookCategoriesDropDown);


        int numberOfCategories = categories.size();

// start from 1 to skip "ALL" option
        for(int i=1; i<numberOfCategories; i++){
            select.selectByIndex(i);
            WebElement currentChoice = select.getFirstSelectedOption();
            String actualChoiceText= currentChoice.getText();
           String expectedChoiceText= categories.get(i);

            Assert.assertEquals(actualChoiceText,expectedChoiceText);
        }


    }
}
