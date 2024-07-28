package Decorator;

public class BorderDecorator extends ShapeDecorator{
    private String color;
    private int withInPxs;

    public BorderDecorator(Shape decoratedShape, String color, int withInPxs) {
        super(decoratedShape);
        this.color = color;
        this.withInPxs = withInPxs;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Adding " + withInPxs + "px, " + color + " color border");
    }
}
