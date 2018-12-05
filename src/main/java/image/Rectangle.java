package image;

import java.awt.*;
import javafx.scene.paint.Color;

public class Rectangle implements Shape {

    public int x;
    public int y;
    private int width;
    private int height;
    public Color color;

    public Rectangle(int x,int y, int width, int height, Color color){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.color=color;
    }

    public boolean contains(Point point){
        return point.x<=x+width && point.y<=y+height && point.x>=x && point.y>=y;
    }
}
