 interface WebDriver{
	 void gdrive();
	 void mdrive();
 }
 class FirefoxDriver implements WebDriver{
	 void gdrive(){
		System.out.println("Calling Google Drive");
	 }
	 void mdrive(){
		System.out.println("Calling Microsoft Azure Drive");
	 }
	 void awsdrive(){
		System.out.println("Calling amazon drive");
	 }
	 void oneDrive(){
		 System.out.println("Calling one drive");
	 }
	 
	 
	 public static void main(String args[]){
		WebDriver drive = new FirefoxDriver();
		drive.gdrive();
		drive.mdrive();
	 }
	 
	
 }