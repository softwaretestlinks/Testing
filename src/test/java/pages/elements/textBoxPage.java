package pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class textBoxPage {

    public textBoxPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }
//Identify Elements and actions

    //Element = Elements
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[1]")
    public WebElement Elements;

    // Actions = send keys
    public void Elements() {
        Elements.click();
    }

    //Element =Text Box
    @FindBy(xpath = "//*[@id=\"item-0\"]/span")
    public WebElement TextBox;
    // Actions = Click
    public void TextBox() {
        TextBox.click();
    }

    //Element = UserName field
    @FindBy(id = "userName")
    public WebElement Enter_FirstNameField;

    // Actions = send keys
    public void Enter_FirstNameField(String enter_FirstNameField) {
        Enter_FirstNameField.sendKeys(String.valueOf(enter_FirstNameField));
    }

    //Element = Email field
    @FindBy(id = "userEmail")
    public WebElement Enter_userEmail;

    // Actions = send keys
    public void Enter_userEmail(String enter_userEmail) {
        Enter_userEmail.sendKeys(enter_userEmail);

    }

    //Element = CurrentAddress
    @FindBy(id = "currentAddress")
    public WebElement CurrentAddress;

    // Actions = send keys
    public void CurrentAddress(String currentAddress) {
        CurrentAddress.sendKeys(currentAddress);
    }

    //Element = PermanetAddress
    @FindBy(id = "permanentAddress")
    public WebElement PermanetAddress;

    // Actions = send keys
    public void PermanetAddress(String permanetAddress) {
        PermanetAddress.sendKeys(permanetAddress);
    }

    @FindBy(xpath = "//*[@id=\"submit\"]")
    public WebElement Submit;
    // Actions = send keys
    public void Submit() {
        Submit.click();
    }
}
