package image;

import javafx.scene.paint.Color;
import javafx.scene.paint.Color;
import util.Matrices;
import java.util.ArrayList;

import java.util.List;
public abstract class RasterImage implements Image
{
    protected List<Color> palette;
    protected int[][] indexOfcolors;
    protected int width;
    protected int height;
    protected Color[][] colors;

    public abstract void createRepresentation();
    public abstract Color getPixelColor(int x, int y);
    public abstract void setPixelColor(Color color, int x, int y);

    public int getWidth()
    {
        return width;
    }
    public int getHeight()
    {
        return height;
    }

    protected void setWidth(int width)
    {
        this.width=width;
    }

    protected void setHeight(int height)
    {
        this.height=height;
    }

    protected void setPixelsColor(Color[][] pixels)
    {
       for(int widthMatrice=0; widthMatrice<Matrices.getColumnCount(colors); widthMatrice++)
            for(int heightMatrice=0; heightMatrice<Matrices.getRowCount(colors); heightMatrice++)
                colors[widthMatrice][heightMatrice]=pixels[widthMatrice][heightMatrice];

    }

    protected void setPixelsColor(Color color)
    {
        for(int widthMatrice=0; widthMatrice<getWidth(); widthMatrice++)
            for(int heightMatrice=0; heightMatrice<getHeight(); heightMatrice++)
               setPixelColor(color,heightMatrice,widthMatrice);
        
    }
}