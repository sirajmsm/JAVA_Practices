class parentprv{ 
	private void m1(){
		System.out.println("parent");
	}
}
class childprv extends parentprv{
	private void m1(){
		System.out.println("child");
	}
	
	public static void main(String args[]){
		parentprv p = new childprv();
		p.m1();
	}

}