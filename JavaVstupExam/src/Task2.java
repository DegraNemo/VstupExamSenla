import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
        System.out.print("Введите валют из которой переводить (Usd, Jpy, Rub, Gbp, Eu) : ");
        String curIn = in.nextLine();
        System.out.print("Введите сумму: ");
        float value = in.nextFloat();
        float kof1= 0;
        float kof2= 0;
        float kof3= 0;
        float kof4= 0;
        float kof5= 0;
        
        switch (curIn) {
            case "Usd":
                kof1 = 1;
                kof2 = 153.47f;
                kof3 = 97.4955f;
                kof4 = 0.77059f;
                kof5 = 0.9249f;

                break;
            case "Jpy":
                kof1 = 0.006516f;
                kof2 = 1;
                kof3 = 0.6353f;
                kof4 = 0.005011f;
                kof5 = 0.006027f;

                break;
            case "Rub":
                kof1 = 0.01026f;
                kof2 = 1.5741f;
                kof3 = 1;
                kof4 = 0.00788f;
                kof5 = 0.009487f;

                break;
            case "Gbp":
                kof1 = 1.3004f;
                kof2 = 199.5709f;
                kof3 = 126.7822f;
                kof4 = 1;
                kof5 = 1.2027f;

                break;
            case "Eu":
                kof1 = 1.0812f;
                kof2 = 165.9315f;
                kof3 = 105.4119f;
                kof4 = 0.8314f;
                kof5 = 1;

                break;
        
        
            default:
                break;
        }
        float dollar = value * kof1 ;
        float rub = value * kof3;
        float yen = value * kof2;
        float gbp = value * kof4;
        float eu = value * kof5;
        System.out.println(" Usd: " + dollar + "\n Rub: " + rub + "\n Jpy: " + yen + "\n Gbp: " + gbp + "\n Eu: " + eu );

    }
}
