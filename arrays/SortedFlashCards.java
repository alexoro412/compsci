public class SortedFlashCards extends FlashCards{

	public SortedFlashCards(){
		super();
	}
	@Override
	public void addCard(String question, String answer){
		int indexOfInsertion = numCards;
		for(int i = 0;i<numCards;i++){
			if(question.compareTo(myQuestions[i]) <= 0){
				indexOfInsertion = i;
				/**System.out.println("Should insert a question");
				System.out.println(question);
				System.out.println(myQuestions[i]);
				System.out.println(question.compareTo(myQuestions[i]));
				*/
				break;
			}
		}
		//indexOfInsertion is the [i] of the first element to move over, and where the element should be placed
		if(numCards == myQuestions.length) doubleArrayLengths();
		for(int i = myQuestions.length-1;i>indexOfInsertion;i--){
			myQuestions[i] = myQuestions[i-1];
			myAnswers[i] = myAnswers[i-1];
		}
		myQuestions[indexOfInsertion] = question;
		myAnswers[indexOfInsertion] = answer;
		numCards++;
	}

}
