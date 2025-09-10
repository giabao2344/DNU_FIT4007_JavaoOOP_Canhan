
import java.util.Scanner;

public class vidu3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chiều dài hình chữ nhật: ");
        double dai = sc.nextDouble();

        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double rong = sc.nextDouble();

        double chuVi = 2 * (dai + rong);
        double dienTich = dai * rong;

        System.out.printf("Chu vi hình chữ nhật: %.2f\n", chuVi);
        System.out.printf("Diện tích hình chữ nhật: %.2f\n", dienTich);
    }
}

