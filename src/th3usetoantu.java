import java.util.Scanner;
//diện tích hcn:
public class th3usetoantu {
    public static void main(String[] args) {
        float width,height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều rộng: ");
        width = scanner.nextFloat();
        System.out.println("Nhập chiều cao: ");
        height = scanner.nextFloat();
        float area = width*height;
        System.out.println("Diện tích: "+area);
    }
}
