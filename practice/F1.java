import java.io.*;
class F1{
	public static void main(String[] args){
		File f=new File("D:");
		String[] s=f.list();
		for(String a:s){
			System.out.println(a);
		}
	}
}