/*public*/ enum Hello{Myhello,YourHello,HisHello};
class W{
	enum Books{MyBook,YourBook,HisBook};
	 Books b;
	public static void main(String args[]){
		Books b=Books.MyBook;
		W a=new W();
		System.out.println(a.b);
		System.out.println(b);
		Hello h=Hello.Myhello;
		System.out.println(h);
		
	}
}