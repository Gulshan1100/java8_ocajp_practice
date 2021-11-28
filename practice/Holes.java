import java.util.*;
public class Holes{
	static int f=0;
	
	 static int check(String s,String t,int index){
		
        if(s.substring(0,index).equals(t.substring(0,index))  &&  index<s.length() && index<t.length()){
           check(s,t,index+1);
		   f++;
        }
		return f;
	}
	
	public static void main(String[] args){
		System.out.println(check("hello","hell",0));
	
	}
}