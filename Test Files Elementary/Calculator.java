import java.util.Scanner;
public class Calculator{

public static void main(String[] args){

	Scanner input =  new Scanner(System.in);
	System.out.println("please enter the numbers:");
	int number = input.nextInt();
	int number2 =  input.nextInt();
	System.out.println("please enter the operation you want to perform: 1 for sum \n , 2 for subtraction \n, 3 for multiplication \n, 4 for division ");
	int operation = input.nextInt();
	switch(operation){
		case 1 : 
			System.out.println(number + number2);
			break;
		case 2 : 
			System.out.println(number -number2);
			break;
		case 3: 
			System.out.println(number * number2);
			break;

		case 4 : 
			System.out.println(number / number2);
			break;
		default:
			System.out.println("please enter valid number");
		
			
	}

}
}