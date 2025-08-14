/*
 * BÀI 2: BIẾN VÀ KIỂU DỮ LIỆU TRONG JAVA
 * 
 * Bài này sẽ học về:
 * - Các kiểu dữ liệu cơ bản
 * - Cách khai báo và sử dụng biến
 * - Phép gán giá trị
 */

public class Bai2_BienVaKieuDuLieu {
    public static void main(String[] args) {
        // 1. KIỂU SỐ NGUYÊN
        int tuoi = 25; // Số nguyên từ -2,147,483,648 đến 2,147,483,647
        long soLuong = 1000000L; // Số nguyên lớn (thêm L ở cuối)
        short nam = 2024; // Số nguyên nhỏ (-32,768 đến 32,767)
        byte diem = 100; // Số nguyên rất nhỏ (-128 đến 127)

        // 2. KIỂU SỐ THỰC
        double chieuCao = 1.75; // Số thực có độ chính xác cao
        float canNang = 65.5f; // Số thực (thêm f ở cuối)

        // 3. KIỂU LOGIC
        boolean laHocSinh = true; // Chỉ có 2 giá trị: true hoặc false
        boolean daKetHon = false;

        // 4. KIỂU KÝ TỰ
        char kyTu = 'A'; // Một ký tự duy nhất (dùng dấu nháy đơn)
        char kyTuSo = '5';

        // 5. KIỂU CHUỖI (String - không phải kiểu cơ bản)
        String hoTen = "Nguyễn Văn An"; // Chuỗi ký tự (dùng dấu nháy kép)
        String diaChi = "Hà Nội";

        // IN RA KẾT QUẢ
        System.out.println("=== THÔNG TIN CÁ NHÂN ===");
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Chiều cao: " + chieuCao + " mét");
        System.out.println("Cân nặng: " + canNang + " kg");
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Là học sinh: " + laHocSinh);
        System.out.println("Đã kết hôn: " + daKetHon);
        System.out.println("Ký tự đầu tên: " + kyTu);

        // THAY ĐỔI GIÁ TRỊ BIẾN
        System.out.println("\n=== SAU KHI THAY ĐỔI ===");
        tuoi = 26; // Gán giá trị mới
        chieuCao = 1.76;
        laHocSinh = false;

        System.out.println("Tuổi mới: " + tuoi);
        System.out.println("Chiều cao mới: " + chieuCao + " mét");
        System.out.println("Là học sinh: " + laHocSinh);

        // KHAI BÁO NHIỀU BIẾN CÙNG KIỂU
        int a = 10, b = 20, c = 30;
        System.out.println("\nCác số: " + a + ", " + b + ", " + c);

        // HẰNG SỐ (final)
        final double PI = 3.14159; // Hằng số không thể thay đổi
        System.out.println("Số PI: " + PI);
        // PI = 3.14; // LỖI! Không thể thay đổi hằng số
    }
}

/*
 * TÓM TẮT KIỂU DỮ LIỆU:
 * 
 * KIỂU SỐ NGUYÊN:
 * - byte: 1 byte (-128 đến 127)
 * - short: 2 byte (-32,768 đến 32,767)
 * - int: 4 byte (-2 tỷ đến 2 tỷ)
 * - long: 8 byte (số rất lớn, thêm L)
 * 
 * KIỂU SỐ THỰC:
 * - float: 4 byte (độ chính xác thấp, thêm f)
 * - double: 8 byte (độ chính xác cao)
 * 
 * KHÁC:
 * - boolean: true/false
 * - char: 1 ký tự (dấu nháy đơn)
 * - String: chuỗi ký tự (dấu nháy kép)
 * 
 * QUY TẮC ĐẶT TÊN BIẾN:
 * - Bắt đầu bằng chữ cái, _ hoặc $
 * - Không chứa khoảng trắng
 * - Phân biệt chữ hoa/thường
 * - Nên dùng camelCase: tenBien, hoTenHocSinh
 */
