class Toh{
	public static void move(int n,char A,char C,char B){
		if(n==0){
			return;
		}
		move(n-1,A,B,C);
		System.out.println("Moving "+n+" from disc "+A+" to "+C);
		move(n-1,B,C,A);
	}
	public static void main(String[] args){
		move(3,'A','C','B');
		
	}
}