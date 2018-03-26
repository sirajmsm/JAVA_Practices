class parentSt{
	static void m1(){
		System.out.println("parent calling");
	}
}
class childSt extends parentSt{
	static void m1(){
		System.out.println("Child Calling");
	}
	public static void main(String args[]){
		parentSt c = new childSt();
		c.m1();
	}

}