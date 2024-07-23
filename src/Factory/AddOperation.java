package Factory;

/*Triển khai các sản phẩm cụ thể cho từng thao tác (operation)*/
public class AddOperation implements Operation{

    @Override
    public double calculate(double number1, double number2) {
        return number1 + number2;
    }
}
