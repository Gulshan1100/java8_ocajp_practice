import java.util.Scanner;
class I{
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		String wrd;
		System.out.println("enter word: ");
		wrd=a.next();
		System.out.println(wrd);
		char c;
		System.out.println("entr char: ");
		c=a.next().charAt(0);
		System.out.println(c);
		int i;
		System.out.println("integer: ");
		i=a.nextInt();
		System.out.println(i);
		float f;
		System.out.println("float: ");
		f=a.nextFloat();
		System.out.println(f);
		double d;
		System.out.println("Double: ");
		d=a.nextDouble();
		System.out.println(d);
		double f1=9;
		float f2=(double)f1;
	}
}

/* >If we scan non numeric input in numeric variable then it gives inputmismatch exeption

*/