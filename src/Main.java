import java.util.*;

/*
    LUYỆN TẬP VỚI FOR LOOP

    Bài tập thực hành: Dự báo tăng trưởng tài sản (Compound Interest)
Đề bài:
Viết một chương trình cho phép người dùng nhập vào số vốn ban đầu và lãi suất kỳ vọng mỗi năm.
Chương trình sẽ sử dụng vòng lặp for để tính toán và in ra số tiền người dùng có sau mỗi năm,
liên tục trong 5 năm.

Yêu cầu kỹ thuật:

1. Sử dụng vòng lặp for (int i = 1; i <= 5; i++).

2. Kết quả số tiền mỗi năm phải được định dạng chỉ lấy 2 chữ số thập phân
bằng cách dùng String.format("%.2f", total).

Ví dụ mẫu (Example):

Input:

Nhập số vốn ban đầu (triệu VNĐ): 100

Nhập lãi suất kỳ vọng (%/năm): 10 (tức là 0.1)

Output:
--- BÁO CÁO DỰ KIẾN TĂNG TRƯỞNG TRONG 5 NĂM ---
Năm 1: 110.00 triệu VNĐ
Năm 2: 121.00 triệu VNĐ
Năm 3: 133.10 triệu VNĐ
Năm 4: 146.41 triệu VNĐ
Năm 5: 161.05 triệu VNĐ
 */


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hãy nhập số vốn ban đầu của bạn: ");
        int soVonBanDau = Integer.parseInt(input.nextLine());
        System.out.print("Hãy nhập số lãi suất kỳ vọng bạn mong muốn: ");
        double laiSuatKyVong = Double.parseDouble(input.nextLine());

        double soTien = 0;

        for(int i = 1; i <= 5; i++){
            soTien = soTien + (soTien * laiSuatKyVong / 100);
        }
        input.close();
        String formatted = String.format("%.2f", soTien);
        System.out.println("Số tiền của bạn dự kiến là: " + formatted);
    }
}