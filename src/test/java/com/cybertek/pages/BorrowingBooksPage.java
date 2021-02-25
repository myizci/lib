package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BorrowingBooksPage extends BasePage {
    @FindBy(xpath = "//a[@href='#borrowing-books']")
    public WebElement borrowingBooksPage;

    @FindBy(xpath = "//table//tr/th")
    public List<WebElement> borrowedBooksTitles;

}
