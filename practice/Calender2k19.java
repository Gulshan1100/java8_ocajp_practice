import java.util.Scanner;
class Calender2k19{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int day,month;
		System.out.println("2k19");
		System.out.println("Enter the Day: ");
		day=s.nextInt();
		
		if(day<=31 && day!=0){
			
			System.out.println("enter the no.of month: ");
			month=s.nextInt();
			
			switch(month){
				case 1:
					day+=1;
					break;
				case 2:
					if(day<=28){
					day+=4;
					}
					else{
						System.out.println("Invalid date");
						return;
					}
					break;
				case 3:
					day+=4;
					break;
				case 4:
					if(day<=30){
						day+=0;
						break;
					}
					else{
						System.out.println("Invalid day");
						return;
					}
				case 5:
					day+=2;
					break;
				case 6:
					if(day<=30){
						day+=5;
						break;
					}
					else{
						System.out.println("Invalid day");
						return;
					}
				case 7:
					day+=0;
					break;
				case 8:
					day+=3;
					break;
				case 9:
					if(day<=30){
						day+=6;
						break;
					}
					else{
						System.out.println("Invalid day");
						return;
					}
				case 10:
					day+=1;
					break;
				case 11:
					if(day<=30){
						day+=4;
						break;
					}
					else{
						System.out.println("Invalid date");
						return;
					}
				case 12:
					day+=6;
					break;
				default:
					System.out.println("Invalid month");
					return ;
				
		
			}
		}
		else{
			System.out.println("Invalid day");
			return;
		}
		day=day%7;
		
			switch(day){
				case 0:
					System.out.println("sunday");
					break;
				case 1:
					System.out.println("Monday");
					break;
				case 2:
					System.out.println("Tuesday");
					break;
				case 3:
					System.out.println("wednessday");
					break;
				case 4:
					System.out.println("thrusday");
					break;
				case 5:
					System.out.println("friday");
					break;
				case 6:
					System.out.println("sat.");
					break;
				default :
					System.out.println("Invalid date");
			
			
			}
			
			
		
			
			
		}
		
	}
