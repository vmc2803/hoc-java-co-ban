import java.util.*;

/*
    Bài tập tổng hợp kiến thức Java Basic
    Luyện tập method và try-catch
*/

public class Main {
    public static void main(String[] args) {
        inThanhNgang();

        Scanner input = new Scanner(System.in);
        ArrayList<String> danhSachMonHoc = new ArrayList<>();

        nhapTenMonHoc(danhSachMonHoc, input);

        xoaTenMonHoc(danhSachMonHoc, input);

        double ketQuaGPA = tinhGPA(danhSachMonHoc, input);

        inThanhNgang();
        System.out.println("KẾT QUẢ HỌC TẬP CỦA BẠN: ");
        System.out.println("GPA cuối cùng: " + String.format("%.2f", ketQuaGPA));
    }

    public static void inThanhNgang(){
        System.out.println("---------------------------------------");
    }

    public static void nhapTenMonHoc(ArrayList<String> dsMonHoc, Scanner sc){
        System.out.println("Nhập tên các môn học (Gõ 'done' để dừng)");

        while(true){
            String tenMonHoc = sc.nextLine();
            if(tenMonHoc.equals("done")){
                break;
            }else{
                dsMonHoc.add(tenMonHoc.toUpperCase());
            }
        }
    }

    public static void xoaTenMonHoc(ArrayList<String> dsMonHoc, Scanner sc){
        System.out.println("Bạn có muốn xóa môn nào không ? (Y/N)");

        String luaChon = sc.nextLine();

        if(luaChon.equalsIgnoreCase("y")){
            System.out.println("Bạn muốn xóa môn nào ?");
            String monCanXoa = sc.nextLine().toUpperCase();

            if(dsMonHoc.contains(monCanXoa)){
                dsMonHoc.remove(monCanXoa);
                System.out.println("Đã xóa thành công môn: " + monCanXoa);
            }else{
                System.out.println("Không tìm thấy môn để xóa!");
            }
        }

        System.out.println("Danh sách cập nhật: " + dsMonHoc);

    }

    public static double tinhGPA(ArrayList<String> ds,Scanner sc) {
        double tongDiemHeSo = 0;
        int tongTinChi = 0;

        for (String mon : ds) {
            System.out.println(mon);

            try {
                System.out.println("Nhập điểm: ");
                double diem = Double.parseDouble(sc.nextLine());
                System.out.println("Nhập số tín chỉ: ");
                int tinChi = Integer.parseInt(sc.nextLine());

                tongDiemHeSo += (diem * tinChi);
                tongTinChi += tinChi;

            } catch (Exception e) {
                System.out.println("Có lỗi xảy ra, vui lòng thử lại");
            }
        }

        if(tongTinChi > 0){
            return tongDiemHeSo / tongTinChi;
        }

        return 0;
    }
}
