import java.util.Scanner;

public class th4ptbac1 {
    public static void main(String[] args) {
        System.out.println("Cho phương trình a * x + b = c, nhập số:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();
        if (a!=0){
            double x = (c-b)/a;
            System.out.println("Phương trình có nghiệm duy nhất x = "+x);
        } else {
            if (b==c){
                System.out.println("Phương trình vô số nghiệm x!");
            } else
                System.out.println("Phương trình vô nghiệm");
        }
    }
}
