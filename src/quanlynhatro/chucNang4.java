package quanlynhatro;

import java.util.Scanner;

public class chucNang4 {
    Scanner sc = new Scanner(System.in);
    int soPhong;
    int soKhoi;

    public void nhap() {
        System.out.print("Nhập số phòng: ");
        soPhong = sc.nextInt();
        if (soPhong > 20) {
            System.out.println("Không có phòng số: " + soPhong);
        } else {
            System.out.print("Nhập số m^2 đã sử dụng: ");
            soKhoi = sc.nextInt();
        }
    }

    public void xuat() {
        System.out.println("Phòng số: " + soPhong);
        if (soKhoi >= 15) {
            int tien = ((soKhoi - 10) * 10000) + ((soKhoi - 10) * 10200) + ((soKhoi - 10) * 10400);
            System.out.println("Số tiền nước là: " + tien);
        } else if (soKhoi >= 10) {
            int tien = ((soKhoi - 5) * 10000) + ((soKhoi - 5) * 10200);
            System.out.println("Số tiền nước là: " + tien);
        } else {
            int tien = soKhoi * 10000;
            System.out.println("Số tiền nước là: " + tien);
        }
    }
}
