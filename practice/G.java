class G{
	public static void main(String args[]){
		int a=5;
		int b=6;
		if((b>a) && (a>++b))  // if((b==a) && (a<++b)) <If fisrt condition check  gives true it check and run the other condition if it also is true then it runs the body,,,, if the first one is not true it doesnt chck the other one>
			System.out.println("AND");
		System.out.println("a: " +a +"b: " +b);
		if((b==a) || (a<++b))  // if((b>a) || (a>++b)) <here the condition 1 checks and if it is true it wll nt check or run the other conditions>
			System.out.println("OR");
		System.out.println("a: " +a+ "b: " +b);

		a=333;
		b=666;
		String str =" ";
		System.out.println(str+a+b);
		System.out.println(str+ (a+b));
		System.out.println(a+b+str);
		str +=10;		// strng cnnt cnvrt into integr
		System.out.println(str);
		

		a+=3;
		b-=3;
		System.out.println(a);
		System.out.println(b);
		a*=3;
		b/=3;
		System.out.println(a);
		System.out.println(b);

		a=10;
		a=a+5*15;
		System.out.println(a);

		str="wellcome";
		str+=" to ";
		str+="java";		//<only += and = assignment operators can be use with string>
		System.out.println(str);

		a=10;
		b=20;
		int c=30;
		int d=b>a & c>a ? a:b>c ? b:c ; 		//variable x= (expresion) ? value if true : value if false;
		System.out.println(d);

		a=9;
		float f=9.0f;
		double d2=9.0;
		if(a==f && a==d2)
			System.out.println("equal");
		else
			System.out.println("not equal");
		

		a=65;
		char e ='A';
		if(a==e)
			System.out.println("equals");
		else
			System.out.println("not equal");
	}
}

/*	CONDITIONAL OPERATORS

	>&& operator :bothside conditions must be true,if any one false then other condition nt works it check all the conditions if any one condition is false then it wll nt check or run the other conditions.
	>|| operator: If any one condition is true it runs and if the condition is true doesnt check the other conditions.

*/