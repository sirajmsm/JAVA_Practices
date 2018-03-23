
class FavouritePhone{
	enum Phones{Samsung,Iphone,Blackberry}
	Phones brands;
}
public class EnumValues2{
	public static void main(String args[]){
		FavouritePhone fp = new FavouritePhone();
		fp.brands = FavouritePhone.Phones.Iphone;
		System.out.println("My Favourite Phone is "+fp.brands);
	}
}