public class ShapeAdapter extends Visibility implements ShapeBasic{
    ShapeSpecial shapeSpecial;

    public ShapeAdapter(ShapeSpecial shapeSpecial) {
        this.shapeSpecial=shapeSpecial;
    }

    @Override
    public void draw() {
        shapeSpecial.drawShape();
    }

    @Override
    public void grow() {
        System.out.println(printText() + ", cannot grow");
    }

    @Override
    public String printText() {
        Triangle triangle = new Triangle();
        ShapeDiamond diamond = new ShapeDiamond();
        if (triangle instanceof ShapeSpecial) {
            return "Triangle";
        }
        else if (diamond instanceof ShapeSpecial) {
            return "ShapeDiamond";
        }
        else return "This shape is not supported";
    }


}
