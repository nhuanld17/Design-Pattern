package Decorator;

public class Circle implements Shape{
    private String name;

    public Circle(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle, " + getName() + ".");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
/*
  Class Circle: Thực hiện Interface Shape, đại diện cho hình dạng cụ thể (trong trường hợp
  này là hình tròn), class này có thuộc tính name và thực hiện phương thức draw() để vẽ một
  hình tròn.
*/
