import java.util.Scanner;               //Make the Scanner class available
import java.io.FileNotFoundException;   //Make this exception available
import java.io.File;                    //Make the File class available
import java.util.Random;
public class FlashCardDriver3{

public static void main(String[] args) throws FileNotFoundException
	{
	        Scanner console;
	        Scanner inFile;
	        String question;
	        String fileName;
	        String answer;
	        Random rand;
	        FlashCards fc;
	        fc=new FlashCards();
			console=new Scanner(System.in);
			rand=new Random();

			//load the question file
			System.out.print("Enter the Question File: ");
			fileName=console.nextLine();
			inFile = new Scanner(new File(fileName));
			while(inFile.hasNextLine())
			{
				question = inFile.nextLine();
				answer = inFile.nextLine();
				fc.addCard(question, answer);
			}

			//Ask the user how many turns they would like to take
			//System.out.print("How many turns would you like to take? ");
			//int numTurns=console.nextInt();
			//console.nextLine();

			//Ask the questions and compare the answers
			while(fc.getNumCards()>0)
			{
				int questionNum=rand.nextInt(fc.getNumCards());
				String guess;
				System.out.println("Question: " + fc.getQuestion(questionNum));
				guess=console.nextLine();
				if(guess.equals(fc.getAnswer(questionNum)))
				System.out.println("You're correct!!");
				else System.out.println("Sorry, the answer is: " + fc.getAnswer(questionNum));
				fc.deleteCard(questionNum);
				//fc.printFlashCards();
			}
	}
}
