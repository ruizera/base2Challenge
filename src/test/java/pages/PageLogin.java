package pages;

import org.openqa.selenium.By;

public class PageLogin {

	protected By btnEntrar = By.xpath("//input[@value='Entrar']");;

	protected By txtUsername = By.id("username");
	protected By txtSenha= By.id("password");

}