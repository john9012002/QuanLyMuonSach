import java.util.Scanner;

public class Sach {
    private String maSach;
    private String tenSach;

    public Sach() {
    }

    public Sach(String maSach, String tenSach) {
        this.maSach = maSach;
        this.tenSach = tenSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        maSach = scanner.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach = scanner.nextLine();
    }

    public void xuatThongTin() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
    }

    public String getMaSach() {
        return maSach;
    }
}