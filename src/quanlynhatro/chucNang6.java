package quanlynhatro;

import java.util.ArrayList;
import java.util.Scanner;

public class chucNang6 {
    String thoiGian;
    String tenTB;
    String tinhTrang;
    String hoTen;
    Scanner sc = new Scanner(System.in);
    ArrayList<chucNang6> list = new ArrayList<>();
    chucNang6 vao;

    public static void main(String[] agrs) {
        chucNang6 run = new chucNang6();
        run.nhap();
        run.xuat();
    }

    public chucNang6() {
    }

    public chucNang6(String tenTB, String tinhTrang) {
        this.tenTB = tenTB;
        this.tinhTrang = tinhTrang;
    }

    public void nhap() {
        System.out.print("Nhập thời gia kiểm tra: ");
        thoiGian = sc.nextLine();
        System.out.print("Nhập họ và tên người kiểm tra: ");
        hoTen = sc.nextLine();

        int n;
        System.out.print("Nhập số lượng thiết bị kiểm tra: ");
        n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Thiết bị thứ: " + (i + 1));
            System.out.print("Nhập tên thiết bị: ");
            tenTB = sc.nextLine();
            System.out.print("Nhập tình trạng thiết bị: ");
            tinhTrang = sc.nextLine();

            vao = new chucNang6(tenTB, tinhTrang);
            list.add(vao);
        }
    }

    public void xuat() {
        System.out.println("-------------------------------------------");
        System.out.println("Họ và tên người kiểm tra: " + hoTen);
        System.out.println("Thời gian đã kiểm tra: " + thoiGian);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Tên thiết bị: " + list.get(i).tenTB);
            System.out.println("Tình trạng thiết bị: " + list.get(i).tinhTrang);
            System.out.println("");
        }
    }
}
