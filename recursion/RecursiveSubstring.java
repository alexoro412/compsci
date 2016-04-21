public class RecursiveSubstring{

	public static void printRecursive(String word, int start, int stop){
		if(start < 0 || stop > word.length()) return;
		System.out.println(word.substring(start,stop));
		printRecursive(word,start-1,stop+1);
	}

	public static void main(String[] args){
		printRecursive("abcdefghijklmnopqrstuvwxyz",12,14);
	}

}
