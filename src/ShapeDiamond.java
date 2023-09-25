import java.text.DecimalFormat;

public class ShapeDiamond {
    private double a = 2.0;
    private double b = 2.0;
    private DecimalFormat df2 = new DecimalFormat("#.##");
    private String color = "No color";

    public ShapeDiamond(){

    }
    public ShapeDiamond(String s){

    }
    private boolean checkDecimals(double first, double second){
        if(first>=2.0 || second>=2.0){
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
        return 0.0;
    }
    public void setColor(String c){
        this.color = c;
    }
    public String getColor(){
        return color;
    }
 
    public void drawShape(){
        String output = String.format( "This is a diamond shape with area: %d and perimeter: %d. Color: %s ",a,b,getColor());
        System.out.println(output);
        
    }   
}