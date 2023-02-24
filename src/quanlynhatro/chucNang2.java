package quanlynhatro;

import java.util.ArrayList;
import java.util.Scanner;

public class chucNang2 {
    Scanner sc = new Scanner(System.in);
    ArrayList<chucNang2> list = new ArrayList<>();
    String hoTen;
    String gioiTinh;
    String namSinh;
    String cmnd;
    String diaChi;
    String dangKy;
    String canBo;
    chucNang2 vao;

    public static void main(String[] agrs) {
        chucNang2 run = new chucNang2();
        run.nhap();
        run.xuat();
    }

    public chucNang2() {
    }

    public chucNang2(String hoTen, String cmnd, String gioiTinh, String namSinh, String diaChi, String dangKy,
            String canBo) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.cmnd = cmnd;
        this.diaChi = diaChi;
        this.dangKy = dangKy;
        this.canBo = canBo;
    }

    public void nhap() {

        int n;
        System.out.print("Nhập số lượng người muốn nhập ( tối đa 2 người ): ");
        n = sc.nextInt();
        sc.nextLine();

        if (n > 2) {
            System.out.println("Quá số lượng người quy định");
        } else {
            for (int i = 0; i < n; i++) {

                System.out.print("Nhập Họ và Tên: ");
                hoTen = sc.nextLine();
                System.out.print("Nhập giới tính: ");
                gioiTinh = sc.nextLine();
                System.out.print("Nhập ngày tháng năm sinh: ");
                namSinh = sc.nextLine();
                System.out.print("Nhập số CMND hoặc số TCCD: ");
                cmnd = sc.nextLine();
                System.out.print("Nhập địa chỉ: ");
                diaChi = sc.nextLine();
                System.out.print("Nhập Họ và Tên người đăng ký: ");
                dangKy = sc.nextLine();
                System.out.print("Nhập Họ và Tên cán bộ tiếp nhận: ");
                canBo = sc.nextLine();

                vao = new chucNang2(hoTen, cmnd, gioiTinh, namSinh, diaChi, dangKy, canBo);
                list.add(vao);
            }
        }
    }

    public void xuat() {
        System.out.println("------------------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Họ và Tên: " + hoTen);
            System.out.println("Giới tính: " + gioiTinh);
            System.out.println("Ngày tháng năm sinh: " + namSinh);
            System.out.println("Số CMND hoặc số TCCD: " + cmnd);
            System.out.println("Địa chỉ: " + diaChi);
            System.out.println("Họ và Tên người đăng ký: " + dangKy);
            System.out.println("Cán bộ công an tiếp nhận: " + canBo);
            System.out.println("");
        }
    }
}
