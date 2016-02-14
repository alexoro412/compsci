public class FlashCards
{
	protected String[] myQuestions;
	protected String[] myAnswers;
	protected int numCards;

	/* initialize instance data: arrays with a length of 1, and numCards to 0 */
	public FlashCards()
	{
		myQuestions = new String[1];
		myAnswers = new String[1];
		numCards = 0;
	}

	/* helper method that doubles the two arrays (myQuestions and myAnswers) in size to hold more data */
	protected void doubleArrayLengths()
	{
		String[] newMyQuestions = new String[this.myQuestions.length*2];
		String[] newMyAnswers   = new String[this.myAnswers.length*2];
		for(int i = 0; i<myQuestions.length;i++){
			newMyQuestions[i] = myQuestions[i];
			newMyAnswers[i] = myAnswers[i];
		}
		myAnswers = newMyAnswers;
		myQuestions = newMyQuestions;
	}

	/* Adds the question and answer as a flashcard
	Hint: remember to check to see if the arrays need to double in size */
	public void addCard(String question, String answer)
	{
		if(numCards == myQuestions.length) doubleArrayLengths();
		myQuestions[numCards] = question;
		myAnswers[numCards] = answer;
		numCards++;
	}

	/* returns the question at the given index */
	public String getQuestion(int i)
	{
		return myQuestions[i];
	}

	/* returns the answer at the given index */
	public String getAnswer(int i)
	{
		return myAnswers[i];
	}

	/* returns the number of flash cards */
	public int getNumCards()
	{
		return numCards;
	}

	/* prints all the flashcards, you may want to use this method for testing!!*/
	public void printFlashCards()
	{
		for(int i=0; i<numCards; i++)
		{
			System.out.println("Q: " + getQuestion(i));
			System.out.println("A: " + getAnswer(i));
		}
	}
	public void deleteCard(int index){
		for(int i = index;i<this.getNumCards()-1;i++){
			this.myQuestions[i] = this.myQuestions[i+1];
			this.myAnswers[i] = this.myAnswers[i+1];
		}
		numCards--;
	}
}
