package pl.sda.rafal.zientara.vector.paint.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Ellipse extends Shape {
    private double x;
    private double y;
    private double w;
    private double h;

    public Ellipse(double x1, double y1, double x2, double y2) {
        this.x = Math.min(x1, x2);
        this.y = Math.min(y1, y2);
        this.w = Math.abs(x1 - x2);
        this.h = Math.abs(y1 - y2);
    }

    private Ellipse(Ellipse.Builder builder){
        this.x = builder.x1;
        this.y = builder.y1;
        this.w = builder.x2;
        this.h = builder.y2;
        setFillColor(builder.fillColor);
        setStrokeColor(builder.strokeColor);
    }

    public void draw(GraphicsContext context) {

        context.strokeOval(x, y, w, h);
        context.fillOval(x, y, w, h);
    }

    @Override
    public String getData() {
        StringBuilder builder = new StringBuilder();
        builder.append("Ellipse;");
        builder.append(x).append(";");
        builder.append(y).append(";");
        builder.append(w).append(";");
        builder.append(h).append(";");
        builder.append(getFillColor()).append(";");
        builder.append(getStrokeColor()).append(";");
        return builder.toString();
    }

    public static class Builder {
        double x1;
        double y1;
        double x2;
        double y2;
        Color fillColor = Color.RED;
        Color strokeColor = Color.BLACK; // dodajemy w builderze domyślne wartości, żeby nie było nullem


        public Ellipse build(){
            return new Ellipse(this);
        }



        public Builder setX1(double x1) {
            this.x1 = x1;
            return this;
        }



        public Builder setY1(double y1) {
            this.y1 = y1;
            return this;
        }



        public Builder setX2(double x2) {
            this.x2 = x2;
            return this;
        }



        public Builder setY2(double y2) {
            this.y2 = y2;
            return this;
        }



        public Builder setFillColor(String fillColor) {
            this.fillColor = Color.valueOf(fillColor);
            return this;
        }



        public Builder setStrokeColor(String strokeColor) {
            this.strokeColor = Color.valueOf(strokeColor);
            return this;
        }
    }

}
