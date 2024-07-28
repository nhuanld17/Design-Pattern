package Decorator;

public class ColorDecorator extends ShapeDecorator{
    private String color;

    public ColorDecorator(Shape shapeDecoratedShape, String color) {
        super(shapeDecoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Filling with " + color + " color to " + getName());
    }
}
/*
    Lớp BorderDecorator và ColorDecorator: Các lớp decorator cụ thể kế thừa lớp
    ShapeDecorator. Chúng thêm tính năng bổ sung cho các hình dạng được trang trí
    chẳng hạn như viền và màu sắc. Hai class này ghì đè phương thức draw() để thêm
    chức năng cụ thể của mình trong khi cũng gọi phương thức draw() của hình dạng
    được trang trí.
*/
