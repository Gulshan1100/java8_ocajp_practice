import java.io.*;
class F2{
	public static void main(String[] args)throws IOException{
		File f=new File("abc.txt");
		f.createNewFile();
		FileWriter fw=new FileWriter(f,true);
		fw.write("Suck it");
		fw.close();
		FileReader fr=new FileReader("abc.txt");
		char[] ch=new char[(int)f.length()];
		fr.read(ch);
		for(char ch1:ch){
			System.out.println(ch1);
		}
	}
}