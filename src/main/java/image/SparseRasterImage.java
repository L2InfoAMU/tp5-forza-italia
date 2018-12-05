package image;

import java.awt.*;
import javafx.scene.paint.Color;
import util.Matrices;

import java.util.HashMap;
import java.util.Map;

public class SparseRasterImage extends RasterImage {

    public SparseRasterImage(Color color, int width, int height){
        super(color,width,height):
    }

    public SparseRasterImage(Color[][] pixels){

        super(pixels);
    }

    public void createRepresentation(){
        pixelsMap = new HashMap<>();
    }


    @Override
    public Color getPixelColor(int x, int y) {
        
    }

    @Override
    public void setPixelColor(Color color, int x, int y) {

    }
}
