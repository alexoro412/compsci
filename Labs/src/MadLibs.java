/**
 * Created by alexoro on 10/9/15.
 */import java.util.*;

public class MadLibs{

    public static void main(String[] args){

        Scanner sin = new Scanner(System.in);
        System.out.println("Enter 8 nouns: (now)");
        String noun1 = sin.nextLine();
        String noun2 = sin.nextLine();
        String noun3 = sin.nextLine();
        String noun4 = sin.nextLine();
        String noun5 = sin.nextLine();
        String noun6 = sin.nextLine();
        String noun7 = sin.nextLine();
        String noun8 = sin.nextLine();

        System.out.println("Enter a BS latin noun");
        String latin = sin.nextLine();

        System.out.println("Enter an adjective");
        String adjective1 = sin.nextLine();

        System.out.println("Enter an adverb");
        String adverb1 = sin.nextLine();
        System.out.println("Enter 2 verbs");
        String verb1 = sin.nextLine();
        String verb2 = sin.nextLine();
        System.out.print(noun1);
        System.out.print(noun1 + " is the study of the general and " + adjective1 + " nature of " + noun2 + ", " + noun3 + ", " + noun4 + ", and " + noun5 + ". The The Ancient Greek word φιλοσοφία (" + latin + ") was probably coined by Pythagoras and " + adverb1 + " means \"love of wisdom\" or \"" + verb1 + " of " + noun6 + "\". Philosophy has been " + verb2 + " into many sub-fields. It has been divided by topic, the major topics being epistemology, " + noun7 + ", metaphysics, ethics, and " + noun8);

    }

}