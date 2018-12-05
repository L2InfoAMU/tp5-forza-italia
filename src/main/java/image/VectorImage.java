package image;

import java.util.ArrayList;
import java.util.List;

public class VectorImage implements Image {

    private int width;
    private int height;
    private List<Shape> shapes;

    public VectorImage(List<Shape> shapes, int width, int height){
        this.width=width;
        this.height=height;
        this.shapes=new ArrayList<>(shapes);
    }
}
