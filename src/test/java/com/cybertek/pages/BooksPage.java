package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BooksPage extends BasePage {

    @FindBy(xpath = "//a[@href='#books']")
    public WebElement booksLink;

    @FindBy(xpath = "//select[@name='tbl_books_length']")
    public WebElement showRecordsDropDown;

    @FindBy(xpath = "//thead/tr/th")
    public List<WebElement> columnHeads;



    @FindBy(id="book_categories")
    public WebElement bookCategoriesDropDown;

    public void navigateToBooksPage() {

        booksLink.click();
    }


}
