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
        boolean isLocked = true;
        System.out.print("Xin mời bạn nhập password: ");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        while (isLocked) {
            if(password.equals("Java2026")){
                System.out.println("Chào mừng bạn quay trở lại");
            }else {
                isLocked = false;
                System.out.println("Bạn đã nhập sai mật khẩu, hãy thử lại");
            }
        }
        }
    }