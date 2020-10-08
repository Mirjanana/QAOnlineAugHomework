package pages;

public class Imdb {
	
		private HomePage homePage;
		private SignInPage signInPage;
		private CreateNewAccountPage createNewAccountPage;
		
		public HomePage getHomePage(){
		if (homePage == null){
			homePage = new HomePage();
		}
		return homePage;
		}
		
		public SignInPage getsignInpage() {
		if(signInPage == null) {
			signInPage = new SignInPage();
				
		}
		return signInPage;
}
		public CreateNewAccountPage getcreateNewAccountPage() {
			if(createNewAccountPage == null) {
				createNewAccountPage = new CreateNewAccountPage();
				
			}
			return createNewAccountPage;
			
		}
}
