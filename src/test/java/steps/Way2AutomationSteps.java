package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Way2AutomationPage;

import java.time.Duration;

public class Way2AutomationSteps {

    private static WebDriver driver;
    private static Way2AutomationPage page = new Way2AutomationPage();

    @When("the page is open")
    public void the_page_is_open(){
    };

    @And("verify title")
    public void verify_title() {
        page.getTitle().isDisplayed();
    }

    @Given("novak user is present on the table")
    public void novak_user_is_present_on_the_table(){
        page.novakUser().isDisplayed();
    }

    @And("i click on the delete button")
    public void i_click_on_the_delete_button(){
        page.novakDeleteButton().click();
    }

    @And("i press ok in the confirmation dialog")
    public void i_press_ok_in_the_confirmation_dialog(){
        page.confirmationDialogOk().click();
    }

    @Then("novak user is no longer present on the table")
    public void novak_user_is_no_longer_present_on_the_table() throws RuntimeException {
        try{
            page.novakUser().isDisplayed();
            throw new RuntimeException("No se borro el elemento Novak");
        } catch (NoSuchElementException e) {
        }
    }

    @When ("i click on add User button")
    public void i_click_on_add_User_button(){
        page.getAddUserButton().click();
    }

    @And("the form is diplayed")
    public void the_form_is_displayed(){
        page.getAddUserFormTitle().isDisplayed();
    }

    @And ("i fill out the form")
    public void i_fill_out_the_form(){

        page.getAddUserFormTitle().isDisplayed();
        page.getAddUserFirstName().sendKeys("Francisco José");
        page.getAddUserLastName().sendKeys("Ruiz");
        page.getAddUserUserName().sendKeys("fjruiz");
        page.getAddUserPassword().sendKeys("1234");
        page.getAddUserCustomerTypeAAA().click();
        page.getAddUserRole().click();
        page.getAddUserRole().sendKeys(Keys.ARROW_DOWN);
        page.getAddUserRole().sendKeys(Keys.ENTER);
        page.getAddUserEmail().sendKeys("fjrunrc@gmail.com");
        page.getAddUserCellPhone().sendKeys("584832089");
    }

    @And ("press the save button")
    public void press_the_save_button(){
        page.getAddUserSaveButton().click();
    }

    @Then ("the new user is added to the table")
    public void the_new_user_is_added_to_the_table(){
        page.getNewUserFjruiz().isDisplayed();
    }

}
