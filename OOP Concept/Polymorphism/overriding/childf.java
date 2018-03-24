// if method was declared as final we can't override

class parentf{
	final void phonenum(){
		final int a = 10;
		//int a =a+5; can't re assign because variable is final
		System.out.println("I want Android phone "+a);
	}
}

class childf extends parentf{
	/*
	void phonenum(){
		System.out.println("I want Iphone");
	}*/
	
	
	public static void main(String args[]){
		new childf().phonenum();
	}

}