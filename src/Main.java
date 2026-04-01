import java.util.*;

/*
    Bài tập tổng hợp kiến thức Java Basic
    Luyện tập method và try-catch
*/

public class Main {
    public static void main(String[] args) {
        inDauGachNgang();
        System.out.println("HỆ THỐNG QUẢN LÝ DANH MỤC ĐẦU TƯ v3.0 (STABLE)");
        inDauGachNgang();

        // 1. Khai báo
        Scanner input = new Scanner(System.in);
        ArrayList<String> watchList = new ArrayList<>();

        // 2. Nhập dữ liệu (Giữ ở Main vì nó là khởi đầu)
        System.out.println("Nhập tên mã cổ phiếu (Gõ 'exit' để dừng):");
        while (true) {
            String ma = input.nextLine();
            if (ma.equalsIgnoreCase("exit")) break;
            watchList.add(ma.toUpperCase()); // Tự động viết hoa cho đẹp
        }

        // 3. Sắp xếp và Hiển thị
        Collections.sort(watchList);
        System.out.println("\nDanh sách theo dõi (" + watchList.size() + " mã): " + watchList);

        // 4. Gọi hàm Xóa mã (Kiểu void - Làm xong rồi thôi)
        xoaMaCoPhieu(watchList, input);

        // 5. Gọi hàm Tính toán (Kiểu double - Lấy kết quả về)
        double ketQuaCuoi = tinhToanLoiNhuan(watchList, input);

        // 6. Tổng kết cuối cùng
        inDauGachNgang();
        System.out.println("BÁO CÁO CUỐI CÙNG: Tổng lãi/lỗ = " + String.format("%.2f", ketQuaCuoi));
        System.out.println("Cảm ơn Chien Vu đã sử dụng hệ thống!");
        inDauGachNgang();

        input.close();
    }

    // --- KHU VỰC CÁC PHƯƠNG THỨC (METHODS) ---

    public static void inDauGachNgang() {
        System.out.println("===========================================");
    }

    public static void xoaMaCoPhieu(ArrayList<String> list, Scanner sc) {
        System.out.print("\nBạn có muốn xóa mã nào không? (Y/N): ");
        if (sc.nextLine().equalsIgnoreCase("y")) {
            System.out.print("Nhập mã muốn xóa: ");
            String target = sc.nextLine().toUpperCase();
            if (list.contains(target)) {
                list.remove(target);
                System.out.println("=> Đã xóa mã " + target);
            } else {
                System.out.println("=> Mã này không có trong danh sách.");
            }
        }
    }

    public static double tinhToanLoiNhuan(ArrayList<String> list, Scanner sc) {
        System.out.print("\nBạn có muốn tính toán lãi lỗ không? (Y/N): ");
        double total = 0;

        if (sc.nextLine().equalsIgnoreCase("y")) {
            for (String stock : list) {
                inDauGachNgang();
                System.out.println("MÃ CỔ PHIẾU: " + stock);

                // Dùng Try-Catch bao bọc toàn bộ quy trình tính toán của 1 mã
                try {
                    System.out.print(" - Nhập giá mua: ");
                    double cost = Double.parseDouble(sc.nextLine());

                    System.out.print(" - Nhập giá hiện tại: ");
                    double price = Double.parseDouble(sc.nextLine());

                    System.out.print(" - Nhập số lượng: ");
                    int volume = Integer.parseInt(sc.nextLine());

                    // Công thức tính toán
                    double profit = (price - cost) * volume;
                    System.out.println(" -> Lãi/Lỗ của " + stock + ": " + String.format("%.2f", profit));

                    total += profit; // Chỉ cộng vào tổng nếu không có lỗi xảy ra ở trên

                } catch (Exception e) {
                    System.out.println(" !!! LỖI: Dữ liệu nhập sai (phải là số). Bỏ qua mã này.");
                    // Khi gặp lỗi, máy tính nhảy xuống đây và bỏ qua dòng 'total += profit'
                }
            }
        }
        return total; // Trả con số tổng về cho hàm main
    }
}