class P{
	public static void main(String args[]){
		
		for(int i=2;i<=10;i++){
			
			if(i==6){
				continue;
			}
			System.out.println(i);
		}

		int x,y;
		skip:
		for(x=2;x<4;x++){
			
			System.out.println("X: "+x);
			for(y=2;y<=6;y++){
				System.out.println("Y: "+y);
				if(x==y){
					System.out.println("Skipped");
					continue skip ;
				}
			}
		}
	}
}

/*
>>The continue statement skips the current iteration of a loop (for, while, and do...while loop).
When continue statement is executed, control of the program jumps to the end of the loop. 
Then, the test expression that controls the loop is evaluated. 
In case of for loop, the update statement is executed before the test expression is evaluated.


>>Labeled continue Statement
The continue statement we have discussed till now is unlabeled form of continue,
 which skips the execution of remaining statement(s) of innermost for,
 while and do..while loop.
There is another form of continue statement,
 labeled form, that can be used to skip the execution of statement(s) that lies inside the outer loop.


>>The break statement terminates the loop immediately, 
and the control of the program moves to the next statement following the loop.
It is almost always used with decision making statements (if...else Statement).

>>Labeled break Statement
The break statement we have discussed till now is unlabeled form of break statement, 
which terminates the innermost for, while, do..while and switch statement. 
There is another form of break statement, 
labeled break, that can be used to terminate the outer loop.

*/