package week1.day3;


public class Browser {
	public String lanuchBrowser(String browserName) {
	return "Browser lanuched successfully";
	}
	public void loadUrl()
	{ 
		System.out.println("Application url loaded Successfully");
	}
	

	public static void main(String[] args) {
		Browser browserDetails = new Browser();
		browserDetails.lanuchBrowser ("firefox");
		browserDetails.loadUrl();
		
				

	}

}
