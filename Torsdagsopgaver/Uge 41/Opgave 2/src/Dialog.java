import java.util.Scanner;

public class Dialog {
    public double number;
    public double doDiag(){
        Scanner myScan = new Scanner(System.in);
        System.out.println("Indtast varens pris: ");
        number = myScan.nextDouble();
        return number;
    }
}
