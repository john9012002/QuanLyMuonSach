import java.util.ArrayList;
import java.util.Scanner;

public class App {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong tin sach:");
        Sach sach = new Sach();
        sach.nhapThongTin();
        System.out.println("Thong tin sach:");
        sach.xuatThongTin();

        System.out.print("Nhap so luong muon tra: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<MuonTra> danhSachMuonTra = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin muon tra thu " + (i + 1) + ":");
            MuonTra muonTra = new MuonTra();
            muonTra.nhapThongTin();
            danhSachMuonTra.add(muonTra);
        }

        System.out.println("Thong tin muon tra thu:");
        for (int i = 0; i < n; i++) {
            System.out.println("Muon tra thu " + (i + 1) + ":");
            danhSachMuonTra.get(i).xuatThongTin();
            System.out.println();
        }

        System.out.println("Cac doc gia co so luong muon > 10 cuon:");
        for (int i = 0; i < n; i++) {
            if (danhSachMuonTra.get(i).getSoLuong() > 10) {
                System.out.println(danhSachMuonTra.get(i).getMaDocGia());
            }
        }

        int maxTienCoc = 0;
        System.out.print("Ma cac doc gia co so tien coc nhieu nhat: ");
        for (int i = 0; i < n; i++) {
            int tienCoc = danhSachMuonTra.get(i).tinhSoTienCocMuonTra();
            if (tienCoc > maxTienCoc) {
                maxTienCoc = tienCoc;
            }
        }
        for (int i = 0; i < n; i++) {
            if (danhSachMuonTra.get(i).tinhSoTienCocMuonTra() == maxTienCoc) {
                System.out.print(danhSachMuonTra.get(i).getMaDocGia() + " ");
            }
        }
    }
}
