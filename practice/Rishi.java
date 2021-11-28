import java.util.Scanner;
class Rishi{
	private String str;
	public String getStr(){
		return str;
	}
	public void setStr(String str){
		this.str=str;
	}
	public void acceptStr(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string: ");
		str=s.nextLine();
	}
	public void showStr(){
		System.out.println("String: "+str);
	}
	public static void main(String args[]){
		String a=new String();
		String b=new String("hello");
		char ch[]={'h','e','l','l','o'};
		int sI=2,num=3;
		String c=new String(ch,sI,num);
		byte by[]={65,66,67,68,69,70,71};
		int sI2=3;
		int num2=3;
		String d=new String(by,sI2,num2);
		String e="Welcome";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		int h='l';
		System.out.println(a.indexOf(a));
		System.out.println(b.indexOf(h));
		System.out.println("world".indexOf('o'));
		
		
		System.out.println(b.lastIndexOf("l"));
		
		
	//	System.out.println(e.charAt(7));		Stringindexoutofbound
		System.out.println(e.charAt(6));
		System.out.println(e.charAt(num2));
		System.out.println("far Away".charAt(3));
		
		
		System.out.println(e.toUpperCase());
		
		
		System.out.println(e.toLowerCase());
		
		
		if(e.equals("Welcome")){
			
			System.out.println("Equals");
		}
		
		
		if(e.equalsIgnoreCase("WELCOMe")){
			
			System.out.println("Equals");
		}
		
		int i=0;
		for(i=0;i<=6;i++){
			
			System.out.print(e.charAt(i));
		}
		
		if(e.startsWith("wel")){
			System.out.println("Equal");
		}
	
	
	}
}