import java.util.Scanner;
class S{
	public static void main(String args[]){
		String str=new String();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string: ");
		str=s.nextLine();
		if(str.length()<5){
			System.out.println("error!! at least 5 char req.");
			return;
		}
		for(int i=0;i<str.length();i++){
			if(!(str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a' && str.charAt(i)<='z')){
				System.out.println("Error!! special char or digit found");
				return;
			}
		}
		System.out.println(str);
	}
}