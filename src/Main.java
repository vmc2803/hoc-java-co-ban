import java.util.*;

/*
    ARRAY
    ARRAY + FOR LOOP

    Bài tập thực hành: Thử thách "Xây dựng danh mục" (Cấp độ: Dễ)
Đề bài:
Viết một chương trình thực hiện các bước sau:

1. Khai báo một mảng String[] có tên là topStocks gồm 3 phần tử.

2. Yêu cầu người dùng nhập tên 3 mã cổ phiếu yêu thích từ bàn phím và lưu chúng vào mảng.

3. Sử dụng vòng lặp for để in ra danh sách 3 mã đó kèm theo vị trí của chúng (Index).

Input:
Nhập mã 1: VNM

Nhập mã 2: FPT

Nhập mã 3: MSN

Output:
--- DANH SÁCH CỔ PHIẾU CỦA BẠN ---
Vị trí 0: VNM
Vị trí 1: FPT
Vị trí 2: MSN
 */

/*Thêm kiến thức về Array.length:
Một lời khuyên "Senior" để code chuyên nghiệp hơn
Dù code của bạn đã chạy đúng 100%, nhưng có một mẹo nhỏ giúp bạn không phải sửa code nhiều lần
nếu sau này muốn đổi từ 3 mã cổ phiếu lên 10 mã. Thay vì viết số 3 ở khắp nơi,
hãy dùng thuộc tính .length:
VD:
Thay vì: i < 3
for (int i = 0; i < topStocks.length; i++) {
    Code của bạn
}

Khi dùng topStocks.length, máy tính sẽ tự hiểu là "hãy chạy hết chiều dài của mảng này".
Nếu sau này bạn sửa new String[10],vòng lặp sẽ tự động chạy đến 10 mà bạn không cần sửa thêm chỗ nào khác.
*/

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ma co phieu: ");
        String[] topStocks = new String[10];

        for(int i = 0; i < topStocks.length; i++){
            topStocks[i] = input.nextLine();
            System.out.println("Vi tri " + i + ": " + topStocks[i]);
        }


    }
}