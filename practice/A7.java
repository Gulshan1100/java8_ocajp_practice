import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=0;
        T=s.nextInt();
        int[] n=new int[T];
        int[] nA=new int[T];
        int[] nB=new int[T];
        for(int i=0;i<T;i++){
            n[i]=s.nextInt();
        }
        for(int i=0;i<T;i++){
            nA[i]=n[i]/4;
            nB[i]=(n[i]-nA[i]);

        }
        for(int i=0;i<T;i++){
            System.out.println("case "+(i+1)+": "+nA[i]+" "+nB[i]);
        }
    }
}