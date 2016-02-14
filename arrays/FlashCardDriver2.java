import java.util.Scanner;               //Make the Scanner class available
import java.io.FileNotFoundException;   //Make this exception available
import java.io.File;                    //Make the File class available

public class FlashCardDriver2
{
	public static void main(String[] args) throws FileNotFoundException
	{
	        Scanner console;
	        Scanner inFile;
	        String question;
	        String fileName;
	        String answer;

	        FlashCards fc;
	        fc=new SortedFlashCards();
			console=new Scanner(System.in);

			System.out.print("Enter the Question File: ");
			fileName=console.nextLine();
			inFile = new Scanner(new File(fileName));
			while(inFile.hasNextLine())
			{
				question = inFile.nextLine();
				answer = inFile.nextLine();
				fc.addCard(question, answer);
			}
			//fc.printFlashCards();

			for(int i=0;i<fc.getNumCards();i++)
                        {   
                                String guess;
                                System.out.println("Question: " + fc.getQuestion(i));
                                guess=console.nextLine();
                                if(guess.equals(fc.getAnswer(i)))
                                System.out.println("You're correct!!");
                                else System.out.println("Sorry, the answer is: " + fc.getAnswer(i));
                        }   
			/* load the question file using the insert in order method so the questions are stored in alphabetical order
			(Hint: use yesterday to help you!) */

			//Your code here!!

			/* Asks the user all the questions in alphabetical order by question and compares the results */

			//Your code here!!
	}
}
