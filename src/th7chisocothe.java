import java.util.Scanner;

public class th7chisocothe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight,height,bmi;
        System.out.println("Cân nặng của bạn: ");
        weight = scanner.nextDouble();
        System.out.println("Chiều cao của bạn: ");
        height = scanner.nextDouble();
        bmi = weight/Math.pow(height,2);
        System.out.printf("%-20s%s","bmi","Chỉ số\n");
        if (bmi<18)
            System.out.printf("%-20s%s",bmi,"Thiếu cân");
        else if (bmi<25.0)
            System.out.printf("%-20s%s",bmi,"Bình thường");
        else if (bmi<30.0)
            System.out.printf("%-20s%s",bmi,"Hạng nặng");
            else
            System.out.printf("%-20s%s",bmi,"Béo phì");
    }
}
