import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/*
hử thách 1: Cấp độ Dễ - "Hệ thống bảo mật lớp học"
Trong nhiệm vụ này, bạn sẽ học cách dùng while và boolean để chặn người lạ vào chương trình của mình.

Mô tả: Viết một chương trình yêu cầu người dùng nhập "Mã bí mật" để bắt đầu sử dụng App tài chính.

Yêu cầu: * Tạo một biến boolean isLocked = true;.

Sử dụng vòng lặp while (isLocked).

Bên trong, yêu cầu người dùng nhập mật khẩu (ví dụ: Java2026).

Nếu nhập đúng: Chào mừng người dùng, gạt isLocked = false để thoát vòng lặp.

Nếu nhập sai: In ra "Sai mật khẩu, hãy thử lại!" và vòng lặp tiếp tục chạy để yêu cầu nhập lại.

Gợi ý: Sử dụng .equals("Java2026") để so sánh chuỗi.
 */

public class Main {
    public static void main(String[] args) {
        //khai bao user input
        Scanner input = new Scanner(System.in);
        boolean isRunning = true;
        System.out.print("Put your password here dawg: ");

        /*code logic voi while loops -> neu nguoi dung nhap dung password->stop->end || neu
        nguoi dung nhap sai -> yeu cau nguoi dung nhap lai -> khi nao dung thi moi end chuong trinh */
        while (isRunning) {
            String password = input.nextLine();
            if (password.equals("Java2026")){
                System.out.println("Wellcome back dawg");
                isRunning = false;
            }else{
                System.out.println("Wrong password dude, do it again");
            }
        }

        //dong function scanner sau khi ket thuc chuong trinh
        input.close();

    }
}