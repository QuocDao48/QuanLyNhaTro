package quanlynhatro;

import java.util.ArrayList;
import java.util.Scanner;

public class chucNang7 {
    String hoTen;
    String thang;
    int soDien;
    String phong;
    Scanner sc = new Scanner(System.in);
    ArrayList<chucNang7> list = new ArrayList<>();
    chucNang7 vao;

    public static void main(String[] agrs) {
        chucNang7 run = new chucNang7();
        run.nhap();
        run.xuat();
    }

    public chucNang7() {
    }

    public chucNang7(String phong, int soDien) {
        this.phong = phong;
        this.soDien = soDien;
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
            System.out.println("Quá số lượng phòng có thể nhập." + n);
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.print("Nhập số phòng: ");
                phong = sc.nextLine();
                System.out.print("Nhập số Kwh: ");
                soDien = sc.nextInt();
                sc.nextLine();
                System.out.println("");

                vao = new chucNang7(phong, soDien);
                list.add(vao);
            }
        }
    }

    public void xuat() {
        System.out.println("------------------------------");
        System.out.println("Họ và tên người nhập: " + hoTen);
        System.out.println("Tháng: " + thang);
        for (int i = 0; i < list.size(); i++) {
            int sum = soDien;
            sum = sum + list.get(i).soDien;
            System.out.println("Tổng số Kwh: " + sum);
        }
    }
}
