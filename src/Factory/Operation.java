package Factory;

/*
  Định nghĩa giao diện sản phẩm.
  Sau đó triển khai các sản phẩm cụ thể cho từng thao tác ở
  Class: AddOperation, SubOperation, MulOperation, DivOperation
*/

public interface Operation {
    double calculate(double number1, double number2);
}
