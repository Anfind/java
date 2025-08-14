/*
 * BÀI 5: CẤU TRÚC ĐIỀU KIỆN (IF-ELSE) TRONG JAVA
 * 
 * Bài này sẽ học về:
 * - Câu lệnh if đơn giản
 * - Câu lệnh if-else
 * - Câu lệnh if-else if-else
 * - Các toán tử so sánh và logic
 * - Câu lệnh switch-case
 * - Toán tử 3 ngôi (ternary operator)
 */

import java.util.Scanner;

public class Bai5_CauTrucDieuKien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== BÀI HỌC VỀ CẤU TRÚC ĐIỀU KIỆN ===\n");

        // 1. CÂU LỆNH IF ĐỠN GIẢN
        System.out.println("1. IF ĐƠN GIẢN");
        System.out.print("Nhập tuổi của bạn: ");
        int tuoi = scanner.nextInt();

        if (tuoi >= 18) {
            System.out.println("Bạn đã thành niên!");
        }

        if (tuoi < 18) {
            System.out.println("Bạn chưa thành niên!");
        }

        // 2. CÂU LỆNH IF-ELSE
        System.out.println("\n2. IF-ELSE");
        System.out.print("Nhập một số: ");
        int so = scanner.nextInt();

        if (so % 2 == 0) {
            System.out.println(so + " là số chẵn");
        } else {
            System.out.println(so + " là số lẻ");
        }

        // 3. CÂU LỆNH IF-ELSE IF-ELSE
        System.out.println("\n3. IF-ELSE IF-ELSE");
        System.out.print("Nhập điểm của bạn (0-10): ");
        double diem = scanner.nextDouble();

        if (diem >= 9.0) {
            System.out.println("Xếp loại: Xuất sắc");
        } else if (diem >= 8.0) {
            System.out.println("Xếp loại: Giỏi");
        } else if (diem >= 6.5) {
            System.out.println("Xếp loại: Khá");
        } else if (diem >= 5.0) {
            System.out.println("Xếp loại: Trung bình");
        } else {
            System.out.println("Xếp loại: Yếu");
        }

        // 4. TOÁN TỬ SO SÁNH VÀ LOGIC
        System.out.println("\n4. TOÁN TỬ SO SÁNH VÀ LOGIC");
        System.out.print("Nhập số thứ nhất: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int b = scanner.nextInt();

        // Toán tử so sánh
        System.out.println("\nCác phép so sánh:");
        System.out.println(a + " == " + b + " ? " + (a == b)); // Bằng
        System.out.println(a + " != " + b + " ? " + (a != b)); // Khác
        System.out.println(a + " > " + b + " ? " + (a > b)); // Lớn hơn
        System.out.println(a + " < " + b + " ? " + (a < b)); // Nhỏ hơn
        System.out.println(a + " >= " + b + " ? " + (a >= b)); // Lớn hơn hoặc bằng
        System.out.println(a + " <= " + b + " ? " + (a <= b)); // Nhỏ hơn hoặc bằng

        // Toán tử logic
        System.out.println("\nCác phép logic:");
        boolean lon = a > b;
        boolean duong = a > 0;
        System.out.println("a > b AND a > 0: " + (lon && duong)); // AND (và)
        System.out.println("a > b OR a > 0: " + (lon || duong)); // OR (hoặc)
        System.out.println("NOT (a > b): " + (!lon)); // NOT (phủ định)

        // 5. ĐIỀU KIỆN PHỨC TẠP
        System.out.println("\n5. ĐIỀU KIỆN PHỨC TẠP");
        System.out.print("Nhập năm: ");
        int nam = scanner.nextInt();

        // Kiểm tra năm nhuận
        if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
            System.out.println(nam + " là năm nhuận");
        } else {
            System.out.println(nam + " không phải năm nhuận");
        }

        // 6. CÂU LỆNH SWITCH-CASE
        System.out.println("\n6. SWITCH-CASE");
        System.out.print("Nhập số thứ trong tuần (1-7): ");
        int thu = scanner.nextInt();

        String tenThu;
        switch (thu) {
            case 1:
                tenThu = "Chủ nhật";
                break;
            case 2:
                tenThu = "Thứ hai";
                break;
            case 3:
                tenThu = "Thứ ba";
                break;
            case 4:
                tenThu = "Thứ tư";
                break;
            case 5:
                tenThu = "Thứ năm";
                break;
            case 6:
                tenThu = "Thứ sáu";
                break;
            case 7:
                tenThu = "Thứ bảy";
                break;
            default:
                tenThu = "Không hợp lệ";
                break;
        }
        System.out.println("Thứ " + thu + " là: " + tenThu);

        // 7. SWITCH-CASE VỚI NHIỀU CASE
        System.out.println("\n7. SWITCH-CASE NHÓM");
        System.out.print("Nhập tháng (1-12): ");
        int thang = scanner.nextInt();

        int soNgay;
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                soNgay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                soNgay = 30;
                break;
            case 2:
                soNgay = 28; // Giả sử không nhuận
                break;
            default:
                soNgay = 0;
                break;
        }

        if (soNgay > 0) {
            System.out.println("Tháng " + thang + " có " + soNgay + " ngày");
        } else {
            System.out.println("Tháng không hợp lệ");
        }

        // 8. TOÁN TỬ 3 NGÔI (TERNARY OPERATOR)
        System.out.println("\n8. TOÁN TỬ 3 NGÔI");
        System.out.print("Nhập một số để kiểm tra: ");
        int soKT = scanner.nextInt();

        // Cú pháp: điều_kiện ? giá_trị_nếu_đúng : giá_trị_nếu_sai
        String ketQua = (soKT >= 0) ? "dương" : "âm";
        System.out.println("Số " + soKT + " là số " + ketQua);

        String chanLe = (soKT % 2 == 0) ? "chẵn" : "lẻ";
        System.out.println("Số " + soKT + " là số " + chanLe);

        // Tìm số lớn nhất trong 2 số
        System.out.print("Nhập số thứ nhất: ");
        int x = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int y = scanner.nextInt();

        int max = (x > y) ? x : y;
        System.out.println("Số lớn nhất là: " + max);

        // 9. VÍ DỤ THỰC TẾ - CHƯƠNG TRÌNH TÍNH TIỀN ĐIỆN
        System.out.println("\n9. VÍ DỤ THỰC TẾ - TÍNH TIỀN ĐIỆN");
        System.out.print("Nhập số kWh điện đã sử dụng: ");
        double soDien = scanner.nextDouble();

        double tienDien;

        if (soDien <= 50) {
            tienDien = soDien * 1678;
        } else if (soDien <= 100) {
            tienDien = 50 * 1678 + (soDien - 50) * 1734;
        } else if (soDien <= 200) {
            tienDien = 50 * 1678 + 50 * 1734 + (soDien - 100) * 2014;
        } else if (soDien <= 300) {
            tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + (soDien - 200) * 2536;
        } else {
            tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (soDien - 300) * 2834;
        }

        System.out.println("Số tiền điện phải trả: " + String.format("%.0f", tienDien) + " VND");

        // 10. VÍ DỤ - MENU LỰA CHỌN
        System.out.println("\n10. MENU LỰA CHỌN");
        System.out.println("===== MENU TÍNH TOÁN =====");
        System.out.println("1. Cộng");
        System.out.println("2. Trừ");
        System.out.println("3. Nhân");
        System.out.println("4. Chia");
        System.out.print("Chọn phép tính (1-4): ");

        int luaChon = scanner.nextInt();

        if (luaChon >= 1 && luaChon <= 4) {
            System.out.print("Nhập số thứ nhất: ");
            double so1 = scanner.nextDouble();
            System.out.print("Nhập số thứ hai: ");
            double so2 = scanner.nextDouble();

            double kq = 0;
            String phepTinh = "";

            switch (luaChon) {
                case 1:
                    kq = so1 + so2;
                    phepTinh = "+";
                    break;
                case 2:
                    kq = so1 - so2;
                    phepTinh = "-";
                    break;
                case 3:
                    kq = so1 * so2;
                    phepTinh = "*";
                    break;
                case 4:
                    if (so2 != 0) {
                        kq = so1 / so2;
                        phepTinh = "/";
                    } else {
                        System.out.println("Lỗi: Không thể chia cho 0!");
                        scanner.close();
                        return;
                    }
                    break;
            }

            System.out.println("Kết quả: " + so1 + " " + phepTinh + " " + so2 + " = " + kq);
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
        }

        scanner.close();
        System.out.println("\nCảm ơn bạn đã học về cấu trúc điều kiện!");
    }
}

/*
 * TÓM TẮT CẤU TRÚC ĐIỀU KIỆN:
 * 
 * 1. IF ĐƠN GIẢN:
 * if (điều_kiện) {
 * // code thực thi nếu điều kiện đúng
 * }
 * 
 * 2. IF-ELSE:
 * if (điều_kiện) {
 * // code nếu đúng
 * } else {
 * // code nếu sai
 * }
 * 
 * 3. IF-ELSE IF-ELSE:
 * if (điều_kiện_1) {
 * // code 1
 * } else if (điều_kiện_2) {
 * // code 2
 * } else {
 * // code mặc định
 * }
 * 
 * 4. TOÁN TỬ SO SÁNH:
 * == : bằng
 * != : khác
 * > : lớn hơn
 * < : nhỏ hơn
 * >= : lớn hơn hoặc bằng
 * <= : nhỏ hơn hoặc bằng
 * 
 * 5. TOÁN TỬ LOGIC:
 * && : AND (và) - cả hai đều đúng
 * || : OR (hoặc) - một trong hai đúng
 * ! : NOT (phủ định) - đảo ngược kết quả
 * 
 * 6. SWITCH-CASE:
 * switch (biến) {
 * case giá_trị_1:
 * // code
 * break;
 * case giá_trị_2:
 * // code
 * break;
 * default:
 * // code mặc định
 * break;
 * }
 * 
 * 7. TOÁN TỬ 3 NGÔI:
 * kết_quả = điều_kiện ? giá_trị_nếu_đúng : giá_trị_nếu_sai;
 * 
 * LƯU Ý:
 * - Luôn sử dụng == để so sánh, không dùng = (gán)
 * - Với String, dùng .equals() thay vì ==
 * - break; quan trọng trong switch-case
 * - Có thể lồng if trong if
 * - && có độ ưu tiên cao hơn ||
 */
