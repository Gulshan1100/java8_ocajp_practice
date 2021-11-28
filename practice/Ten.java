import java.util.Scanner;
class Ten {
	public static void main(String args[]) {
		char x;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a character");
		x = a.nextLine().charAt(0);
		for(int i=65; i<=90; i++) {
			if(x==i) {
				System.out.println("Enter value is in Upper case");
				return;
			}
		}
		for(int j=97; j<=122; j++) {
			if(x==j) {
				System.out.println("Enter value is in Lower case");
				return;
			}
			
		}	
				System.out.println("Special");
		
	}


}