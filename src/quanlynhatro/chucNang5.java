package quanlynhatro;

import java.util.ArrayList;
import java.util.Scanner;

public class chucNang5 {
    int soPhong;
    String tenThietBi;
    Scanner sc = new Scanner(System.in);
    ArrayList<chucNang5> list = new ArrayList<>();
    chucNang5 vao;

    public static void main(String[] agrs) {
        chucNang5 run = new chucNang5();
        run.nhap();
        run.xuat();
    }

    public chucNang5() {
    }

    public chucNang5(String tenThietBi) {
        this.tenThietBi = tenThietBi;
    }

    public void nhap() {
        System.out.print("Nhập số phòng: ");
        soPhong = sc.nextInt();
        if (soPhong > 20) {
            System.out.println("Không có phòng số: " + soPhong);
        } else {
            int n;
            System.out.print("Nhập số lượng thiết bị muốn nhập: ");
            n = sc.nextInt();
            sc.nextLine();

            for (int i = 1; i <= n; i++) {
                System.out.println("Thiết bị: " + i);
                System.out.print("Nhập tên thiết bị: ");
                tenThietBi = sc.nextLine();

                vao = new chucNang5(tenThietBi);
                list.add(vao);
            }
        }
    }

    public void xuat() {
        System.out.println("-------------------------------------------");
        System.out.println("Số phòng: " + soPhong);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Thiết bị: " + list.get(i).tenThietBi);
        }
    }
}
