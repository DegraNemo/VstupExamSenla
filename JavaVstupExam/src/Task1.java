import java.util.Scanner;
import java.util.Random;
public class Task1 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
        System.out.println("Guess the word:");
        String [] slov = {"castle", "sofa", "elephant", "bicycle", "fish"};
        Random rand = new Random();
        int mi = 0; int ma = 4;
        int rndslv = rand.nextInt(ma - mi) + mi;
        char [][] buk = new char[slov[rndslv].length()][2];
        for (int i = 0; i <= slov[rndslv].length() - 1; i++){
            buk [i][0] = slov[rndslv].charAt(i);
            buk [i][1] = '_';
            System.out.print(buk[i][1]);
        }
        System.out.println(" ");
        int life = 3;
        int con = slov[rndslv].length() + 1;
        
        while (life > 0 && con > 0) {
            int count = con;
            System.out.println("Enter the letter:");
            String b = in.nextLine();
            char bu = b.charAt(0);
            for (int i = 0; i < slov[rndslv].length(); i++){
                if ( bu == buk[i][0]){
                    buk[i][1] = buk [i][0];  
                    con--;
                                  
                }
                System.out.print(buk[i][1]);   
            }
            System.out.println(" ");
            if (con == count){
                life--;
                System.out.println("You entered the wrong letter. Attempts: " + life);
            }
            
            
        }


        
    }
}
