import java.util.Random;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
        final String spec="^$?!@#%&";
        final String jigit="1234567890";
        final String letter="qwertyuiopasdfghjklzxcvbnm";
        final String Letter="QWERTYUIOPASDFGHJKLZXCVBNM";
        String [] symba = {spec, jigit, letter, Letter};
        System.out.println("Введите длину пароля: ");
        int blin = in.nextInt();
        Random rand = new Random();
        String pass = "" ;
        int x = 0;
        int y = 0;
        int z = 0;
        int t = 0;
        do {
            for (int i  = 0; i < blin ; i++){
                String bebr = symba[rand.nextInt(4)+0];
                switch (bebr) {
                    case spec:
                        x++;
                        break;
                    case jigit:
                        y++;
                        break;
                    case letter:
                        z++;
                        break;
                    case Letter:
                        t++;
                        break;
                    default:
                        break;
                }
                pass = pass + bebr.charAt(rand.nextInt(bebr.length() ) + 0);
            }
        } while(x == 0 || y == 0 || z == 0 || t == 0);
        System.out.println("Ваш пароль: " + pass);
    }
}
