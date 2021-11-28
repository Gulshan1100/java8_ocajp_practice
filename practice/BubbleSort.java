import java.util.Scanner;
class BubbleSort{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] input=new int[n];
		int temp=0;
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++){
			input[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.print(input[i]);
			
		}
		System.out.println();
		for(int i=0;i<n-2;i++){
			for(int j=0;j<n-1-i;j++){
				if(input[j]>input[j+1]){
					temp=input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(input[i]+" ");
		}
	}
}