package image;

import javafx.scene.paint.Color;
import javafx.scene.paint.Color;
import util.Matrices;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
public abstract class RasterImage implements Image
{
    protected List<Color> palette;
    protected int[][] indexOfcolors;
    protected int width;
    protected int height;
    protected Color[][] colors;
    protected HashMap<Point,Color> pixelsMap;

    public abstract void createRepresentation();
    public abstract Color getPixelColor(int x, int y);
    public abstract void setPixelColor(Color color, int x, int y);

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    protected void setWidth(int width){
        this.width=width;
    }

    protected void setHeight(int height){
        this.height=height;
    }

    protected void setPixelsColor(Color[][] pixels){
       for(int widthMatrice=0; widthMatrice<width; widthMatrice++)
            for(int heightMatrice=0; heightMatrice<height; heightMatrice++)
                setPixelColor(pixels[widthMatrice][heightMatrice],widthMatrice,heightMatrice);

    }

    protected void setPixelsColor(Color color){
        for(int widthMatrice=0; widthMatrice<width; widthMatrice++)
            for(int heightMatrice=0; heightMatrice<height; heightMatrice++)
               setPixelColor(color,widthMatrice,heightMatrice);

    }

    RasterImage(Color color, int width,int height) {

        setWidth(width);
        setHeight(height);
        createRepresentation();
        setPixelsColor(color);
    }

    RasterImage(Color[][] pixels) {

        Matrices.requiresNonZeroDimensions(pixels);
        Matrices.requiresNonNull(pixels);
        setWidth(Matrices.getRowCount(pixels));
        setHeight(Matrices.getColumnCount(pixels));
        createRepresentation();
        setPixelsColor(pixels);
    }
}