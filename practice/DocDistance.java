import java.util.*;
class DocDistance{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String[] str1=s.nextLine().split(" ");
		String[] str2=s.nextLine().split(" ");
		Hashtable<String,Integer> h1=new Hashtable<String,Integer>(str1.length);
		Hashtable<String,Integer> h2=new Hashtable<String,Integer>(str2.length);
		for(int i=0;i<str1.length;i++){
			int count=h1.containsKey(str1[i]) ? h1.get(str1[i]) : 0;
			h1.put(str1[i],count+1);
		}
		for(int i=0;i<str2.length;i++){
			int count=h2.containsKey(str2[i]) ? h2.get(str2[i]) : 0;
			h2.put(str2[i],count+1);
		}
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		int adotb=0;
		int asq=0;
		int bsq=0;
		
		if(str1.length>=str2.length){
			for(int i=0;i<str2.length;i++){
				if(h1.containsKey(str2[i])){
					adotb=adotb+(h2.get(str2[i])*h1.get(str2[i]));
					asq=asq+ (h1.get(str2[i])*(h1.get(str2[i])) );
					bsq=bsq+ (h2.get(str2[i])*(h2.get(str2[i])) );
				}
			}
		}
		else{
			for(int i=0;i<str1.length;i++){
				if(h2.containsKey(str1[i])){
					adotb=adotb+(h1.get(str1[i])*h1.get(str1[i]));
					asq=asq+ (h1.get(str1[i])*(h1.get(str1[i])) );
					bsq=bsq+ (h2.get(str1[i])*(h2.get(str1[i])) );
				}
			}	
		}
		System.out.println((adotb/Math.sqrt(asq*bsq)));
	}
}