package image;


import java.awt.*;
import javafx.scene.paint.Color;
import util.Matrices;

public class BruteRasterImage implements Image {

    private Color[][] colors;
    private Color color;
    private int width;
    private int height;

    public BruteRasterImage(Color color, int width, int height){

        this.color=color;
        this.width=width;
        this.height=height;
    }

    public BruteRasterImage(Color[][] colors){
        Matrices.requiresNonZeroDimensions(colors);
        Matrices.requiresNonNull(colors);
        this.colors=colors;
    }

    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }

    public Color getPixelColor(int x, int y){
        return colors[x][y];
    }

}
