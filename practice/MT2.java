class MyRunnable implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName());
			Thread.currentThread().setName("New MyThread");
			System.out.println(Thread.currentThread().getPriority());
		}
	}
}
class MT2{
	public static void main(String[] args){
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		t.setPriority(10);
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("New Main Thread");
		System.out.println(Thread.currentThread().getPriority());
		}
	}
}