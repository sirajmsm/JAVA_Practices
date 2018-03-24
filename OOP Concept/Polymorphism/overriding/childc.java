 // covariant return type in java 
 
 class parentc{
	parentc m1(){
		System.out.println("Calling parent using covariant");
		//return this;
		return new parentc();
	}
 }
 class childc extends parentc{
	childc m1(){
		System.out.println("Calling Child using covariant");
		//return this;
		return new childc();
	}
	public static void main (String args[]){
		new parentc().m1();
	}
 }