package week2.day4;

public class Chrome extends Browser {
	public void openIncoginto() {
	System.out.println("Incoginto mode is on");
	}
	public void clearCache() {
System.out.println("Cache is Cleared");

	}

	public static void main(String[] args) {
	Chrome cr = new Chrome();
	cr.openIncoginto();
	cr.clearCache();
	
	

	}

}
