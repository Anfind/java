/*
 * BÀI 1: HELLO WORLD - CHƯƠNG TRÌNH JAVA ĐẦU TIÊN
 * 
 * Đây là chương trình Java đầu tiên của bạn!
 * Chương trình này sẽ in ra màn hình dòng chữ "Hello World"
 */

public class Bai1_HelloWorld {
    // Đây là phương thức main - điểm bắt đầu của mọi chương trình Java
    public static void main(String[] args) {
        // In ra màn hình dòng chữ "Hello World"
        System.out.println("Hello World!");
        System.out.println("Chào mừng bạn đến với Java!");

        // Bạn có thể in nhiều dòng
        System.out.println("Đây là chương trình Java đầu tiên của tôi");
        System.out.println("Java rất thú vị!");

        // System.out.print() in không xuống dòng
        System.out.print("Tôi tên là ");
        System.out.print("Java Developer");
        System.out.println(); // Xuống dòng
    }

}

/*
 * GIẢI THÍCH:
 * - public class: Khai báo một lớp công khai
 * - Tên file phải trùng với tên class (Bai1_HelloWorld.java)
 * - main(): Phương thức chính, điểm bắt đầu chương trình
 * - System.out.println(): In ra màn hình và xuống dòng
 * - System.out.print(): In ra màn hình không xuống dòng
 * - // hoặc /*
 */

// Chú thích (comment)
//  * 
//  * CÁCH CHẠY:
//  * 1. Mở terminal/command prompt
//  * 2. Chuyển đến thư mục chứa file
//  * 3. Gõ: javac Bai1_HelloWorld.java (biên dịch)
//  * 4. Gõ:

// java Bai1_HelloWorld (chạy)
 
