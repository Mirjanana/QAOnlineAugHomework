package pages;

public class SignInPage extends BasePage {
	private String createNewAccountButton = "Create New Account Button";
	private String signInWithGoogle = " Sign in with google";
	private String signInWithFacebook = "Sign in with facebook";
	private String linkPrivacyPolicy = "Link privacy policy";
	
	
	
	public void getCreateNewAccountButton() {
		printMessage(createNewAccountButton);
	}
	public void getSignInWithGoogle() {
		printMessage(signInWithGoogle);
	}
	public void getSignInWithFacebook() {
		printMessage(signInWithFacebook);
	}
	public void getLinkPrivacyPolicy() {
		printMessage(linkPrivacyPolicy);
	}
	
	

}
