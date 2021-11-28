import java.util.Scanner;
class PrintNum{
	public static void main(String []args){
		Scanner s = new Scanner(System.in);
		String[] str = s.nextLine().split("");
		int count = 0;
		for(String st : str){
			try{
				int i = Integer.parseInt(st);
				count++;
			}
			catch(Exception e){
				
			}
		}
		System.out.println(count);
	}
}
	