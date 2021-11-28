import java.util.*;
class Kuchh{
	public enum alph {a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,x,y,z}
	
	
	public static void main(String[] args){
		String[] str="abccddde".split("");
        Hashtable<String,Integer> h=new Hashtable<String,Integer>();
        for(int i=0;i<str.length;i++){
            int count=h.containsKey(str[i])? h.get(str[i]) : 0;
            h.put(str[i],count+(alph.valueOf(str[i]).ordinal()+1));
        }
		System.out.println(h.toString());
        System.out.println(alph.valueOf("d").ordinal()+1 );
	}
}