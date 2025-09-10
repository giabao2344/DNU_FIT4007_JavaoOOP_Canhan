 import java.util.Scanner;

public class vidu5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tuổi sinh viên tính đến năm 2023: ");
        int tuoi = sc.nextInt();

        int namSinh = 2023 - tuoi;

        System.out.println("Năm sinh của sinh viên là: " + namSinh);
    }
}

