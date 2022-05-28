package Project1;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String className = input.nextLine();

        // Checking the implementation of the Position class
        if(className.equals("Position")){
            Position p1 = new Position(input.nextInt(), input.nextInt());
            System.out.println(p1);
            p1.setX(5);
            System.out.println(p1.getX());

            Position p2 = new Position(5, 10);
            System.out.println(p1.equals(p2));
        }

        // Checking the implementation of the Map class
        else if(className.equals("Map")){
            try{
                Map map = new Map(input);
                map.print();
                int size = map.getSize();
                System.out.println(size);
                System.out.println(map.getValueAt(size/2, size/2));
            }
            catch(Exception e){

            }
        }

        // Checking the Player interface and the MyPlayer class
        else if(className.equals("Player")){
            Player player = new MyPlayer();
            System.out.println(Player.class.isInterface());
            System.out.println(player instanceof Player);
            System.out.println(player instanceof MyPlayer);
        }

        // Checking the InvalidMapException class
        else if(className.equals("Exception")){
            try{
                throw new InvalidMapException("Some message");

            }
            catch(InvalidMapException e){
                System.out.println(e.getMessage());
            }
        }

        // Checking the Game class and all of its components
        else if(className.equals("Game")){

            // Initialize player, map, and the game
            Player player = new MyPlayer();
            Game game = null;

            try{
                game = new Game(new Map(input));
            }
            catch(InvalidMapException e){ // custom exception
                System.out.println(e.getMessage());
                System.exit(0);
            }

            game.addPlayer(player);

            // Make the player move based on the commands given in the input
            String moves = input.next();
            char move;
            for(int i=0; i<moves.length(); i++){
                move = moves.charAt(i);
                switch(move){
                    case 'R':
                        player.moveRight();
                        break;
                    case 'L':
                        player.moveLeft();
                        break;
                    case 'U':
                        player.moveUp();
                        break;
                    case 'D':
                        player.moveDown();
                        break;
                }
            }
            // Determine the final position of the player after completing all the moves above
            Position playerPosition = player.getPosition();
            System.out.println("Player final position");
            System.out.println("Row: " + playerPosition.getY());
            System.out.println("Col: " + playerPosition.getX());
        }
    }
}

/*
Enter your code here.
Create all the necessary classes and methods as per the requirements.
*/
// START of your code
interface Player{
    Position getPosition();
    void moveUp();
    void moveLeft();
    void moveDown();
    void moveRight();
    void setMap(Map map);
}

class MyPlayer implements Player{
    Position position;
    char sign;
    Player player;
    Map map;

    public void setMap(Map map){
        this.map = map;
        for(int i = 0; i < map.getSize(); i++){
            for(int j = 0; j < map.getSize(); j++){
                sign = map.getValueAt(i, j);
                if (sign == 'P'){
                    position = new Position(0 , 0);
                    position.setX(j);
                    position.setY(i);
                }
            }
        }
    }

    public void moveRight(){
        if(position.getX() < map.getSize()-1){
            if(map.getValueAt(position.getY(), position.getX() +1) != '1'){
                position.setX(position.getX()+1);
            }
        }
    }

    public void moveLeft(){
        if(position.getX() >= 1){
            if(map.getValueAt(position.getY(), position.getX()-1) != '1'){
                position.setX(position.getX() + 1);
            }
        }
    }

    public void moveDown(){
        if(position.getY() < map.getSize()-1){
            if(map.getValueAt(position.getY() +1, position.getX()) != '1'){
                position.setY(position.getY() + 1);
            }
        }
    }

    public void moveUp(){
        if(position.getY() >= 1){
            if(map.getValueAt(position.getY() - 1, position.getX()) != '1'){
                position.setY(position.getY()-1);
            }
        }
    }

    public Position getPosition(){
        return position;
    }
}

class Map{
    int size;
    char[][] map;
    Scanner entry;
    Player player;
    char firstNumber = '0';
    char secondNumber = '1';
    char letterP = 'P';
    String string1 = "Not enough ";
    String string2 = "map elements";
    String string3 = "Map size can ";
    String string4 = "not be zero";

    public Map(Scanner entry) throws InvalidMapException{
        this.entry = entry;
        size = entry.nextInt();
        if(size == 0){
            throw new InvalidMapException(string3.concat(string4));
        }
        entry.nextLine();
        map = new char[size][size];
        int wi, fi;
        for(wi = 0; wi < size; wi += 1){
            for(fi = 0; fi < map[0].length; ++fi){
                map[wi][fi] = entry.next().charAt(0);
                if(map[wi][fi] == firstNumber || map[wi][fi]== secondNumber || map[wi][fi] == letterP){
                    Position p = new Position(wi,fi);
                }else{
                    throw new InvalidMapException(string1.concat(string2));
                }
            }
        }
        player = new MyPlayer();
        player.setMap(this);
        // this.map = map;
    }

    public int getSize(){
        return size;
    }

    public char getValueAt(int g, int v){
        return map[g][v];
    }

    public void print(){
        int i;
        for(char[] mapPrint: map){
            for(i = 0; i < map[0].length; i += 1){
                System.out.print(mapPrint[i] + " ");
            }
            System.out.println();
        }
    }
}

class Game{
    Map map;
    //Player player;
    public Game(Map map){
        this.map = map;
    }

    public void setMap(Map map){
        this.map = map;
    }

    public void addPlayer(Player player){
        player.setMap(map);
        // this.player = player;
    }
}

class Position {
    int x;
    int y;

    Position(){
        this(0,0);
    }

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }


    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public boolean equals(Position p2){
        if(getX() == p2.getX() && getY() == p2.getY()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}

class InvalidMapException extends Exception{
    public InvalidMapException(String note){
        super(note);
    }
}
