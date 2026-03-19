import java.util.*;

/*Thử thách tiếp theo cấp độ 2: Cấp độ Trung bình - "Kỹ sư đa nhiệm"
Bạn đã sẵn sàng nâng cấp App quản lý tài chính chưa? Lần này chúng ta sẽ kết hợp mọi thứ đã học.

Đề bài:
Hãy viết chương trình cho phép nhập nhiều mã cổ phiếu liên tục.
Khi người dùng chọn dừng lại (N), chương trình phải in ra tổng kết:

Đếm: Bạn đã nhập tổng cộng bao nhiêu mã? (Dùng biến int count = 0).

Cộng dồn: Tổng số tiền lãi/lỗ của tất cả các mã đó là bao nhiêu?
(Dùng biến double totalProfit = 0).

Gợi ý tư duy:

Hai biến count và totalProfit phải nằm NGOÀI vòng lặp
(giống như cái túi để bạn gom nhặt tiền qua mỗi vòng vậy).

Trong vòng lặp, sau mỗi lần tính xong lãi của 1 mã, bạn hãy thực hiện:

count++ (Tăng số lượng lên 1).

totalProfit += currentProfit (Cộng thêm tiền lãi của mã vừa rồi vào tổng).

 */


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập mã cổ phiếu của bạn: ");
        String name = input.nextLine();
        boolean tiepTuc = true;
        int dem = 0;

        while(tiepTuc){
            dem ++;
            String maCoPhieu = input.nextLine();
            System.out.print("Giá mua vào của bạn: ");
            double giaMuaVao = Double.parseDouble(input.nextLine());

            System.out.print("Giá hiện tại: ");
            double giaHienTai = Double.parseDouble(input.nextLine());

            System.out.print("Số lượng: ");
            int soLuong = Integer.parseInt(input.nextLine());

            double profit = (giaMuaVao - giaHienTai) * soLuong;

            if (profit > 0) {
                System.out.println("Bạn đang lãi. Chúc mừng bạn đã lãi số tiền: " + profit);
            }else if (profit < 0) {
                System.out.println("Rất tiếc bạn đang lỗ số tiền "+ profit + ".Hãy giữ bình tĩnh");
            }else{
                System.out.println("Bạn đang hòa vốn hãy kiên nhẫn thêm để theo dõi");
            }

            String luaChon = input.nextLine();
            if(luaChon.equalsIgnoreCase("N")){
                tiepTuc = false;
            }
        }
        input.close();
    }
}