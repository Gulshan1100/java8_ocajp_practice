import java.util.Scanner;
class Zombie{
	public static void main(String args[]){
		String shot;
		int hit=0,miss=0;
		Scanner s=new Scanner(System.in);
		shot=s.nextLine();
		for(int i=0;i<shot.length();i++){
			
			
			if(shot.charAt(i)=='1'){
				hit++;
				miss=0;
				
		//		if(hit%3==0){
			//		kcnt++;
				//}
			}
			else if(shot.charAt(i)=='0'){
				
				miss++;
				if(miss==5){
					break;
				}
				else{
					continue;
				}
			}
			else{
				return;
			}
		}
		System.out.print(hit/3);
	}
}