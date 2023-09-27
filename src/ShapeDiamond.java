import java.text.DecimalFormat;

public class ShapeDiamond implements CanBeColored,ShapeSpecial {
    private double a = 2.0;
    private double b = 2.0;
    private DecimalFormat df2 = new DecimalFormat("#.##");
    private String color = "No color";

    public ShapeDiamond(){

    }
    public ShapeDiamond(String s){

    }
    private boolean checkDecimals(double first, double second){
        if(first>=a || second>=b){
            return true;
        }else{
            return false;
        }
    }
    public ShapeDiamond(double x, double y){
        if(checkDecimals(x,y)){
            this.a = x;
            this.b = y;
        }
    }
    public ShapeDiamond(double x, double y, String s){
        if(checkDecimals(x, y)){
            this.a = x;
            this.b = y;
        }
    }
    public double calculateArea(){
        return (a*b)/2;
    }
    public double calculatePerimeter(){
        return a*4;
    }
    @Override
    public String setColor(String color){
        return CanBeColored.super.setColor(color);
    }
    public String getColor(){
        return color;
    }
 
    public void drawShape(){
        String output = String.format( "This is a diamond shape with area: %s and perimeter: %s. Color: %s ", df2.format(calculateArea()),
        df2.format(calculatePerimeter()),getColor());
        System.out.println(output);
        
    }   
}
