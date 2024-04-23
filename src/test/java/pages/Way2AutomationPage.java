package pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import steps.Hooks;

public class Way2AutomationPage {
    private static Hooks hook = new Hooks();
    private static WebDriver driver = hook.getDriver();

    public WebElement getTitle(){
        return driver.findElement(By.xpath("//*[contains(text(),\"First Name\")]"));
    }

    public WebElement getAddUserButton(){
        return driver.findElement(By.xpath("//thead//button[@type='add']"));
    }

    public WebElement novakUser(){
        return driver.findElement(By.xpath("//tbody//td[3][contains(text(),'novak')]"));
    }

    public WebElement novakDeleteButton(){
        return driver.findElement(By.xpath("//tbody//td[3][contains(text(),'novak')]/parent::tr//button[@ng-click = 'delUser()']/i"));
    }

    public WebElement confirmationDialogOk(){
        return driver.findElement(By.xpath("//*[contains(text(),'Confirmation Dialog')]/parent::div/parent::div//*[contains(text(),'OK')]"));
    }

    public WebElement getAddUserFormTitle(){
        return driver.findElement(By.xpath("//div[@class = 'modal-header']//*[contains(text(), 'Add User')]"));
    }

    public WebElement getAddUserFirstName(){
        return driver.findElement(By.xpath("//div[@class = 'modal-body']//td[contains(text(),'First Name')]/following-sibling::td/input"));
    }

    public WebElement getAddUserLastName(){
        return driver.findElement(By.xpath("//div[@class = 'modal-body']//td[contains(text(),'Last Name')]/following-sibling::td/input"));
    }

    public WebElement getAddUserUserName(){
        return driver.findElement(By.xpath("//div[@class = 'modal-body']//td[contains(text(),'User Name')]/following-sibling::td/input"));
    }

    public WebElement getAddUserPassword(){
        return driver.findElement(By.xpath("//div[@class = 'modal-body']//td[contains(text(),'Password')]/following-sibling::td/input"));
    }

    public WebElement getAddUserCustomerTypeAAA (){
        return driver.findElement(By.xpath("//div[@class = 'modal-body']//td[contains(text(),'Customer')]/following-sibling::td//label[1]/input"));
    }

    public WebElement getAddUserCustomerTypeBBB (){
        return driver.findElement(By.xpath("//div[@class = 'modal-body']//td[contains(text(),'Customer')]/following-sibling::td//label[2]/input"));
    }

    public WebElement getAddUserRole(){
        return driver.findElement(By.xpath("//select[@name = 'RoleId']"));
    }

    public WebElement getAddUserEmail(){
        return driver.findElement(By.xpath("//div[@class = 'modal-body']//td[contains(text(),'E-mail')]/following-sibling::td/input"));
    }

    public WebElement getAddUserCellPhone(){
        return driver.findElement(By.xpath("//div[@class = 'modal-body']//td[contains(text(),'Cell Phone')]/following-sibling::td/input"));
    }

    public WebElement getAddUserSaveButton(){
        return driver.findElement(By.xpath("//div[@class='modal-footer']/button[contains(text(),'Save')]"));
    }

    public WebElement getNewUserFjruiz(){
        return driver.findElement(By.xpath("//tbody//td[3][contains(text(),'fjruiz')]"));
    }
}