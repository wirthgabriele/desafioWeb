package ElementsMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPageElementMapper {

    @FindBy(id = "email_create")
    public WebElement email_create;

    @FindBy(id = "SubmitCreate")
    public WebElement SubmitCreate;
}
