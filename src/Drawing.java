import java.util.ArrayList;
import java.util.List;

public abstract class Drawing<T> {

    private List<T> shapes = new ArrayList<>();

    public Drawing(){

    }
    
    /** Adds the element given as a parameter 
    to the list of elements if the element is not null */
    public void addBasicShape(T element) {
        if (element != null){
            shapes.add(element);
        }
    }

    /**
     * Returns a new list of the elements included in the Drawing.
     * */
    public List<T> getBasicShapes(){
        return shapes;
    }

    public abstract void draw();
    
}
