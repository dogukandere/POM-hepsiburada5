package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.ReusableMethods;

public class HepsiburadaPage extends ReusableMethods {
    WebDriver driver;

    public HepsiburadaPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    private static final By SEARCH_BOX = By.xpath("//input[@placeholder='Ürün, kategori veya marka ara']");
    private static final By SEARCH_BUTTON = By.xpath("//div[@class='searchBoxOld-yDJzsIfi_S5gVgoapx6f']");
    private static final By POPUP = By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]");
    private static final By LOGO = By.xpath("//a[@title='Hepsiburada']//*[name()='svg']//*[name()='path' and contains(@fill,'#FF6000')]");
    private static final By LOGIN_BUTTON = By.xpath("//span[@title='Giriş Yap']");
    private static final By LOCATION_BUTTON = By.xpath("//div[@class='shipping-src-universal-partials-ShippingLocation-components-locationSelector-button-ShippingLocationSelectorButton__locationLabel']");

    public HepsiburadaPage acceptPopup(){

        click(POPUP);
        return this;
    }

    public boolean loginButtonCheck(){

        return isDisplayed(LOGIN_BUTTON);
    }

    public boolean locationButtonCheck(){

        return isDisplayed(LOCATION_BUTTON);
    }

    public boolean logoControl(){

        return isDisplayed(LOGO);
    }

    public HepsiburadaPage searchProduct(String productname){

        sendKeys(SEARCH_BOX,productname);
        return this;
    }

    public HepsiburadaPage searchClick(){

        click(SEARCH_BUTTON);
        return this;
    }
}
