class A1{
	enum Books{
		Mybook("java"),Yourbook(".net"),Hisbook("c++"),Otherbook("hello"),Allbook(20);
		//Otherbook("hello");
		
			Books(String title){
				this.title=title;
			}
			Books(int n){
				this.n=n;
			}
			public int getN(){
				return n;
			}
			public String getTitle(){
				return title;
			}
			int n;
			String title;
	};
	public static void main(String args[]){
		Books b=Books.Mybook;
		Books a=Books.Allbook;
		System.out.println(b);
		System.out.println(a);
		System.out.println(b.getTitle());
		System.out.println(a.getN());
		System.out.println(Books.valueOf("Mybook"));
		System.out.println(Books.Mybook);
		System.out.println(b.values());
		//System.out.println(b.valuesOf());
		System.out.println(b.ordinal());
		for(Books b1:Books.values()){
			System.out.print(b1);
			System.out.println(b1.ordinal());
		}
		System.out.println(b.equals(Books.Mybook));
		System.out.println(b==Books.Mybook);
		switch(b){
			case Mybook:System.out.println("hey");
				break;
			case Yourbook:System.out.println("hey hey");
				break;
			case Hisbook:System.out.println("hey hey hey");
				break;
		//	case Nobook:break;
		}
	}
}