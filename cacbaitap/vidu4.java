import java.util.Scanner;

public class vidu4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập cạnh b: ");
        double b = sc.nextDouble();

        System.out.print("Nhập cạnh c: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            double chuVi = a + b + c;
            double p = chuVi / 2;
            double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            System.out.printf("Chu vi tam giác: %.2f\n", chuVi);
            System.out.printf("Diện tích tam giác: %.2f\n", dienTich);
        } else {
            System.out.println("Ba cạnh vừa nhập không tạo thành tam giác hợp lệ.");
        }
    }
}

