package pageObjects;

import ElementsMapper.HomePageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class HomePage extends HomePageElementMapper {

    public HomePage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickBtnSignIn(){
        login.click();
    }

}
