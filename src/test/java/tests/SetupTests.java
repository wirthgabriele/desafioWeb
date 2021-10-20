package tests;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.HomePage;
import pageObjects.MyAccountCreationPage;
import pageObjects.MyAccountPage;
import utils.Browser;
import utils.Utils;

import javax.rmi.CORBA.Util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SetupTests extends BaseTests {

    Faker faker = new Faker();
    @Test
    public void testOpeningBrowserAndLoadingPage() {
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrimos o navegador e carregamos a url");
    }

    @Test
    public void testCreateAccount() throws InterruptedException {
        // Iniciar as páginas
        HomePage home = new HomePage();
        MyAccountPage myAccount = new MyAccountPage();
        MyAccountCreationPage myAccountCreationPage = new MyAccountCreationPage();

        // Clicar no botão SignIn da Home
        Thread.sleep(3000);
        home.clickBtnSignIn();
        System.out.println("Clicamos no botão Sign In");

        // Preencher e-mail e clicar em Create an account
        myAccount.doMyAccount(faker.name().username() + "@mail.com");
        System.out.println("Preenchemos o e-mail e clicamos em Create an account");

        // Preencher cadastro e clicar em Register
        Thread.sleep(3000);
        myAccountCreationPage.clickGender();
        myAccountCreationPage.sendKeysCustomerFirstname("Maria");
        myAccountCreationPage.sendKeysCustomerLastname("Silva");
        myAccountCreationPage.sendKeysPasswd("teste12345");
        Thread.sleep(3000);
        myAccountCreationPage.selectDays();
        myAccountCreationPage.selectMonths();
        myAccountCreationPage.selectYears();
        myAccountCreationPage.sendKeysAddress("ABC");
        myAccountCreationPage.sendKeysCity("Orlando");
        myAccountCreationPage.selectsState();
        myAccountCreationPage.sendKeysPostcode("12345");
        myAccountCreationPage.selectCountry();
        myAccountCreationPage.sendKeysPhoneMobile("991919191");
        myAccountCreationPage.clickSubmitAccount();
        System.out.println("Preenchemos o cadastro e clicamos em Register");

        String createAccount = Browser.getCurrentDriver().findElement(By.tagName("h1")).getText();
        assertEquals("MY ACCOUNT", createAccount);

    }

}
