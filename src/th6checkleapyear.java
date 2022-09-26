import java.util.Scanner;

public class th6checkleapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhập năm: ");
        year = scanner.nextInt();
        boolean isLeapYear=false;

        if (year%4==0){
            if (year%100==0){
                if(year%400==0){
                    isLeapYear=true;
                } else
                    isLeapYear=false;
            }
        } if(isLeapYear){
            System.out.printf("%d là năm nhuận ",year);
        }else
            System.out.printf("%d không phải năm nhuận ",year);

    }
}
