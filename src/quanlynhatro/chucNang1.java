package quanlynhatro;

import java.util.ArrayList;
import java.util.Scanner;

public class chucNang1 {
    int soPhong;
    String hoTen;
    String cmnd;
    Scanner sc = new Scanner(System.in);
    ArrayList<chucNang1> list = new ArrayList<>();
    chucNang1 vao;

    public static void main(String[] agrs) {
        chucNang1 run = new chucNang1();
        run.nhap();
        run.timLoi();
        run.xuat();
    }

    public chucNang1() {
    }

    public chucNang1(String hoTen, String cmnd) {
        this.hoTen = hoTen;
        this.cmnd = cmnd;
    }

    public void nhap() {
        System.out.print("Nhập số phòng: ");
        soPhong = sc.nextInt();

        if (soPhong > 20) {
            System.out.println("Không có phòng số: " + soPhong);
        } else {
            int n;
            System.out.print("Nhập số lượng người ở( tối đa là 2 người ): ");
            n = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {
                System.out.print("Nhập Họ và tên: ");
                hoTen = sc.nextLine();
                System.out.print("Nhập số CMND hoặc CCCD: ");
                cmnd = sc.nextLine();

                vao = new chucNang1(hoTen, cmnd);
                list.add(vao);
            }
        }
    }

    public void timLoi() {
        String mauCccd = "0\\d{11}";
        String mauCmnd = "[0123]\\d{8}";

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).cmnd.matches(mauCccd) || list.get(i).cmnd.matches(mauCmnd)) {
                list.get(i).cmnd += " Hợp lệ.";
            } else {
                list.get(i).cmnd += " Không hợp lệ.";

            }
        }
    }

    public void xuat() {
        System.out.println("------------------------------------");
        if (soPhong <= 20) {
            System.out.println("Số phòng: " + soPhong);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Họ và tên: " + list.get(i).hoTen);
            System.out.println("Số CMND và CCCD: " + list.get(i).cmnd);
            System.out.println("");
        }
    }
}
