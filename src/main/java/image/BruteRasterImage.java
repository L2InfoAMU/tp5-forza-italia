package image;


import java.awt.*;
import javafx.scene.paint.Color;
import util.Matrices;

public class BruteRasterImage extends RasterImage implements Image {

    public BruteRasterImage(Color color, int width, int height){

        super(color,width,height);
    }

    public BruteRasterImage(Color[][] colors)
    {
        super(colors);
    }

    public Color getPixelColor(int x, int y){
        return colors[x][y];
    }

    public void createRepresentation(){
        colors = new Color[width][height];
    }

    public void setPixelColor(Color color, int x, int y){
        colors[x][y]=color;
    }

}
