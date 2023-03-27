//SwitchCase 

import java.util.*;
public class SwitchCase{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("what you want : burger ,pizza,colddrik,samosa,exit : ");
		String food =sc.next();
			
			switch(food) {
				case "exit" : return;
				case "burger" : System.out.println("okay deliver in 5 mins");
							break;
				case "pizza" : System.out.println("okay deliver in 20 mins");
							break;
				case "samosa": System.out.println("okay deliver in 90 mins");
							break;
				default :System.out.println("sorry we have not");
			}
			sc.close();
		}
	}
}	
		
		
		
		
		
