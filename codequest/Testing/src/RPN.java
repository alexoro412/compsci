import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

/**
 * Created by alexoro on 4/11/16.
 */
public class RPN {

    public static void main(String[] args) throws FileNotFoundException{
        Scanner s = new Scanner(new File("JudgingInputs/prob15.in.txt"));
        int cases = Integer.parseInt(s.nextLine());
        for(int j = 0; j < cases; j++){
            int numLines = Integer.parseInt(s.nextLine());
            for(int i = 0; i < numLines; i++){
                String problem = s.nextLine();
//                System.out.println(problem);
                System.out.println(solve(problem));
            }
        }
    }

    public static String solve(String problem){
        // expression
//        String problem = "( ( a + b ) - ( c - d ) ^ x ) + q * w";

        // convert to ArrayList
        String[] symbols2 = problem.split(" ");
        ArrayList<String> symbols = new ArrayList<String>();
        for(int i = 0; i < symbols2.length; i++){
            symbols.add(symbols2[i]);
        }
        // first pass
        // add parenthese around every variable
        for(int i = 0; i < symbols.size(); i++){
            if(!symbols.get(i).matches("[/|^|*|+|[-]|(|)]")) { // if not an operator
                symbols.add(i, "(");
                i++;
                symbols.add(i + 1, ")");
            }
        }


        // high order pass
        // parentheses around all ^ expressions
//        for(int i = 0; i < symbols.size(); i++){
        for(int i = symbols.size()-1; i >= 0; i--){
            if(symbols.get(i).equals("^")){
                parenOperator(symbols, i);
                i--;
            }
        }

        // mid order pass
        // parentheses around all * and / expressions
        for(int i = 0; i < symbols.size(); i++){
            if(symbols.get(i).matches("[/|*]")){
                parenOperator(symbols, i);
                i++;
            }
        }

        // low order pass
        // parentheses around all + and - expressions
        for(int i = 0; i < symbols.size(); i++){
            if(symbols.get(i).matches("[+|-]")){
                parenOperator(symbols, i);
                i++;
            }
        }

        // remove parentheses that surround the entire expression
        symbols.remove(0);
        symbols.remove(symbols.size()-1);

        // reconvert to string
        String p = "";
        for(String s : symbols){
            p+=s;
        }

        // evalute string with parentheses
        // add spaces in between all characters
        return pad(evaluate(p));
    }

    // adds spaces in between all characters
    public static String pad(String symbols){
        String res = "";
        for (int i = 0; i < symbols.length(); i++) {
            res += symbols.charAt(i);
            res += " ";
        }
        return res;
    }

    // recursive evaluate function
    public static String evaluate(String symbols){
        int parens = 0;

        // if just a letter, return that letter
        if (symbols.length() == 1){
            return symbols;
        }
        // if a letter followed by a parenthese, return the letter
        // i.e. e) -> e
        if (symbols.length() == 2){
            return "" + symbols.charAt(0);
        }

        boolean engulf = false;
        for(int i = 0; i < symbols.length(); i++){
            if(symbols.charAt(i) == '(') {
                // if a start paren has been found, increment the paren counter
                parens++;
                // mark that a parentheses has been encountered
                engulf = true;
            }else if(symbols.charAt(i) == ')'){
                parens--;
                // decrement the paren counter
                if(engulf && parens == 0){
                    // find the character immediately after the close paren, that is the operator to work with
                    if(!(i == symbols.length()-1)){
                        i++;
                    }

                    // if it is a close paren, there are parenthese surrounding the entire expression. Delete those and try again
                    // i.e. ((a+b)*(c/d)) -> (a+b)*(c/d)
//                    System.out.println((i) + " < " + symbols.length());
                    if(i < symbols.length() && symbols.charAt(i) == ')'){
//                        System.out.println("It happened");
                        return evaluate(symbols.substring(1,symbols.length()-1));
                    }

                    // recursive call
                    // (a+b)*(c/d) ->
                    // eval("a+b") + eval("c/d") + "*"
//                    System.out.println(symbols);

//                    if(i+2 > symbols.length()-1){
//                        return evaluate(symbols.substring(1,i)) + evaluate(symbols.substring(i+1, symbols.length()-1)) + symbols.charAt(i);
//                    }


//                    return evaluate(symbols.substring(1,i)) + evaluate(symbols.substring(i+2, symbols.length()-1)) + symbols.charAt(i);
//                    System.out.println(i);
//                    System.out.println((i+2) + ", " + (symbols.length()-1));
//                    System.out.println(symbols.substring(i+2, symbols.length()-1));
//                    System.out.println(1 + ", " + i);
//                    System.out.println(symbols.substring(i+2, symbols.length()-1));
                    return evaluate(symbols.substring(1,i)) + evaluate(symbols.substring(i+2, symbols.length()-1)) + symbols.charAt(i);
                }

                // will run if there is an extra close paren at the end:
                // i.e. a+b) -> a+b
                if(parens == -1){
                    return evaluate(symbols.substring(1,symbols.length()-1));
                }
            }
        }

        // in the event of error
        return "@";
    }

    public static void parenOperator(ArrayList<String> symbols, int index){

        int leftParens = 0;
        boolean left = false;
        for(int i = index; i >= 0; i--){
            if(symbols.get(i).equals(")")){
                leftParens++;
                left = true;
            }if(symbols.get(i).equals("(")){
                leftParens--;
                if(left && leftParens == 0){
                    symbols.add(i, "(");
                    break;
                }
            }
        }

        index++;

        int rightParens = 0;
        boolean right = false;
        for(int i = index; i < symbols.size(); i++){
            if(symbols.get(i).equals("(")){
                rightParens++;
                right = true;
            }
            if(symbols.get(i).equals(")")){
                rightParens--;
                if(right && rightParens == 0){
                    symbols.add(i+1, ")");
                    break;
                }
            }
        }

    }

}
