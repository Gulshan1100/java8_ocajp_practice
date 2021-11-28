import java.util.Scanner;
class U{
	public static void main(String args[]){
		String s="Betty got a bit of bitter better butter";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='b'){
				System.out.println("b: "+i);
			}
			else if(s.charAt(i)=='t'){
				System.out.println("t: "+i);
			}
			else{
				continue;
			}
		}
		String[] ss=s.split(" ");
		for(int i=0;i<ss.length;i++){
			System.out.println(ss[i]);
			System.out.println(ss[i].length());
		}
		for(int i=0;i<ss.length;i++){
			if(ss[i].startsWith("b")){
				System.out.println(ss[i]);
			}
			else{
				continue;
			}
		}
		Scanner a=new Scanner(System.in);
		String s1;
		System.out.println("Enter the string : ");
		s1=a.nextLine();
		if(s1.length()<3){
			System.out.println("The string not valid minimum 3 char required !! ");
			return;
		}
		for(int i=0;i<s1.length();i++){
			char c=s1.charAt(i);
			if(!(c>='a'&&c<='z' || c>='A'&&c<='z')){
				System.out.println("Kuchh bhi");
				return;
			}
			else
				continue;
		}
		System.out.println("Enter the string agn");
		s1=a.nextLine();
		if(s1.length()<5){
			System.out.println("minimum 5 char plz: ");
			return;
		}
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9'){
				continue;
			}
			else{
				System.out.println("Wrong");
				return;
			}
		}
		System.out.println("enter the 2string ");
		s=a.nextLine();
		if(s.length()<6){
			System.out.println("less than 6 char");
			return;
		}
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>='a'&&s.charAt(i)<='z' || s.charAt(i)>='A'&&s.charAt(i)<='Z' || s.charAt(i)=='@'){
				continue;
			}
			else{
				System.out.println("Wrong");
				return;
			}
		}
		String[] str=new String[10];
		for(int i=0;i<str.length;i++){
			str[i]=a.nextLine();
		}
		for(int i=0;i<str.length;i++){
			if(str[i].startsWith("A")){
				System.out.println(str[i]);
			}
			else{
				continue;
			}
		}
		for(int i=0;i<str.length;i++){
			System.out.println("Enter the string : ");
			str[i]=a.nextLine();
		}
		for(int i=0;i<str.length;i++){
			if(str[i].endsWith("h")){
				System.out.println(str[i]);
			}
			else
				continue;
		}
		
		
	}
}

