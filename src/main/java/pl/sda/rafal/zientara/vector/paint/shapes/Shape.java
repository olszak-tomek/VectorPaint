package pl.sda.rafal.zientara.vector.paint.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public abstract class Shape {
    private Paint fillColor = Color.PINK;
    private Paint strokeColor = Color.CHOCOLATE;

    public void drawShape(GraphicsContext context) {
        context.setLineWidth(5);
        context.setStroke(getStrokeColor());
        context.setFill(getFillColor());
        draw(context);
    }

    public abstract void draw(GraphicsContext context);

    public abstract String getData();

    public void setFillColor(Paint fillColor) {
        this.fillColor = fillColor;
    }

    public Paint getFillColor() {
        return fillColor;
    }

    public void setStrokeColor(Paint strokeColor) {
        this.strokeColor = strokeColor;
    }

    public Paint getStrokeColor() {
        return strokeColor;
    }
}
