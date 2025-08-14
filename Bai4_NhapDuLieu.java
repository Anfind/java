/*
 * BÀI 4: NHẬP DỮ LIỆU TỪ NGƯỜI DÙNG BẰNG SCANNER
 * 
 * Bài này sẽ học về:
 * - Sử dụng Scanner để nhập dữ liệu
 * - Nhập các kiểu dữ liệu khác nhau
 * - Xử lý lỗi cơ bản khi nhập
 * - Tạo chương trình tương tác
 */

import java.util.Scanner; // Import class Scanner

public class Bai4_NhapDuLieu {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CHƯƠNG TRÌNH NHẬP THÔNG TIN CÁ NHÂN ===\n");

        // 1. NHẬP CHUỖI (String)
        System.out.print("Nhập họ và tên: ");
        String hoTen = scanner.nextLine(); // Đọc cả dòng (có thể chứa khoảng trắng)

        // 2. NHẬP SỐ NGUYÊN (int)
        System.out.print("Nhập tuổi: ");
        int tuoi = scanner.nextInt();

        // 3. NHẬP SỐ THỰC (double)
        System.out.print("Nhập chiều cao (m): ");
        double chieuCao = scanner.nextDouble();

        System.out.print("Nhập cân nặng (kg): ");
        double canNang = scanner.nextDouble();

        // 4. NHẬP KIỂU LOGIC (boolean)
        System.out.print("Bạn có phải là học sinh không? (true/false): ");
        boolean laHocSinh = scanner.nextBoolean();

        // Xóa bộ đệm sau khi nhập boolean
        scanner.nextLine();

        // 5. NHẬP CHUỖI KHÁC
        System.out.print("Nhập địa chỉ: ");
        String diaChi = scanner.nextLine();

        System.out.print("Nhập môn học yêu thích: ");
        String monHoc = scanner.nextLine();

        // HIỂN THỊ THÔNG TIN VỪA NHẬP
        System.out.println("\n" + "=".repeat(40));
        System.out.println("THÔNG TIN CÁ NHÂN CỦA BẠN");
        System.out.println("=".repeat(40));
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi + " tuổi");
        System.out.println("Chiều cao: " + chieuCao + " m");
        System.out.println("Cân nặng: " + canNang + " kg");
        System.out.println("Là học sinh: " + (laHocSinh ? "Có" : "Không"));
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Môn học yêu thích: " + monHoc);

        // TÍNH TOÁN VÀ HIỂN THỊ THÊM THÔNG TIN
        System.out.println("\n" + "=".repeat(40));
        System.out.println("THÔNG TIN BỔ SUNG");
        System.out.println("=".repeat(40));

        // Tính chỉ số BMI
        double bmi = canNang / (chieuCao * chieuCao);
        System.out.println("Chỉ số BMI: " + String.format("%.2f", bmi));

        // Đánh giá BMI
        String danhGiaBMI;
        if (bmi < 18.5) {
            danhGiaBMI = "Thiếu cân";
        } else if (bmi < 25) {
            danhGiaBMI = "Bình thường";
        } else if (bmi < 30) {
            danhGiaBMI = "Thừa cân";
        } else {
            danhGiaBMI = "Béo phì";
        }
        System.out.println("Đánh giá: " + danhGiaBMI);

        // Tính năm sinh
        int namSinh = 2024 - tuoi;
        System.out.println("Năm sinh: " + namSinh);

        // Kiểm tra độ tuổi
        if (tuoi < 18) {
            System.out.println("Bạn chưa thành niên");
        } else if (tuoi < 60) {
            System.out.println("Bạn đang trong độ tuổi lao động");
        } else {
            System.out.println("Bạn đã về hưu");
        }

        // CHƯƠNG TRÌNH TÍNH TOÁN ĐỔI TIỀN
        System.out.println("\n" + "=".repeat(40));
        System.out.println("CHƯƠNG TRÌNH ĐỔI TIỀN USD - VND");
        System.out.println("=".repeat(40));

        System.out.print("Nhập số tiền USD: ");
        double tienUSD = scanner.nextDouble();

        System.out.print("Nhập tỷ giá (VND/USD): ");
        double tyGia = scanner.nextDouble();

        double tienVND = tienUSD * tyGia;
        System.out.println(tienUSD + " USD = " + String.format("%.0f", tienVND) + " VND");

        // CHƯƠNG TRÌNH TÍNH ĐIỂM TRUNG BÌNH
        System.out.println("\n" + "=".repeat(40));
        System.out.println("TÍNH ĐIỂM TRUNG BÌNH");
        System.out.println("=".repeat(40));

        System.out.print("Nhập điểm Toán: ");
        double diemToan = scanner.nextDouble();

        System.out.print("Nhập điểm Lý: ");
        double diemLy = scanner.nextDouble();

        System.out.print("Nhập điểm Hóa: ");
        double diemHoa = scanner.nextDouble();

        double diemTB = (diemToan + diemLy + diemHoa) / 3;
        System.out.println("Điểm trung bình: " + String.format("%.2f", diemTB));

        // Xếp loại học lực
        String xepLoai;
        if (diemTB >= 9.0) {
            xepLoai = "Xuất sắc";
        } else if (diemTB >= 8.0) {
            xepLoai = "Giỏi";
        } else if (diemTB >= 6.5) {
            xepLoai = "Khá";
        } else if (diemTB >= 5.0) {
            xepLoai = "Trung bình";
        } else {
            xepLoai = "Yếu";
        }
        System.out.println("Xếp loại: " + xepLoai);

        // VÍ DỤ NHẬP NHIỀU SỐ TRÊN CÙNG DÒNG
        System.out.println("\n" + "=".repeat(40));
        System.out.println("TÍNH CHU VI VÀ DIỆN TÍCH HÌNH CHỮ NHẬT");
        System.out.println("=".repeat(40));

        System.out.print("Nhập chiều dài và chiều rộng (cách nhau bởi dấu cách): ");
        double dai = scanner.nextDouble();
        double rong = scanner.nextDouble();

        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;

        System.out.println("Chiều dài: " + dai);
        System.out.println("Chiều rộng: " + rong);
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Diện tích: " + dienTich);

        // Đóng Scanner
        scanner.close();
        System.out.println("\nCảm ơn bạn đã sử dụng chương trình!");
    }
}

/*
 * HƯỚNG DẪN SỬ DỤNG SCANNER:
 * 
 * 1. IMPORT: import java.util.Scanner;
 * 
 * 2. TẠO ĐỐI TƯỢNG: Scanner scanner = new Scanner(System.in);
 * 
 * 3. CÁC PHƯƠNG THỨC NHẬP:
 * - scanner.nextLine() : Nhập chuỗi (cả dòng, có khoảng trắng)
 * - scanner.next() : Nhập chuỗi (một từ, không có khoảng trắng)
 * - scanner.nextInt() : Nhập số nguyên
 * - scanner.nextDouble() : Nhập số thực
 * - scanner.nextFloat() : Nhập số thực float
 * - scanner.nextBoolean() : Nhập true/false
 * - scanner.nextByte() : Nhập byte
 * - scanner.nextShort() : Nhập short
 * - scanner.nextLong() : Nhập long
 * 
 * 4. LƯU Ý QUAN TRỌNG:
 * - Sau khi nhập số, cần gọi scanner.nextLine() để xóa bộ đệm
 * - Luôn đóng Scanner bằng scanner.close() ở cuối chương trình
 * - Khi nhập boolean, chỉ nhập "true" hoặc "false"
 * - Khi nhập số thực, dùng dấu chấm (.) không phải dấu phẩy (,)
 * 
 * 5. XỬ LÝ LỖI:
 * - Nếu nhập sai kiểu dữ liệu, chương trình sẽ báo lỗi
 * - Ví dụ: nhập chữ khi đang đợi số
 * 
 * 6. TIPS:
 * - System.out.print() để in không xuống dòng (thích hợp cho prompt)
 * - String.format("%.2f", number) để làm tròn 2 chữ số thập phân
 * - "=".repeat(40) để tạo đường kẻ (Java 11+)
 */
