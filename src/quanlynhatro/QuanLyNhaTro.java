package quanlynhatro;

import java.util.Scanner;

public class QuanLyNhaTro {

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("+------------------------------------------+");
        System.out.println("|                 Nhà trọ                  |");
        System.out.println("<------------------------------------------>");
        System.out.println("| 01. Nhập và xuất thông tin khách hàng.   |");
        System.out.println("| 02. Đăng ký tạm trú tạm vắng.            |");
        System.out.println("| 03. Tính tiền điện khách hàng.           |");
        System.out.println("| 04. Tính tiền nước khách hàng.           |");
        System.out.println("| 05. Thiết bị đã được cung cấp.           |");
        System.out.println("| 06. Bảo trì thiết bị.                    |");
        System.out.println("| 07. Số điện khu vực trọ.                 |");
        System.out.println("| 08. Số nước khu vực trọ.                 |");
        System.out.println("| 09. Vệ sinh khu vực trọ.                 |");
        System.out.println("| 10. Báo cáo phần mềm quản lý.            |");
        System.out.println("+------------------------------------------+");

        System.out.print("Nhập số chức năng từ 1 đến 10: ");
        int nhap = sc.nextInt();
        switch (nhap) {
            case 1:
                chucNang1();
                break;

            case 2:
                chucNang2();
                break;

            case 3:
                chucNang3();
                break;

            case 4:
                chucNang4();
                break;

            case 5:
                chucNang5();
                break;

            case 6:
                chucNang6();
                break;

            case 7:
                chucNang7();
                break;

            case 8:
                chucNang8();
                break;

            case 9:
                chucNang9();
                break;

            case 10:
                chucNang10();
                break;
        }
    }

    public static void chucNang1() {
        chucNang1 run = new chucNang1();
        run.nhap();
        run.timLoi();
        run.xuat();
    }

    public static void chucNang2() {
        chucNang2 run = new chucNang2();
        run.nhap();
        run.xuat();
    }

    public static void chucNang3() {
        chucNang3 run = new chucNang3();
        run.nhap();
        run.xuat();
    }

    public static void chucNang4() {
        chucNang4 run = new chucNang4();
        run.nhap();
        run.xuat();
    }

    public static void chucNang5() {
        chucNang5 run = new chucNang5();
        run.nhap();
        run.xuat();
    }

    public static void chucNang6() {
        chucNang6 run = new chucNang6();
        run.nhap();
        run.xuat();
    }

    public static void chucNang7() {
        chucNang7 run = new chucNang7();
        run.nhap();
        run.xuat();
    }

    public static void chucNang8() {
        chucNang8 run = new chucNang8();
        run.nhap();
        run.xuat();
    }

    public static void chucNang9() {
        chucNang9 run = new chucNang9();
        run.nhap();
        run.xuat();
    }

    public static void chucNang10() {
        chucNang10 run = new chucNang10();
        run.nhap();
        run.xuat();
    }
    
}
