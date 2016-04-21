import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by alexoro on 3/7/16.
 */
public class Aerospace {

    public class Ship implements Comparable{
        public String name;
        public char type;
        public int x;
        public int y;

        public Ship(String name, char type, int x, int y){
            this.name = name;
            this.type = type;
            this.x = x;
            this.y = y;
        }

        public void moveForward(){
            switch(this.type){
                case 'A':
                    this.x-=10;
                    break;
                case 'B':
                    this.x-=20;
                    break;
                case 'C':
                    this.x-=30;
                    break;
                default:
                    this.x-=10;
                    break;
            }
        }

        @Override
        public int compareTo(Object o) {

            if(o instanceof Ship){
                Ship o2 = (Ship)(o);
                if(o2.x < this.x){return 1;}
                else if(o2.x > this.x){return -1;}
                else if(o2.x == this.x){
                    if(o2.y > this.y){
                        return 1;
                    }else{
                        return -1;
                    }
                }
            }

            return 0;
        }
        @Override
        public String toString(){
            return this.name + "_" + this.type + ":" + this.x + "," + this.y;
        }
    }

    public static void main(String[] args) throws FileNotFoundException{
        Aerospace a = new Aerospace();
        a.start(args);
    }
    public void start(String[] args) throws FileNotFoundException{
        Scanner s = new Scanner(new File("JudgingInputs/Prob07.in.txt"));
        int cases = Integer.parseInt(s.nextLine());
        for(int i = 0;i<cases;i++){
            int numLines = Integer.parseInt(s.nextLine());
//            PriorityQueue<Ship> ships = new PriorityQueue<Ship>();
            Ship[] ships = new Ship[numLines];
            int numShips = 0;
            for(int j = 0;j<numLines;j++){
                String shipString = s.nextLine();
                String[] shipData = shipString.split("[_|:|,]");
                Ship ship = new Ship(shipData[0], shipData[1].charAt(0), Integer.parseInt(shipData[2]), Integer.parseInt(shipData[3]));
//                ships.add(ship);
                ships[numShips] = ship;
                numShips++;
            }
//            System.out.println(ships);
//            for(int i = 0;i<ships.lengthl)
//            for (int j = 0; j < ships.length; j++) {
//                System.out.print(ships[j]);
//            }
//            System.out.println();
            Arrays.sort(ships);
//            for (int j = 0; j < ships.length; j++) {
//                System.out.print(ships[j]);
//            }
//            System.out.println();

//            boolean shipsPresent = false;
            int shipsKilled = 0;
            while(shipsKilled < numLines){
                System.out.print("Destroyed Ship: ");
                System.out.print(ships[0].name);
                System.out.print(" xLoc: ");
                System.out.println(ships[0].x);
                shipsKilled++;
                for (int j = 0; j < ships.length; j++) {
                    ships[j].moveForward();
                }
                Ship[] ships2 = new Ship[ships.length-1];
                int ships2num = 0;
                for (int j = 1; j < ships.length; j++) {
                    ships2[ships2num] = ships[j];
                    ships2num++;
                }
                ships = ships2;
                Arrays.sort(ships);
//                shipsKilled++;
            }

        }


    }

}
