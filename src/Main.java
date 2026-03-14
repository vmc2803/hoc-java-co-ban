import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean isLocked = true;
        while (isLocked) {
            System.out.print("Xin mời bạn nhập password: ");
            Scanner input = new Scanner(System.in);
            String password = input.nextLine();

            if(password.equals("Java2026")){
                System.out.println("Chào mừng bạn quay trở lại");
            }else {
                isLocked = false;
                System.out.println("Bạn đã nhập sai mật khẩu, hãy thử lại");
            }
        input.close();
        }
        }
    }