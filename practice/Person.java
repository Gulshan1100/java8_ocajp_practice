import java.util.Scanner;
class Person{
	enum Gender{
		Male,Female;
		public static Gender acceptGender(){
			Scanner s=new Scanner(System.in);
			String str=s.nextLine();
			if(str.trim().toLowerCase().equals("male")){
				return Male;
			}
			else{
				return Female;
			}
		}
	};
		protected String name;
		protected int age;
		protected Gender gender;
	//	public Person(String name,int age,Gender gender){
	//		this.name=name;
	//		this.age=age;
	//		this.gender=gender;
	//	}
		public void acceptData(){
			Scanner s=new Scanner(System.in);
			System.out.println("enter the name: ");
			name=s.nextLine();
			System.out.println("enter the age: ");
			age=s.nextInt();
			System.out.println("Enter the age: ");
			gender=Gender.acceptGender();
		}
		public void showData(){
			System.out.println("Name: "+name);
			System.out.println("age: "+age);
			System.out.println("Gender: "+gender);
		}
		public static void main(String args[]){
			Person p=new Person();
			p.acceptData();
			p.showData();
		}
}