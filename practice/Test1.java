import java.util.Scanner;
class Test1{
	public static void main(String args[]){
		String name,add;
		Scanner a = new Scanner(System.in);
		String s = a.nextLine();
		 s = s.replace(" ","");
        String res = "";
        int row = (int)Math.floor(Math.pow(s.length(),1/2));
        int column = (int)Math.ceil(Math.pow(s.length(),1/2));
        for(int i=0;i<column;i++){
            for(int j=i;j<s.length();){
                res = res + s.charAt(j);
                j=j+row;
            
            res = res + " ";
			}
		}
		System.out.println(column);
	}
}