package image;

import java.awt.*;
import javafx.scene.paint.Color;
import util.Matrices;

import java.util.HashMap;
import java.util.Map;

public class SparseRasterImage extends RasterImage implements Map<Point,Color>{

    public SparseRasterImage(Color color, int width, int height){
        setWidth(width);
        setHeight(height);
        createRepresentation();
        setPixelsColor(color);
    }

    public SparseRasterImage(Color[][] pixels){
        setWidth(Matrices.getRowCount(pixels));
        setHeight(Matrices.getColumnCount(pixels));
        createRepresentation();
        setPixelsColor(pixels);
    }

    public void createRepresentation(){
        pixelsMap = new HashMap<>();
        //TODO
    }




}

