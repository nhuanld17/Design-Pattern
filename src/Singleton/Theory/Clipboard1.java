package Singleton.Theory;

/*
 Mẫu Singleton là một mẫu thiết kế khởi tạo đảm bảo rằng một lớp chỉ có một thể hiện duy nhất và cung cấp một điểm truy cập toàn cục tới thể hiện đó. Nói đơn giản hơn, nó giống như đảm bảo rằng chỉ có một bản sao duy nhất của một đối tượng cụ thể trong chương trình của bạn, và bạn có thể truy cập đối tượng đó từ bất kỳ đâu trong mã của mình.
* */

/*
Hãy lấy một ví dụ đơn giản trong thế giới thực: clipboard (bảng tạm). Hình dung nhiều ứng dụng hoặc quy trình đang chạy trên máy tính, mỗi ứng dụng cố gắng truy cập vào clipboard đồng thời. Nếu mỗi ứng dụng tự tạo phiên bản clipboard của riêng mình để quản lý các thao tác sao chép và dán, điều này có thể dẫn đến dữ liệu bị xung đột.
 */


public class Clipboard1 {
    private String value;

    public void copy(String value){
        this.value = value;
    }

    public String paste(){
        return value;
    }

    public static void main(String[] args) {
        Clipboard1 clipboard1 = new Clipboard1();
        Clipboard1 clipboard2 = new Clipboard1();

        clipboard1.copy("Nhuan");
        clipboard2.copy("Hoang");

        System.out.println(clipboard1.paste()); // Nhuan
        System.out.println(clipboard2.paste()); // Hoang
    }

    /*
    Trong ví dụ trên, chúng ta đã định nghĩa một lớp Clipboard có khả năng sao chép và dán các giá trị. Tuy nhiên, nếu chúng ta tạo nhiều thể hiện của Clipboard, mỗi thể hiện sẽ giữ dữ liệu riêng biệt của nó.
     */
}
