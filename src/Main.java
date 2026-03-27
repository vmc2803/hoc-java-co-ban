import java.util.*;

/*
    ARRAY
    ARRAY + FOR LOOP

    Bài tập thực hành: App Quản lý Danh mục Chứng khoán (v2.0)
    Mục tiêu: Thay vì nhập và tính toán từng mã lẻ tẻ,
    chương trình sẽ cho phép người dùng khai báo toàn bộ danh mục trước,
    sau đó mới tiến hành tính toán và in báo cáo tổng kết.

    Các bước thực hiện:
    Khởi tạo: Hỏi người dùng: "Bạn muốn kiểm tra bao nhiêu mã cổ phiếu?".

    Khai báo mảng: Tạo một mảng String[] để lưu tên các mã cổ phiếu với kích thước dựa trên con số người dùng vừa nhập.

    Vòng lặp nhập tên: Dùng vòng lặp for đầu tiên để yêu cầu người dùng nhập lần lượt tên của từng mã vào mảng.

    Vòng lặp xử lý: Dùng vòng lặp for thứ hai để duyệt qua mảng tên vừa có. Với mỗi tên mã trong mảng:
    1.Hỏi giá mua vào, giá hiện tại và số lượng.
    2.Tính lãi/lỗ của mã đó theo công thức:
            Profit = (CurrentPrice - BuyPrice) * Quantity
      In kết quả lãi/lỗ của mã đó ra màn hình.
      Cộng dồn vào biến totalPortfolioProfit để tính tổng cho cả danh mục.
    Tổng kết: Sau khi vòng lặp kết thúc, in ra tổng số tiền lãi/lỗ của toàn bộ danh mục.

    Ví dụ Kiểm thử (Test Case)
Để đảm bảo code của bạn chạy đúng, hãy thử nhập theo các thông số sau:

Input:
1.  Số lượng mã muốn nhập: 2
2.  Nhập mã 1: VNM
3.  Nhập mã 2: FPT
4.  (Xử lý VNM): Giá mua 100, Giá hiện tại 110, Số lượng 100
5.  (Xử lý FPT): Giá mua 90, Giá hiện tại 85, Số lượng 200

Output mong đợi:
--- ĐANG TÍNH TOÁN DANH MỤC ---
Mã VNM: Bạn đang lãi 1000.00 VNĐ
Mã FPT: Bạn đang lỗ -1000.00 VNĐ

--- TỔNG KẾT ---
Tổng số mã đã kiểm tra: 2
Tổng lợi nhuận danh mục: 0.00 VNĐ

Gợi ý "Kỹ sư" dành cho bạn:

1.Sử dụng .length: Trong các vòng lặp for, hãy dùng i < danhMuc.length thay vì ghi cứng con số. Điều này giúp code của bạn linh hoạt hơn.
2.Vấn đề bộ nhớ: Nhớ rằng mảng bắt đầu từ vị trí 0. Đừng để vòng lặp chạy quá giới hạn kẻo bị lỗi ArrayIndexOutOfBoundsException.
3.Định dạng: Đừng quên dùng String.format("%.2f", ...) để các con số tài chính trông chuyên nghiệp và dễ đọc hơn.

*/

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bạn muốn kiểm tra bao nhiêu mã cổ phiếu? ");

        int n = Integer.parseInt(input.nextLine());

        System.out.println("Nhập tên mã: ");

        String[] tenCoPhieu = new String[n];



        double profit = 0;



        for (int i = 0; i < n; i++){

            tenCoPhieu[i] = input.nextLine();

            for(int j = 0; j < tenCoPhieu.length; j++){

                System.out.println("Nhập giá mua vào: ");

                double giaMuaVao = Double.parseDouble(input.nextLine());

                System.out.println("Nhập giá hiện tại: ");

                double giaHienTai = Double.parseDouble(input.nextLine());

                System.out.println("Nhập số lượng: ");

                int soLuong = Integer.parseInt(input.nextLine());

                System.out.println("Số tiền hiện tại của bạn là: ");

                profit = (giaHienTai - giaMuaVao) * soLuong;

            }

            double totalProfit += profit;

        }
    }
}