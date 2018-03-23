
class TShirt{
	enum TshirtSizes{Small,Medium,Large}
	TshirtSizes tsize;
}



public class EnumValues{
	public static void main(String args[]){
		TShirt ts = new TShirt();
		ts.tsize = TShirt.TshirtSizes.Medium;
		System.out.println("T-Shirt Size is : "+ts.tsize);
	}

}