import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sửa lại đoạn chữ này để thử nghiệm
        System.out.print("Nguyễn Trường Tuấn: ");
        String hoTen = scanner.nextLine();

        System.out.println("-----------------------------------");
        System.out.println("Xin chào bạn: " + hoTen);
        System.out.println("Mã sinh viên: 25115053125327");
        System.out.println("Trạng thái: Đã chạy thành công và chuẩn bị push lên Git!");

        scanner.close();
    }
}