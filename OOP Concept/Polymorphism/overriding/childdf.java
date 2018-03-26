class parentdf{
  //public void m1(){	
	protected void m1(){
		System.out.println("parent");
	}
}
class childdf extends parentdf{
    //protected void m1(){
	public void m1(){
		System.out.println("child");
	}
	
	public static void main(String args[]){
	
		parentdf pdf = new childdf();
		pdf.m1();
	}
}