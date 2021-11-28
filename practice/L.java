import java.util.Scanner;
class L{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		char a;
		System.out.println("Enter the character: ");
		a=s.next().charAt(0);
		if(a>=97 ){
			if(a<=122){
				System.out.println("lowercase");
			}
		}	
		else if(a>=65){
			if(a<=90){
				System.out.println("uppercase");
			}
		}
		else
			System.out.println("Special");
	}
}