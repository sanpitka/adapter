public interface CanBeColored {    
    /**
     * Verifies that the color of the shape is one of the valid colors.
     * The valid colors are Blue, Green, Red, and Yellow.
     * @return verified color or "No color" if the color does not match
     */ 
    default String setColor(String color){
        if (color != null && (color == "Blue" || color == "Green" || color == "Red" || color == "Yellow")) {
            return color;
        }
        else return "No color";
    }
    
    public String getColor();
}
