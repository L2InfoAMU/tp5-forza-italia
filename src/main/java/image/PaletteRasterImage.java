package image;

import javafx.scene.paint.Color;
import util.Matrices;

import java.awt.image.Raster;
import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage extends RasterImage implements Image {

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

    public void setPixelColor(Color color, int x,int y)
    {
        if(!palette.contains(color))
        {
            palette.add(color);
            indexOfcolors[x][y] = palette.indexOf(color);
        }
        else indexOfcolors[x][y] = palette.indexOf(color);
    }

}
