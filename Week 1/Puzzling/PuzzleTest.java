import java.util.ArrayList;
public class PuzzleTest{
    public static void main(String[] args){
        PuzzleJava puzzle = new PuzzleJava();
    ArrayList<Integer> rolls = new ArrayList<Integer>(); 
    puzzle.getTenRolls(rolls);
    System.out.println(rolls);
    // char randomChar = 
    System.out.println(puzzle.getRandomLetter());
    System.out.println(puzzle.generatePassword());
    ArrayList<String> list = puzzle.getNewPasswordSet(10);
    System.out.println(list);
    }
}