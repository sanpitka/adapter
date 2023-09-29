import java.util.Random;

public class BrushStroke extends Visibility implements CanBeColored,ShapeBasic {
    private String color = "Yellow";
    private final int thickness;
    public BrushStroke(){
        Random random = new Random();
        this.thickness = random.nextInt(10)+1;
    }
    public void draw(){
        System.out.println("Brush strokes with thickness "+this.thickness);
    }
    public void grow(){
        System.out.println("Adding some color "+getColor());
    }
    public String printText(){
        return "Brush Stroke";
    }
    public String getColor(){
        return color;
    }
    public String setColor(String color){
        return CanBeColored.super.setColor(color);
    }
}
