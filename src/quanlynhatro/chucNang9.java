package quanlynhatro;

import java.util.ArrayList;
import java.util.Scanner;

public class chucNang9 {
    String hoTen;
    String thangNam;
    String ngay;
    String tinhTrang;
    Scanner sc = new Scanner(System.in);
    ArrayList<chucNang9> list = new ArrayList<>();
    chucNang9 vao;

    public static void main(String[] agrs) {
        chucNang9 run = new chucNang9();
        run.nhap();
        run.xuat();
    }

    public chucNang9() {
    }

    public chucNang9(String ngay, String tinhTrang) {
        this.ngay = ngay;
        this.tinhTrang = tinhTrang;
    }

    public void nhap() {
        System.out.print("Nhập họ và tên người kiểm tra: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập tháng và năm: ");
        thangNam = sc.nextLine();

        int n;
        System.out.print("Nhập số lần kiểm tra: ");
        n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập ngày dọn vệ sinh: ");
            ngay = sc.nextLine();
            System.out.print("Nhập tình trạng vệ sinh: ");
            tinhTrang = sc.nextLine();

            vao = new chucNang9(ngay, tinhTrang);
            list.add(vao);
        }

    }

    public void xuat() {
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Tháng năm: " + thangNam);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Ngày dọn vệ sinh: " + list.get(i).ngay);
            System.out.println("Tình trạng vệ sinh: " + list.get(i).tinhTrang);
        }
    }
}
