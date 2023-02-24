package quanlynhatro;

import java.util.Scanner;

public class chucNang3 {
    Scanner sc = new Scanner(System.in);
    int soPhong;
    int soDien;

    public void nhap() {
        System.out.print("Nhập số phòng: ");
        soPhong = sc.nextInt();
        if (soPhong > 20) {
            System.out.println("Không có phòng số: " + soPhong);
        } else {
            System.out.print("Nhập số kWh đã sử dụng: ");
            soDien = sc.nextInt();
        }
    }

    public void xuat() {
        System.out.println("Phòng số: " + soPhong);
        if (soDien >= 100) {
            int tien = ((soDien - 75) * 3600) + ((soDien - 75) * 3800) + ((soDien - 50) * 4000);
            System.out.println("Số tiền điện là: " + tien);
        } else if (soDien >= 50) {
            int tien = ((soDien - 25) * 3600) + ((soDien - 25) * 3800);
            System.out.println("Số tiền điện là: " + tien);
        } else {
            int tien = soDien * 3600;
            System.out.println("Số tiền điện là: " + tien);
        }
    }
}
