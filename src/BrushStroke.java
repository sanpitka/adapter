public class BrushStroke extends Visibility implements CanBeColored,ShapeBasic {
    private String color = "Yellow";
    
    public BrushStroke(){

    }
    public void draw(){
        System.out.println("Brush strokes with thickness ");
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
