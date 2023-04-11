import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Perfect Number for Quest");
        int data=scanner.nextInt();
        isPerfect isPerfect=new isPerfect();
        isPerfect.isPerfectN(data);

    }
}