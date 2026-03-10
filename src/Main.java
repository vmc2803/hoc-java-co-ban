import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
           // 2. Tạo một "máy quét" tên là input
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập tên cổ phiếu: ");
        String stockName = input.nextLine();

        System.out.println("Nhập giá mua: ");
        double buyPrice = input.nextDouble();

        System.out.println("Nhập số lượng: ");
        int quantity = input.nextInt();

        double totalPrice = buyPrice * quantity;

        System.out.println("Kết quả: Bạn đã mua số lượng " + quantity + " " + stockName);
        System.out.println("Tổng chi phí của bạn là: "+ totalPrice + "VNĐ");

        input.close();

        }
    }