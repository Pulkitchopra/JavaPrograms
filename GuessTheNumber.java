package practice;
import java.util.Random;
import java.util.Scanner;


class Game{
	
	public int userNumber;
	public int inputNumber;
	public int noOfGuesses;
	
	
	public int getNoOfGuesses() {
		return noOfGuesses;
	}
	public void setNoOfGuesses(int noOfGuesses) {
		this.noOfGuesses = noOfGuesses;
	}
	
	 Game() {
		
		Random rand = new Random();
		this.userNumber = rand.nextInt(100);
	}
	
	public void takeUserInput() {
		
		System.out.println("Guess the number: ");
		Scanner sc = new Scanner (System.in);
		inputNumber= sc.nextInt();
	}
	
	boolean isCorrect() {
		
		noOfGuesses++;
		if(inputNumber == userNumber) {
			System.out.format("You have entered the corrcet number %d\nYou guessed it in %d attempts", userNumber, noOfGuesses);
			return true;
				
		}
		else if(inputNumber<userNumber){
			
			System.out.println("The entered number is less");
			
		}
		else if(inputNumber>userNumber){
			
			System.out.println("The entered number is greater");
			
		}
		return false;
	}

}

public class JavaClass {
	
	
	public static void main(String[] args) {

		Game g = new Game();
		boolean b =false;
		while(!b) {
		g.takeUserInput();
		b = g.isCorrect();
	
	
		}
	}

}
