// if method was declared as final we can't override

class parentf{
	final void phonenum(){
		System.out.println("I want Android phone");
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