package Factory;

public class OperationFactoryImpl implements OperationFactory{
    @Override
    public Operation getInstance(int choice) throws InvalidOperationException {
        if (choice == 1){
            return new AddOperation();
        } else if (choice == 2){
            return new SubOperation();
        } else if (choice == 3){
            return new MulOperation();
        } else if (choice == 4){
            return new DivOperation();
        }
        throw new InvalidOperationException("Invalid Operation Selected");
    }
}
