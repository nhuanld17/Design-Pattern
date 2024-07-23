package Factory;

/*
    Tạo một lớp factory (OperationFactory) với phương thức getInstance để tạo các
    đối tượng dựa trên một số tham số
*/
public interface OperationFactory {
    Operation getInstance(int choice) throws InvalidOperationException;
}
