import java.lang.*; 
import java.io.*; 
import java.util.*; 
class Conversion{
	int b;
	int d;
	int o;
	public int BtoD(int b){
		double dec=0;
		int rem=0;
		int i=0;
		while(b>0){
			
			rem=b%10;
			b=b/10;
			dec=dec+rem*Math.pow(2,i);
			i++;
			
		}
		int dec2=(int)dec;
		return dec2;
	}
	public String DtoB(int d){
		int[] rem=new int[100];
		int i=0;
		while(d>0){
			rem[i]=d%2;
			d=d/2;
			i++;
		}
		char[]c=new char[i];
		for(int j=0,k=i-1;j<i;j++,k--){
			c[j]=(char)(rem[k]+48);
			
		}
		return new String(c);
	}
	public int OtoD(int o){
		double dec=0;
		int rem=0;
		int i=0;
		while(o>0){
			
			rem=o%10;
			o=o/10;
			dec=dec+rem*Math.pow(8,i);
			i++;
			
		}
		int dec2=(int)dec;
		return dec2;
		
	}
	public String DtoO(int d){
		int[] rem=new int[100];
		int i=0;
		while(d>0){
			rem[i]=d%8;
			d=d/8;
			i++;
		}
		char[]c=new char[i];
		for(int j=0,k=i-1;j<i;j++,k--){
			c[j]=(char)(rem[k]+48);
			
		}
		return new String(c);
		
	}
	public String BtoO(int b){
		return DtoO(BtoD(b));
	}
	sca
		return DtoB(OtoD(o));	
	}	
}
class Test{
	public static void main(String[] args){
		Conversion c=new Conversion();
		System.out.println(c.BtoD(101));
		System.out.println(c.DtoB(5));
		System.out.println(c.OtoD(777));
		System.out.println(c.DtoO(511));
		System.out.println(c.BtoO(1));
		System.out.println(c.OtoB(5));
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	