import java.text.DecimalFormat;

public class Triangle implements ShapeSpecial,CanBeColored {
    private double a = 3.0;
    private double b = 3.0;
    private double c = 3.0;
    private DecimalFormat df2 = new DecimalFormat("#.##");
    private String color = "No color";

    public Triangle(){

    }
    public Triangle(String s){
        setColor(s);
    }
    public Triangle(double x, double y, double z){
        if(checkValues(x, y, z)){
            this.a = x;
            this.b = y;
            this.c = z;
        }
    }
    public Triangle(double x, double y, double z, String s){
        if(checkValues(x, y, z)){
            this.a = x;
            this.b = y;
            this.c = z;
        }
        setColor(s);
        
    }
    private boolean checkValues(double first, double second, double third){
        if(first >= 3.0 && second >=3.0 && third >= 3.0){
            return true;
        }else{
            return  false;
        }
    }

    public double calculatePerimeter(){
        return (a+b+c);//(p * (p - a) * (p - b) * (p - c))
    }
    public double calculateArea(){
        double p = calculatePerimeter()/2;
        return Math.sqrt((p * (p - a) * (p - b) * (p - c)));
    }
    public void drawShape(){
        String output = String.format("This is a triangle with area: %s and perimeter: %s. Color: %s", df2.format(calculateArea()),
        df2.format(calculatePerimeter()), getColor());
        System.out.println(output);
    }
    public String getColor(){
        return color;
    }
    @Override
    public  String setColor(String color){
        this.color = CanBeColored.super.setColor(color);
        return color;
    }
}
