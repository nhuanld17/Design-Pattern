package Factory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("1. Addition(+)");
                System.out.println("2. Subtraction(-)");
                System.out.println("3. Multiplication(*)");
                System.out.println("4. Division(/)");
                System.out.println("5. Exit");
                int choice = k.nextInt();

                if (choice == 5) {
                    System.exit(0);
                }

                System.out.println("Enter first number");
                double a = k.nextDouble();
                System.out.println("Enter second number");
                double b = k.nextDouble();

                // Tạo operation dựa trên choice người dùng nhập vào
                OperationFactory operationFactory = new OperationFactoryImpl();
                Operation operation = operationFactory.getInstance(choice);
                // Print the result
                System.out.println("The result is: " + operation.calculate(a, b));

            }
        } catch (InvalidOperationException | ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (InputMismatchException e1){
            System.out.println("Invalid input type");
        }
    }
}

/*
    Dưới đây là ví dụ về lớp Main minh họa việc sử dụng factory để tạo các đối tượng phép
    toán khác nhau mà không cần biết các lớp triển khai cụ thể của chúng (Loose coupling).
    Nó chỉ tương tác với giao diện factory. Không chỉ có vậy, chúng ta cũng có thể dễ dàng
    thêm các loại phép toán mới mà không cần thay đổi mã khách hàng hiện tại. Chúng ta chỉ
    cần tạo một sản phẩm cụ thể mới và cập nhật factory nếu cần thiết.
 */
