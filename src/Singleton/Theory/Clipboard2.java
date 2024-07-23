package Singleton.Theory;

public class Clipboard2 {
    private String value;

    private static Clipboard2 instance = null;

    // private constructor để ngăn chặn việc khởi tạo từ bên ngoài
    private Clipboard2() {}

    public static Clipboard2 getInstance() {
        if (instance == null) {
            instance = new Clipboard2();
        }
        return instance;
    }

    public void copy(String value) {
        this.value = value;
    }

    public String paste(){
        return value;
    }

    public static void main(String[] args) {
        // Getting the singleton instances
        Clipboard2 clipboard1 = Clipboard2.getInstance();
        Clipboard2 clipboard2 = Clipboard2.getInstance();

        clipboard1.copy("Nhuan");
        clipboard2.copy("Hoang");

        System.out.println(clipboard1.paste()); // Hoang
        System.out.println(clipboard2.paste()); // Hoang

        /*
        Bằng cách triển khai mẫu Singleton, chúng ta đảm bảo rằng chỉ có một thể hiện của lớp Clipboard tồn tại suốt quá trình thực thi chương trình.
        Bây giờ, cả clipboard1 và clipboard2 đều tham chiếu đến cùng một thể hiện của lớp Clipboard, đảm bảo tính nhất quán trong toàn bộ ứng dụng.
        * */
    }
}
