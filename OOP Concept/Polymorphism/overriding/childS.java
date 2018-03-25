class parentS{
	void m1(){
		System.out.println("parent Method"); // overriden method
	}
}
class childS extends parentS{
	void m1(){
		System.out.println("Child Method"); // overriding method
	}
	void m2(){
		System.out.println("Direct Method");// direct method
	}
	
	public static void main(String args[]){
		parentS p = new childS();
		p.m1(); // compile : parentS   runtime: childS
	//	p.m2(); // compile : parentS   runtime: error becoz no m2 in parentS class
		childS c=(childS)p;
		c.m2();
	}


}