import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giải phương trình bậc 2");
        System.out.print("Nhập a:\t");
        double a = scanner.nextDouble();
        System.out.print("Nhập b:\t");
        double b = scanner.nextDouble();
        System.out.print("Nhập c:\t");
        double c = scanner.nextDouble();

        QuadraticEquation QuadraticEquation = new QuadraticEquation(a, b, c);
        double delta = QuadraticEquation.delta();
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm !!!");
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép X1 = X2 = " + QuadraticEquation.nghiemKep());
        } else {
            System.out.println("Phương trình có 2 nghiệm là: ");
            System.out.println("X1 = " + QuadraticEquation.nghiemThuNhat());
            System.out.println("X2 = " + QuadraticEquation.nghiemThuHai());
        }
    }
}

