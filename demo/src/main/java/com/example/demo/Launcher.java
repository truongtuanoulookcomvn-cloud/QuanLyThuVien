import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nguyễn Trường Tuấn : ");
        String hoTen = scanner.nextLine();
        System.out.println("Xin chào: " + hoTen);
        scanner.close();
    }
}