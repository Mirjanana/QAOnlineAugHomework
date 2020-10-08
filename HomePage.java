package pages;

public class HomePage extends BasePage {
	private String searchBar = "SearchBar";
	private String signInButton = "SignInButton";
	private String searchButton = "SearchButton";
	
	public void getSearchBar() {
		printMessage(searchBar);
	}
	
	public void getSignInButton() {
		printMessage(signInButton);
	}
	
	public void getSearchButton() {
		printMessage(searchButton);
	}

}


