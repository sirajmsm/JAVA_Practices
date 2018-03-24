class parent{
// overriden class
	void marry(){
		System.out.println("Marry Black Girl");
	}
}
class child extends parent{
// overriding class
	void marry(){
		System.out.println("Marry White Girl");
	}
	
	public static void main(String args[]){
		//parent ovd = new child();
		//ovd.marry();
		
		new child().marry();
	}

}  