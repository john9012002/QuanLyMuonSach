import java.util.Scanner;

public class MuonTra extends Sach {
    private String maDocGia;
    private int soLuong;
    private static int phiCocMuonTra = 5000;

    public MuonTra() {
    }

    public MuonTra(String maSach, String tenSach, String maDocGia, int soLuong) {
        super(maSach, tenSach);
        this.maDocGia = maDocGia;
        this.soLuong = soLuong;
    }

    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma doc gia: ");
        maDocGia = scanner.nextLine();
        System.out.print("Nhap so luong: ");
        soLuong = scanner.nextInt();
    }

    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Ma doc gia: " + maDocGia);
        System.out.println("So luong: " + soLuong);
        System.out.println("So tien coc muon tra: " + tinhSoTienCocMuonTra());
    }

    public int tinhSoTienCocMuonTra() {
        return soLuong * phiCocMuonTra;
    }

    public static void setPhiCocMuonTra(int phi) {
        phiCocMuonTra = phi;
    }

    public static int getPhiCocMuonTra() {
        return phiCocMuonTra;
    }

    public String getMaDocGia() {
        return maDocGia;
    }

    public int getSoLuong() {
        return soLuong;
    }
}
