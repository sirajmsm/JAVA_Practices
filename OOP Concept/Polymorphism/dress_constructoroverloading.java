class dress_constructoroverloading{
	 dress_constructoroverloading(int price){
		System.out.println("The Price of the dress is "+price);
	}
	 dress_constructoroverloading(int price, int qty){
		System.out.println("Dress price and qty are : "+price+" of "+qty+" pieces");
	}
	 dress_constructoroverloading(String name){
		System.out.println("Dress name is :"+name);
	}
	
	public static void main(String args[]){
		
		new dress_constructoroverloading("Cotton Turso");
		new dress_constructoroverloading(2300);
		new dress_constructoroverloading(2500,63);
		
	}
} 