package image;


import java.awt.*;
import javafx.scene.paint.Color;
import util.Matrices;

public class BruteRasterImage implements Image {

    private Color[][] colors;
    private int width;
    private int height;

    public BruteRasterImage(Color color, int width, int height){

        this.width=width;
        this.height=height;
        Color colors[][] = new Color[width][height];
        for(int widthMatrice=0; widthMatrice<width; widthMatrice++){
            for(int heightMatrice=0; heightMatrice<height; heightMatrice++){
                this.colors[widthMatrice][heightMatrice]=color;
            }
        }
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

    protected void setWidth(int width){
        this.width=width;
    }

    protected void setHeight(int height){
        this.height=height;
    }

    public Color getPixelColor(int x, int y){
        return colors[x][y];
    }

    public void createRepresentation(){
        Color colors[][] = new Color[width][height];
    }

    public void setPixelColor(Color color, int x, int y){
        colors[x][y]=color;
    }

    private void setPixelsColor(Color[][] pixels){
        this.colors = pixels;                                   // à vérifier si il ne faut pas itérer pour chaque pixel
    }

    private void setPixelsColor(Color color){
        for(int widthMatrice=0; widthMatrice<getWidth(); widthMatrice++){
            for(int heightMatrice=0; heightMatrice<getHeight(); heightMatrice++){
                setPixelColor(color,heightMatrice,widthMatrice);
            }
        }

    }


}
