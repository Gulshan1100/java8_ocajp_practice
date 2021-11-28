import java.util.Scanner;
class Yamraj{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String[] code,decode;
		int n;
		n=s.nextInt();	
		code=new String[n+1];
		decode=new String[n+1];
		for(int i=0;i<code.length;i++){
			code[i]=s.nextLine();
			decode[i]="";
		}
		
		for(int i=0;i<n+1;i++){
				String c[]=code[i].split("");
				int p=(code[i].length())/2;
			//	decode[i]=decode[i].concat(c[c.length-1]);
			//	System.out.println(decode[i]);
				for(int j=c.length-1;j>=0;j--){
					if(decode[i].length()==c.length){
						break;
						
					}
					try{	
						decode[i]=decode[i].concat(c[j]);
						if((code[i].length())%2!=0){
							decode[i]=decode[i].concat(c[j-(p+1)]);
						}
						else{
							decode[i]=decode[i].concat(c[j-p]);
						}
					}
					catch(ArrayIndexOutOfBoundsException ae){
						continue;
					}
				//	decode[i]=decode[i].trim();
					
				}
		}
		for(int i=0;i<n+1;i++){
			System.out.println(decode[i]);
		}
	}
}