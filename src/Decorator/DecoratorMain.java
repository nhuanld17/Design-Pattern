package Decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        // Create a Circle
        Shape circle1 = new Circle("Circle1");

        // Decorate the circle with a border
        Shape circle1WithBorder = new BorderDecorator(circle1, "red", 2);

        // Decorate the circle with a color
        Shape circle1WithBorderAndColor = new ColorDecorator(circle1WithBorder, "Blue");

        // Draw the decorated circle
        circle1WithBorderAndColor.draw();

    }
}
/*
    Lớp DecoratorMain: Chứa phương thức main() nơi mẫu thiết kế Decorator được minh họa.
    Nó tạo một hình tròn, trang trí hình tròn đó bằng viền, và sau đó trang trí thêm bằng
    màu sắc. Cuối cùng, nó gọi phương thức draw() để hiển thị hình dạng đã được trang trí.
*/