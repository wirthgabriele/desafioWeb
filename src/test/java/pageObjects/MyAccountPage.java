package pageObjects;

import elementsMapper.MyAccountPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class MyAccountPage extends MyAccountPageElementMapper {

    public MyAccountPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void sendKeysEmail_create(String keys) {
        email_create.sendKeys(keys);
    }

    public void clickSubmitCreate() {
        SubmitCreate.click();
    }

    public void doMyAccount(String keys) {
        sendKeysEmail_create(keys);
        clickSubmitCreate();
    }
}
