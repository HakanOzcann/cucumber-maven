package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class loginAndBuyPage extends AbstractClass {

        private WebDriver driver;

        public loginAndBuyPage() {
            driver = Driver.getDriver();
            PageFactory.initElements(driver, this);
        }

        @FindBy(xpath = "//*[@id=\"rise-header\"]/div/div/div[5]/div/div/div/div/div/div[1]/a")
        private WebElement logIn;

        public void logIn()
        {
            clickFunction(logIn);
        }

        @FindBy(id = "login-email")
        private WebElement loginEmail;

        public void LoginEmail(String LoginEmail)
        {
            sendKeysFunction(loginEmail,LoginEmail);
        }

        @FindBy(id = "login-password")
        private WebElement loginPassword;

        public void LoginPassword(String LoginPassword)
        {
            sendKeysFunction(loginPassword,LoginPassword);
        }

        @FindBy(id = "my-account-action-login")
        private WebElement loginButton;

        public void loginButton()
        {
            clickFunction(loginButton);
        }

        @FindBy(name = "query")
        private WebElement searchProduct;

        public void Search(String Search)
        {
            sendKeysFunction(searchProduct,Search);
        }

        @FindBy(xpath = "//*[@id=\"search-autocomplete\"]/form/button")
        private WebElement searchButton;

        public void SearchButton()
        {
            clickFunction(searchButton);
        }

        @FindBy(id = "sort-by-select")
        private WebElement selectCheap;

        public void selectLowestPrice()
        {
            selectElementFromDropdown(selectCheap,"Fiyata Göre (Önce En Düşük)");
        }

        @FindBy(id = "product-list-add-to-cart-5889405")
        private WebElement buyProduct;

        public void BuyProduct()
        {
            clickFunction(buyProduct);
        }

        @FindBy(id = "basket-flyout-cart")
        private WebElement completeOrder;

        public void CompleteOrder()
        {
            clickFunction(completeOrder);
        }

        @FindBy(xpath = "//*[@id=\"js-cart-app\"]/div[4]/div/div/a/span")
        private WebElement continueOrder;

        public void ContinueOrder()
        {
             clickFunction(continueOrder);
        }

        @FindBy(name = "street")
        private WebElement homeAddress;

        public void WriteHomeAddress(String WriteHomeAddress)
        {
              sendKeysFunction(homeAddress,WriteHomeAddress);
        }

        @FindBy(name = "housenumber")
        private WebElement doorNumber;

        public void DoorNumber(String DoorNumber)
        {
              sendKeysFunction(doorNumber, DoorNumber);
        }

        @FindBy(xpath = "//*[@id=\"personaldata\"]/div[2]/div/div/div/div[2]/form/div[9]/div/div/div/address-remote-options/remote-options/select[1]")
        private WebElement remoteOptions;

        public void RemoteOptions()
        {
                selectElementFromDropdown(remoteOptions,"ANKARA");
        }



}

