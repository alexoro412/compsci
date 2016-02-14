public class ArrayInsertion
{
	public static void main (String[] args)
	{
		/* inserting into an array */

		char[] guessedLetters = new char[5];

		guessedLetters[0] = 'a';
		guessedLetters[1] = 'c';
		guessedLetters[2] = 'e';
		guessedLetters[3] = 'g';

		int numLetters = 4;


		// insert 'd' into the third position (index of 2)
		// Note : there is room in the existing array!
		//        numLetters <= guessedLetters.length

		//move values to the right and insert 'd'
		int index=2;

		for(int i=numLetters; i>index; i--)
		{
			guessedLetters[i]=guessedLetters[i-1];
		}
		guessedLetters[index] = 'd';
		numLetters++;

		//print the array
		System.out.println("The current array is : ");
		for (char currLetter : guessedLetters)
		{
			System.out.print(currLetter + " ");
		}
		System.out.println("\n\n");

//****************************************************************************

		//Next, add 'b' at an index of 1


		// First we must grow the array to make room for 'b'
		if(numLetters==guessedLetters.length)
		{
			char[] temp=new char[2*numLetters];
			for(int i=0; i<numLetters; i++)
			{
				temp[i]=guessedLetters[i];
			}
			guessedLetters=temp;
		}

		//now proceed just like above
		index=1;

		for(int i=numLetters; i>index; i--)
		{
			guessedLetters[i]=guessedLetters[i-1];
		}
		guessedLetters[index] = 'b';
		numLetters++;

		//print the array
		System.out.println("The current array is : ");
		for (char currLetter : guessedLetters)
		{
			System.out.print(currLetter + " ");
		}



	}
}
