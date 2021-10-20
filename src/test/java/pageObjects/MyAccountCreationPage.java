package pageObjects;

import ElementsMapper.MyAccountCreationPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;
import utils.Utils;

public class MyAccountCreationPage extends MyAccountCreationPageElementMapper {
    Utils utils = new Utils();
    public MyAccountCreationPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }
        public void clickGender() {
            id_gender.click();
        }

        public void sendKeysCustomerFirstname(String keys) {
            customer_firstname.sendKeys(keys);
        }

        public void sendKeysCustomerLastname(String keys) {
            customer_lastname.sendKeys(keys);
        }

        public void sendKeysPasswd(String keys) {
            passwd.sendKeys(keys);
        }

        public void selectDays() {
            utils.selectInfoByWebElement(days, "8");
        }

        public void selectMonths() {
            utils.selectInfoByWebElement(mouths, "4");
        }

        public void selectYears() {
            utils.selectInfoByWebElement(years, "1990");
        }

        public void sendKeysAddress(String keys) {
            address.sendKeys(keys);
        }

        public void sendKeysCity(String keys) {
            city.sendKeys(keys);
        }

        public void selectsState() {
            utils.selectInfoByWebElement(state, "10");
        }

        public void sendKeysPostcode(String keys) {
            postcode.sendKeys(keys);
        }

        public void selectCountry() {
            utils.selectInfoByWebElement(country, "21");
        }

        public void sendKeysPhoneMobile(String keys) {
            phone_mobile.sendKeys(keys);
        }

        public void clickSubmitAccount() {
            submitAccount.click();
        }

}
