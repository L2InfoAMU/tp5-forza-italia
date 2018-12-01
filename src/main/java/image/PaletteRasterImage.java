package image;

import javafx.scene.paint.Color;
import util.Matrices;

import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage implements Image
{
    private List<Color> palette;
    private int[][] indexOfcolors;
    private int width;
    private int height;

    public PaletteRasterImage(Color color, int width,int height)
    {
        this.width = width;
        this.height = height;
        createrepresentation();
        setPixelsColor(color);
    }
    public PaletteRasterImage(Color[][] pixel)
    {
        this.setHeight(Matrices.getColumnCount(pixel));
        this.setWidth(Matrices.getRowCount(pixel));
        createrepresentation();
        setPixelsColor(pixel);
    }


    public void createrepresentation()
    {
        palette = new ArrayList<>();
        indexOfcolors = new int[width][height];
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return palette.get(indexOfcolors[x][y]);
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public void setPixelColor(Color color, int x,int y)
    {
        if(!palette.contains(color))
        {
            palette.add(color);
            indexOfcolors[x][y] = palette.indexOf(color);
        }
        else indexOfcolors[x][y] = palette.indexOf(color);
    }

    public void setPixelsColor(Color[][] pixels)
    {
        for (int lines = 0;lines<width;lines++)
            for (int rows = 0 ;rows < height; rows ++)
                setPixelColor(pixels[lines][rows],lines,rows);
    }
    public void setPixelsColor(Color color)
    {
        for (int lines = 0;lines<width;lines++)
            for (int rows = 0 ;rows < height; rows ++)
                setPixelColor(color,rows,lines);
    }

    public void setWidth(int width){
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }

}
