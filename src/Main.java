import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Game game = new Game();
        game.registerPlayers();
        game.start();
    }
    public static boolean isNumber(String valor){
        try{
            Integer.parseInt(valor);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}