/*
 * BÀI 3: PHÉP TOÁN VÀ BIỂU THỨC TRONG JAVA
 * 
 * Bài này sẽ học về:
 * - Các phép toán cơ bản (+, -, *, /, %)
 * - Phép toán gán (=, +=, -=, *=, /=)
 * - Phép toán tăng giảm (++, --)
 * - Thứ tự ưu tiên của phép toán
 */

public class Bai3_PhepToan {
    public static void main(String[] args) {
        // KHAI BÁO BIẾN
        int a = 15;
        int b = 4;
        double x = 10.5;
        double y = 3.2;

        System.out.println("=== PHÉP TOÁN CƠ BẢN ===");
        System.out.println("a = " + a + ", b = " + b);

        // 1. PHÉP TOÁN SỐ NGUYÊN
        int tong = a + b; // Phép cộng
        int hieu = a - b; // Phép trừ
        int tich = a * b; // Phép nhân
        int thuong = a / b; // Phép chia (lấy phần nguyên)
        int soDu = a % b; // Phép chia lấy dư

        System.out.println(a + " + " + b + " = " + tong);
        System.out.println(a + " - " + b + " = " + hieu);
        System.out.println(a + " * " + b + " = " + tich);
        System.out.println(a + " / " + b + " = " + thuong + " (phần nguyên)");
        System.out.println(a + " % " + b + " = " + soDu + " (số dư)");

        // 2. PHÉP TOÁN SỐ THỰC
        System.out.println("\n=== PHÉP TOÁN SỐ THỰC ===");
        System.out.println("x = " + x + ", y = " + y);

        double tongThuc = x + y;
        double hieuThuc = x - y;
        double tichThuc = x * y;
        double thuongThuc = x / y; // Chia số thực

        System.out.println(x + " + " + y + " = " + tongThuc);
        System.out.println(x + " - " + y + " = " + hieuThuc);
        System.out.println(x + " * " + y + " = " + tichThuc);
        System.out.println(x + " / " + y + " = " + thuongThuc);

        // 3. CHUYỂN ĐỔI KIỂU DỮ LIỆU
        System.out.println("\n=== CHUYỂN ĐỔI KIỂU ===");
        double chiaThuongThuc = (double) a / b; // Ép kiểu để có kết quả thực
        System.out.println(a + " / " + b + " = " + chiaThuongThuc + " (chia thực)");

        int soCut = (int) x; // Cắt phần thập phân
        System.out.println("Cắt " + x + " = " + soCut);

        // 4. PHÉP TOÁN GÁN
        System.out.println("\n=== PHÉP TOÁN GÁN ===");
        int so = 10;
        System.out.println("Giá trị ban đầu: " + so);

        so += 5; // Tương đương: so = so + 5
        System.out.println("Sau khi += 5: " + so);

        so -= 3; // Tương đương: so = so - 3
        System.out.println("Sau khi -= 3: " + so);

        so *= 2; // Tương đương: so = so * 2
        System.out.println("Sau khi *= 2: " + so);

        so /= 4; // Tương đương: so = so / 4
        System.out.println("Sau khi /= 4: " + so);

        so %= 3; // Tương đương: so = so % 3
        System.out.println("Sau khi %= 3: " + so);

        // 5. PHÉP TOÁN TĂNG GIẢM
        System.out.println("\n=== PHÉP TOÁN TĂNG GIẢM ===");
        int dem = 5;
        System.out.println("Giá trị ban đầu: " + dem);

        // Tăng trước (++dem): tăng trước rồi mới sử dụng
        System.out.println("++dem = " + (++dem)); // dem = 6
        System.out.println("Giá trị hiện tại: " + dem);

        // Tăng sau (dem++): sử dụng trước rồi mới tăng
        System.out.println("dem++ = " + (dem++)); // In 6, sau đó dem = 7
        System.out.println("Giá trị hiện tại: " + dem);

        // Giảm trước (--dem): giảm trước rồi mới sử dụng
        System.out.println("--dem = " + (--dem)); // dem = 6

        // Giảm sau (dem--): sử dụng trước rồi mới giảm
        System.out.println("dem-- = " + (dem--)); // In 6, sau đó dem = 5
        System.out.println("Giá trị cuối: " + dem);

        // 6. THỨ TỰ ƯU TIÊN
        System.out.println("\n=== THỨ TỰ ƯU TIÊN ===");
        int ketQua1 = 2 + 3 * 4; // 3*4 trước, rồi +2
        int ketQua2 = (2 + 3) * 4; // Ngoặc đơn có ưu tiên cao nhất
        int ketQua3 = 10 - 6 / 2; // 6/2 trước, rồi 10-3

        System.out.println("2 + 3 * 4 = " + ketQua1);
        System.out.println("(2 + 3) * 4 = " + ketQua2);
        System.out.println("10 - 6 / 2 = " + ketQua3);

        // 7. VÍ DỤ THỰC TẾ
        System.out.println("\n=== VÍ DỤ THỰC TẾ ===");

        // Tính diện tích hình chữ nhật
        double chieuDai = 8.5;
        double chieuRong = 5.2;
        double dienTich = chieuDai * chieuRong;
        System.out.println("Diện tích hình chữ nhật: " + dienTich + " m²");

        // Tính điểm trung bình
        int diem1 = 8, diem2 = 7, diem3 = 9;
        double diemTB = (double) (diem1 + diem2 + diem3) / 3;
        System.out.println("Điểm trung bình: " + diemTB);

        // Kiểm tra số chẵn lẻ
        int soKiemTra = 17;
        int soDuKiemTra = soKiemTra % 2;
        System.out.println("Số " + soKiemTra + " chia 2 dư " + soDuKiemTra);
        if (soDuKiemTra == 0) {
            System.out.println("=> Đây là số chẵn");
        } else {
            System.out.println("=> Đây là số lẻ");
        }
    }
}

/*
 * TÓM TẮT PHÉP TOÁN:
 * 
 * PHÉP TOÁN CƠ BẢN:
 * + : cộng
 * - : trừ
 * * : nhân
 * / : chia (số nguyên chia số nguyên = số nguyên)
 * % : chia lấy dư
 * 
 * PHÉP TOÁN GÁN:
 * = : gán
 * += : cộng rồi gán (a += b tương đương a = a + b)
 * -= : trừ rồi gán
 * *= : nhân rồi gán
 * /= : chia rồi gán
 * %= : chia lấy dư rồi gán
 * 
 * PHÉP TOÁN TĂNG GIẢM:
 * ++a : tăng a lên 1, sử dụng giá trị mới
 * a++ : sử dụng giá trị a, sau đó tăng lên 1
 * --a : giảm a đi 1, sử dụng giá trị mới
 * a-- : sử dụng giá trị a, sau đó giảm đi 1
 * 
 * THỨ TỰ ƯU TIÊN (cao đến thấp):
 * 1. () Ngoặc đơn
 * 2. ++, -- Tăng giảm
 * 3. *, /, % Nhân, chia, chia dư
 * 4. +, - Cộng, trừ
 * 5. = Gán
 */
