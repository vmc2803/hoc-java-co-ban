import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //nhập tên cổ phiếu
        System.out.print("Nhập tên cổ phiếu: ");
        String stockName = input.nextLine();

        //Nhập giá mua vào
        System.out.print("Nhập giá mua vào: ");
        double buyPrice = Double.parseDouble(input.nextLine());

        //nhập giá hiện tại
        System.out.print("Nhập giá hiện tại: ");
        double currentPrice = Double.parseDouble(input.nextLine());

        //nhập số lượng sở hữu
        System.out.print("Nhập số lượng: ");
        int quantity = Integer.parseInt(input.nextLine());

        double Profit = (currentPrice - buyPrice) * quantity;
        if(Profit > 0){
            System.out.println("Bạn lãi. Chúc mừng bạn đã lãi số tiền " + Profit);
        }else if(Profit < 0){
            System.out.println("Bạn đang lỗ "+ Profit + ". Hãy bình tĩnh gồng lỗ");
        }else{
            System.out.println("Bạn đang hòa vốn. Hãy kiên nhẫn thêm");
        }

        input.close();
        }
    }