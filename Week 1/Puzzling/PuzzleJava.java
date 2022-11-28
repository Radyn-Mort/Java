import java.util.*;
public class PuzzleJava{
    
Random randMachine = new Random();
    public ArrayList<Integer> getTenRolls(ArrayList<Integer> rolls){
        for(int i = 0; i<10;i++){
            rolls.add(randMachine.nextInt(21));
        }
        return rolls;
    }
    public char getRandomLetter(){
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        return alphabet[randMachine.nextInt(26)];
    }

    public String generatePassword(){
        String password="";
        for(int i = 0 ; i<8;i++){
            password+= Character.toString(getRandomLetter());
        }

        return password;
    }

    public ArrayList<String> getNewPasswordSet(int amount){

    ArrayList<String> list = new ArrayList<String>();
        for(int i=0; i<amount; i++){
            list.add(generatePassword());
        }
        return list;
    }
}