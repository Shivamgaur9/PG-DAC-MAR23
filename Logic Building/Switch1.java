//switch case:
public class Switch1{
	public static void main(String args[]){
		int day =1;
		String str;
		switch(day) {
			case 1 : str = " Monday";
			case 2 : str = " Tuesday";
			case 3 : str = " Wednesday";break;
			case 4 : str = " Holiday ";
			case 5 : str = " funday";
			default : str = " wrong output";
		}
		System.out.println("hello" + str);
	}
}