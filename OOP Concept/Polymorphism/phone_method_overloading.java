class phone_method_overloading{
	//method overload same name different numbers or counting
	void m1(int a){
		System.out.println("Calling first m1: "+a);
	}
	void m1(int a, int b){
		System.out.println("Calling second m1: "+(a+b));
	}
	//method overload same name different datatype
	void m1(char a){
		System.out.println("Calling third m1: "+a);
	}
	

	public static void main (String args[]){
		phone_method_overloading pn = new phone_method_overloading();
		pn.m1(20,50);
		pn.m1('a');
		pn.m1(98);
	}
}