import java.util.*;

/*
    Bài tập tổng hợp kiến thức Java Basic
    Luyện tập method và try-catch
*/

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> subjectList = new ArrayList<>();

        //gọi hàm nhập môn học
        nhapTenMonHoc(subjectList, input);

        //gọi hàm xóa môn học
        xoaTenMonHoc(subjectList, input);

        //gọi hàm tính GPA
        tinhDiemGPA();

        //in kết quả cuối
        System.out.println("GPA của bạn là: " + gpa);
    }

    public static void nhapTenMonHoc(ArrayList<String> subjectList, Scanner input){
        System.out.println("Nhập tên môn học (Gõ 'done' để dừng");

        while(true){
            String monHoc = input.nextLine();
            if(monHoc.equals("done")){
                break;
            }else{
                subjectList.add(monHoc);
            }
        }
    }

    public static void inRaManHinh(ArrayList<String> subjectList, Scanner input){
        System.out.println("");
    }

    public static void xoaTenMonHoc(ArrayList<String> subjectList,Scanner input){

    }

    public static double tinhDiemGPA(ArrayList<> subjectList,Scanner input){

    }
}