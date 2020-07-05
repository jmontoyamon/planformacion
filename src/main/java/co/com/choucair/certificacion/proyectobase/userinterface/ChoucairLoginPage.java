package co.com.choucair.certificacion.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to\n" +
            "login").located(By.xpath("//*[@id='nav-menu']//strong[contains(text(),'Ingresar')]"));
    public static final Target INPUT_USER = Target.the("where do we write the user").located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("where we do write the password").located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("button to confirm login").located(By.xpath("//button[contains(@class,'btn btn primary')]"));
}
