package seleniumsessions;

public class AmazonTest {
	
	public static void main(String[] args) {
		
		BrowserUtil brUtil= new BrowserUtil();
		brUtil.initDriver("chrome");
		brUtil.luanchURL("");
		System.out.println("title of the application is  "+brUtil.getPageTitle());
		brUtil.closeBrowser();
	}
	
	

}
