package Decorator;

public abstract class ShapeDecorator implements Shape{
    private Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }

    @Override
    public String getName() {
        return decoratedShape.getName();
    }
}

/*
  Lớp trừu tượng ShapeDecorator: Một lớp trừu tượng thực hiện giao diện Shape. Lớp này
  chứa một tham chiếu đến một đối tượng Shape và ủy quyền phương thức cho đối tượng
  này.
*/
