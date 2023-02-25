package quanlynhatro;

import java.util.ArrayList;
import java.util.Scanner;

public class chucNang8 extends chucNang7 {
    int soNuoc;
    String hoTen;
    String thang;
    String phong;
    Scanner sc = new Scanner(System.in);
    ArrayList<chucNang8> list = new ArrayList<>();
    chucNang8 vao;

    public static void main(String[] agrs) {
        chucNang8 run = new chucNang8();
        run.nhap();
        run.xuat();
    }

    public chucNang8() {
    }

    public chucNang8(String phong, int soNuoc) {
        this.phong = phong;
        this.soNuoc = soNuoc;
    }

    public void nhap() {
        System.out.print("Nhập họ và tên người nhập: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập tháng vào: ");
        thang = sc.nextLine();

        int n;
        System.out.print("Nhập số lượng phòng muốn nhập: ");
        n = sc.nextInt();
        sc.nextLine();
        if (n > 20) {
            System.out.println("Quá số lượng phòng để nhập.");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.print("Nhập số phòng: ");
                phong = sc.nextLine();
                System.out.print("Nhập số m^3: ");
                soNuoc = sc.nextInt();
                sc.nextLine();
                System.out.println("");

                vao = new chucNang8(phong, soNuoc);
                list.add(vao);
            }
        }
    }

    public void xuat() {
        System.out.println("------------------------------");
        System.out.println("Họ và tên người nhập: " + hoTen);
        System.out.println("Tháng: " + thang);

        int sum = soNuoc;
        sum += soNuoc;
        System.out.println("Tổng số m^3: " + sum);

    }
}
