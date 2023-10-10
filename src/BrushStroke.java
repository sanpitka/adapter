import java.util.Random;

public class BrushStroke extends Visibility implements CanBeColored,ShapeBasic {
    private String color = "Yellow";
    private final int thickness;

    public BrushStroke(){
        Random random = new Random();
        this.thickness = random.nextInt(10)+1;
    }

    /**
     * "Draws" a new brush stroke to the drawing by printing the thickness of the stroke
     */
    public void draw(){
        System.out.println("Brush strokes with thickness " + this.thickness);
    }

    /**
     * Adds given color to the brush stroke by printing the color name or "Out of color..." if the color name is not correct
     */
    public void grow(){
        System.out.println("Adding some color... " + getColor());
    }
    
    public String printText(){
        return "Brush Stroke";
    }
    public String getColor(){
        if (color.equals("No color")) {
            return "Out of color...";
        }
        return color;
    }

    @Override
    public String setColor(String color){
        this.color = CanBeColored.super.setColor(color);
        return this.color;
    }
}
