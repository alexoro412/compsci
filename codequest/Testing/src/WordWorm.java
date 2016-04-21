import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by alexoro on 3/6/16.
 */
public class WordWorm {

    public static void main(String[] args) throws FileNotFoundException{
        Scanner s = new Scanner(new File("JudgingInputs/Prob06.in.txt"));

        int cases = Integer.parseInt(s.nextLine());
        for(int i = 0;i<cases;i++){
            int rows = s.nextInt();
            int cols = s.nextInt();
            s.nextLine();

            char[][] board = new char[rows][cols];
            for(int j = 0;j<rows;j++){
                String row = s.nextLine();
                String[] splitRow = row.split(" ");
                for(int k = 0;k<cols;k++){
                    board[j][k] = splitRow[k].charAt(0);
                }
            }
            int numWords = s.nextInt();s.nextLine();
            for(int j = 0;j<numWords;j++){
                String word = s.nextLine();
                ArrayList<Point> locations = new ArrayList<Point>();
                for (int k = 0; k < board.length; k++) {
                    for (int l = 0; l < board[k].length; l++) {
                        if(board[k][l] == word.charAt(0)) locations.add(new Point(k,l));
                    }
                }

                ArrayList<Point> l = findNextLetter(board, locations, word, 1);
                if(!(l.isEmpty())){
                    System.out.println(word);
                }
            }
        }
    }

    private static ArrayList<Point> findNextLetter(char[][] board, ArrayList<Point> locations, String word, int k) {

        if(k>=word.length()-1 || locations.isEmpty()){
            return locations;
        }

        ArrayList<Point> newLocations = new ArrayList<Point>();

        for(Point loc : locations){
            int i = loc.x; int j = loc.y;
            if(i > 0){
                if(board[i-1][j] == word.charAt(k)) newLocations.add(new Point(i-1,j));
            }
            if(i < board.length-1){
                if(board[i+1][j] == word.charAt(k)) newLocations.add(new Point(i+1,j));
            }
            if(j < board[i].length-1){
                if(board[i][j+1] == word.charAt(k)) newLocations.add(new Point(i,j+1));
            }
            if(j > 0){
                if(board[i][j-1] == word.charAt(k)) newLocations.add(new Point(i,j-1));
            }

            if(i>0 && j<board[i].length-1){
                if(board[i-1][j+1] == word.charAt(k)) newLocations.add(new Point(i-1,j+1));
            }
            if(i>0 && j>0){
                if(board[i-1][j-1] == word.charAt(k)) newLocations.add(new Point(i-1,j-1));
            }
            if(i<board.length-1 && j<board[i].length-1){
                if(board[i+1][j+1] == word.charAt(k)) newLocations.add(new Point(i+1,j+1));
            }
            if(i<board.length-1 && j>0){
                if(board[i+1][j-1] == word.charAt(k)) newLocations.add(new Point(i+1,j-1));
            }
        }

        return findNextLetter(board, newLocations, word, k+1);//newLocations;
    }


}
