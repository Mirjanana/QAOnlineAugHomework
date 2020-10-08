package main;

import pages.HomePage;
import pages.Imdb;
import pages.SignInPage;

public class Main {

	public static void main(String[] args) {
		
		Imdb imdb = new Imdb();
		imdb.getcreateNewAccountPage().getEmailBox();
		imdb.getHomePage().getSearchBar();
		imdb.getsignInpage().getLinkPrivacyPolicy();
		
		
		
		
		
		
		
		
	}

}
