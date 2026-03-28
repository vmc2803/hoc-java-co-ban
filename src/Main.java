import java.util.*;

/*
    Học và thực hành với ArrayList
    // Cú pháp tổng quát:
    ArrayList<Kiểu_Dữ_Liệu> tênBiến = new ArrayList<>();

    Lưu ý cực quan trọng: ArrayList không chơi với kiểu dữ liệu nguyên thủy (int, double, boolean). Nó chỉ chơi với các "Lớp bao" (Wrapper Classes).

    int -> Integer
    double -> Double
    boolean -> Boolean

    Khái niệm & Ý nghĩa
    ArrayList là một "Mảng động" (Resizable Array) nằm trong gói java.util.

    Khái niệm: Khác với Mảng thông thường có kích thước cố định ngay khi tạo, ArrayList có thể tự động thay đổi kích thước của nó khi bạn thêm hoặc xóa phần tử.

    Ý nghĩa: Nó giải quyết bài toán "Tôi không biết người dùng sẽ nhập bao nhiêu dữ liệu". Bạn không còn phải lo lỗi "vượt quá giới hạn mảng" hay lãng phí bộ nhớ khi khai báo quá dư thừa.

    Cách dùng (Các phương thức phổ biến)
    Giả sử chúng ta có một danh sách ArrayList<String> tuiDo = new ArrayList<>();
    Hành động	    Lệnh	                    Giải thích
    Thêm mới	    tuiDo.add("Laptop");	    Nhét thêm đồ vào cuối danh sách.
    Lấy ra	        tuiDo.get(0);	            Lấy đồ ở vị trí số 0 (giống tuiDo[0]).
    Sửa đổi	        tuiDo.set(0, "Macbook");	Thay đồ ở vị trí 0 bằng đồ mới.
    Xóa bỏ	        tuiDo.remove(1);	        Vứt đồ ở vị trí số 1 đi, các đồ sau tự dồn lên.
    Kích thước	    tuiDo.size();	            Hỏi xem trong túi đang có bao nhiêu món (thay vì .length).

    Ví dụ minh họa ngoài đời thực:
    Mảng (Array): Giống như Dãy ghế trong rạp chiếu phim. Khi rạp đã xây xong 100 ghế, bạn không thể nhét thêm người thứ 101 vào dãy đó được. Muốn thêm, bạn phải xây hẳn một cái rạp mới.

    ArrayList: Giống như Danh sách bạn bè trên Facebook. Hôm nay bạn có 10 người bạn, mai có 100 người, ngày kia bạn hủy kết bạn với 2 người. Danh sách tự động "dài ra" hoặc "ngắn lại" mà bạn không cần phải xây lại Facebook từ đầu.

    Ví dụ luyện tập đơn giản: "Danh sách theo dõi (Watchlist)"
    Thay vì hỏi người dùng "Nhập bao nhiêu mã", chúng ta hãy để họ nhập thoải mái cho đến khi họ gõ chữ "EXIT" thì dừng lại.

    Nhiệm vụ của bạn:
    Khai báo một ArrayList<String> watchList.

    1.Dùng vòng lặp while(true) để người dùng nhập tên mã cổ phiếu liên tục.

    2.Nếu người dùng nhập "EXIT" (không phân biệt hoa thường), dùng lệnh break để thoát vòng lặp.

    3.Ngược lại, dùng .add() để đưa mã đó vào watchList.

    4.Cuối cùng, dùng vòng lặp for (hoặc for-each) để in ra: "Bạn đang theo dõi [Số lượng] mã: [Danh sách tên mã]".

    Gợi ý nhỏ: Bạn có thể dùng watchList.size() để biết họ đã nhập bao nhiêu mã.
*/

public class Main {
    public static void main(String[] args) {
        ArrayList<String> watchList = new ArrayList();
        System.out.println("Nhập tên mã cổ phiếu: ");
        Scanner input = new Scanner(System.in);

        while(true){
            String maCoPhieu = input.nextLine();

            if(maCoPhieu.equalsIgnoreCase("exit")){
                break;
            }else{
                watchList.add(maCoPhieu);
            }
        }

        for(String maCoPhieu : watchList){
            System.out.println("Bạn đang theo dõi số lượng mã: " + watchList.size() + " mã " + maCoPhieu);
        }
    }
}