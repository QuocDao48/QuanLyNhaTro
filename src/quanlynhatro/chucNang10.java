package quanlynhatro;

import java.util.ArrayList;
import java.util.Scanner;

public class chucNang10 {
    String hoTen;
    String thang;
    String soDien;
    String soNuoc;
    String veSinh;
    String baoTri;
    Scanner sc = new Scanner(System.in);
    ArrayList<chucNang10> list = new ArrayList<>();
    chucNang10 vao;

    public static void main(String[] agrs) {
        chucNang10 run = new chucNang10();
        run.nhap();
        run.xuat();
    }

    public chucNang10() {
    }

    public chucNang10(String baoTri) {
        this.baoTri = baoTri;
    }

    public void nhap() {
        System.out.print("Nhập họ và tên người nhập: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập tháng năm: ");
        thang = sc.nextLine();
        System.out.print("Nhập số Kwh: ");
        soDien = sc.nextLine();
        System.out.print("Nhập số m^3: ");
        soNuoc = sc.nextLine();
        System.out.print("Nhập tình trạng vệ sinh: ");
        veSinh = sc.nextLine();

        int n;
        System.out.print("Nhập số lượng thiết bị đã kiểm tra bảo trì: ");
        n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Vật thứ: " + i);
            System.out.print("Nhập vật đụng đã kiểm tra bảo trì: ");
            baoTri = sc.nextLine();

            vao = new chucNang10(baoTri);
            list.add(vao);
        }

    }

    public void xuat() {
        System.out.println("Họ tên người nhập: " + hoTen);
        System.out.println("Tháng năm: " + thang);
        System.out.println("Số Kwh: " + soDien);
        System.out.println("Số m^3: " + soNuoc);
        System.out.println("Tình trạng vệ sinh: " + veSinh);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Vật dụng đã kiểm tra: " + list.get(i).baoTri);
        }
    }
}
