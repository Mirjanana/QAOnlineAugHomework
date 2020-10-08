package pages;

public class CreateNewAccountPage extends BasePage{
	
	private String yourNameBox = "Your name box";
	private String emailBox = "EmailBox";
	private String passwordBox = "PasswordBox";
	private String reenterPasswordBox = "ReenterPasswordBox";
	private String createYourImdbAccountButton = "Create Your Imdb AccountButton";
	
	
	public void getYourNameBox() {
		printMessage(yourNameBox); 
	}
	public void getEmailBox() {
		printMessage(emailBox); 
	}
	public void getPasswordBox() {
		printMessage(passwordBox); 
	}
	public void getReenterPasswordBox() {
		printMessage(reenterPasswordBox); 
	}
	public void getCreateYourImdbAccountButton() {
		printMessage(createYourImdbAccountButton);
	}
	

	
}
