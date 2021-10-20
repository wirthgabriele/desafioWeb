package ElementsMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountCreationPageElementMapper {

    @FindBy(id = "id_gender2")
    public WebElement id_gender;

    @FindBy(id = "customer_firstname")
    public WebElement customer_firstname;

    @FindBy(id = "customer_lastname")
    public WebElement customer_lastname;

    @FindBy(id = "passwd")
    public WebElement passwd;

    @FindBy(id = "days")
    public WebElement days;

    @FindBy(css = "select#months")
    public WebElement mouths;

    @FindBy(id = "years")
    public WebElement years;

    @FindBy(id = "address1")
    public WebElement address;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "id_state")
    public WebElement state;

    @FindBy(id = "postcode")
    public WebElement postcode;

    @FindBy(id = "id_country")
    public WebElement country;

    @FindBy(id = "phone_mobile")
    public WebElement phone_mobile;

    @FindBy(id = "submitAccount")
    public WebElement submitAccount;

}
