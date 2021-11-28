class E{
	public static void main(String args[]){
		/*byte b1=10;
		byte b2=11;
		byte b3=b1+b2;
		*/
		/*char c1='a';
		char c2='b';
		char c3=c1+c2;
		System.out.println(c3);
		*/
		int b1=12;
		int b2=11;
		int b3=b1+b2;
		
		System.out.println(b3);

		/*char c=65536;   (lossy converion)
		System.out.println(c);
		*/
		/*int i=2147483648;  (integer no. is too large)
		System.out.println(i);
		*/
		byte b=122;
		b+= 6;
		System.out.println(b);

		char c=65535;
		c+=3;
		System.out.println(c);

		int i=2147483647;
		i+=2;
		System.out.println(i);

		/*byte b5,b4;
		b5=b4+b4;
		System.out.println(b);
		*/
		int a,a1=10;
		a=a1+a1;
		System.out.println(a);
		
		byte b6;
		b6=10+11;
		System.out.println(b6);
	}
}

/*	>precedence rule of assignment of values workson double,float,long,int only

	>range rule applicable on byte short char.

	>shortcut assignments += and -= removes range rule 
		and gives value in cyclic manner after range

	>variables evaluate at runtime bt values evaluate at compiletime
*/