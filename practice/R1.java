class R1{
	public static void main(String args[]){
		String s=new String("  kuchh na kaho   ");
		String s1="ku";
		if(s.startsWith("kuc")){
			System.out.println("YEs");
		}
		if(s.startsWith(s1)){
			System.out.println("YES1");
			
		}
		if(s.startsWith("KU")){
			
			System.out.print("YES2");
		}
		if(s.endsWith("ho")){
			
			System.out.println("YESend");
		}
		String s2="ho";
		if(s.endsWith(s2)){
			
			System.out.println("YESend1");
		}
		if(s.endsWith("HO")){
			
			System.out.println("ENDS");
		}
		
		System.out.println(s);
		
		System.out.println(s.trim());
		
		System.out.println(s.substring(6));
		System.out.println(s.substring(3,8));
		
		String[] sarry=s.split(" ");
		System.out.println(sarry.length);
		
		
	}
	
}