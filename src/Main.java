//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            //khai báo tên cổ phiếu
            String stockName = "VNM";

            //Khai báo giá mua (số thực)
            double buyPrice = 110.5;

            //Khai báo số lượng mua (số nguyên)
            int quantity = 100;

            //Tính tổng tiền
            double total = buyPrice * quantity;

            System.out.println("Bạn vừa mua " + quantity + " cổ phiếu "+ stockName);
            System.out.println("Tổng số tền là: " + total);
        }
    }