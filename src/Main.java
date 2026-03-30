import java.util.*;

/*
    Bài tập tổng hợp kiến thức Java Basic
    Đề bài: "Hệ thống Quản lý Danh mục Đầu tư v3.0"
    Yêu cầu tính năng:
    Chế độ nhập liệu: Sử dụng while(true) để người dùng nhập mã cổ phiếu.
    Nhập "EXIT" để dừng.
    Mỗi khi nhập 1 mã, hãy dùng .add() vào ArrayList<String> watchList.
    Chế độ kiểm tra: * Sau khi nhập xong, hãy in ra danh sách đã được Sắp xếp A-Z.
    Hỏi người dùng: "Bạn có muốn kiểm tra chi tiết lợi nhuận không? (Y/N)".
    Chế độ tính toán (Phần khó): * Nếu chọn "Y", hãy dùng vòng lặp for-each đi qua watchList.
    Với mỗi mã, hãy yêu cầu nhập: Giá mua, Giá hiện tại, Số lượng.
    Tính lãi/lỗ và in ra ngay lập tức với định dạng %.2f.
    Cộng dồn vào một biến totalProfit tổng.
    Chế độ dọn dẹp:
    Hỏi người dùng có muốn xóa mã nào khỏi danh sách không.
    Sử dụng .contains() và .remove() để thực hiện.
    Báo cáo cuối cùng: * In ra tổng lợi nhuận cuối cùng của toàn bộ danh mục sau khi đã xóa.
    Quy trình "Chuẩn Pro" để bạn thực hiện:
    Bước 1: Viết Pseudo-code ra giấy hoặc comment vào IntelliJ. Chia nhỏ thành từng "Module" (Nhập - Sắp xếp - Tính toán - Xóa).
    Bước 2: Code từng Module một. Xong phần nào, chạy thử (Run) phần đó ngay. Đừng viết một lèo từ đầu đến cuối mới chạy, sẽ rất khó tìm lỗi.
    Bước 3: Sử dụng phím tắt Shift + F6 để đặt tên biến cho thật chuẩn (ví dụ: stockName, buyPrice, currentProfit).
    Bước 4 (Quan trọng): Thực hiện Commit thứ 13 với lời nhắn: feat: final consolidation project before OOP.
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Chào Mừng Bạn Đến Với Ứng Dụng Hệ thống Quản lý Danh mục Đầu tư v3.0");
        //Khu Vực Khai Báo
        Scanner input = new Scanner(System.in);
        ArrayList<String> watchList = new ArrayList<>();
        double tongProfit = 0;

        //Tính Năng Nhập Liệu:
        System.out.println("Nhập tên mã cổ phiếu: ");
        while(true){
            String tenMaCoPhieu = input.nextLine();
            if(tenMaCoPhieu.equalsIgnoreCase("exit")){
                break;
            }else{
                watchList.add(tenMaCoPhieu);
            }
        }

        Collections.sort(watchList);

        System.out.println("Bạn đang theo doõi tổng cộng " + watchList.size() + " mã cổ phiếu");
        for(String tenMaCoPhieu : watchList){
            System.out.println(" - " + tenMaCoPhieu);
        }
        System.out.println("Danh sách đã sắp xếp theo A-Z");

        //Chế độ tính toán lãi/lỗ
        System.out.println("Bạn có muốn kiểm tra chi tit lợi nhuận không? (Y/N)");

        String luaChon = input.nextLine();
        if(luaChon.equalsIgnoreCase("y")){
            for(String tenMaCoPhieu : watchList){
                System.out.println("Đang tính toán cho mã cổ phiếu: " + tenMaCoPhieu);
                System.out.print("Nhập giá mua: ");
                double giaMua = Double.parseDouble(input.nextLine());

                System.out.print("Nhập giá hiện tại: ");
                double giaHienTai = Double.parseDouble(input.nextLine());

                System.out.print("Nhập số lượng: ");
                int soLuong = Integer.parseInt(input.nextLine());

                double profit = (giaHienTai - giaMua) * soLuong;

                System.out.println("Hiện tại bạn đang lãi/lỗ: " + String.format("%.2f" , profit));

                tongProfit += profit;
            }

            System.out.println("Tổng lãi/lỗ của bạn hiện tại là: " + String.format("%.2f" , tongProfit));
        }

        System.out.println("Bạn có muốn xóa mã nào ra khỏi danh sách không? (Y/N)");
        String luaChonXoa = input.nextLine();
        if(luaChonXoa.equalsIgnoreCase("y")){
            System.out.println("Nhập mã bạn muốn xóa: ");
            String timKiem = input.nextLine();

            if(watchList.contains(timKiem)){
                System.out.println("Tìm thấy mã " + timKiem + " trong hệ thống");
                System.out.println("===========================================");
                System.out.println("Hệ thống đang xử lý !");
                watchList.remove(timKiem);
                System.out.println("===========================================");
            }else{
                System.out.println("Không tìm thấy mã !");
            }
        }

    }
}