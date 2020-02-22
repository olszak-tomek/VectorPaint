package pl.sda.rafal.zientara.vector.paint;


import pl.sda.rafal.zientara.vector.paint.shapes.*;

public class ShapeFactory {
    public Shape get(String string) {
        String[] data = string.split(";");
        String shapeName = data[0].toLowerCase();

        switch (shapeName) {
            case "line":
                return getLine(data);
            case "rectangle":
                return getRectangle(data);
            case "triangle":
                return getTriangle(data);
            case "ellipse":
                return getEllipse(data);

        }


        return null;
    }



    private Shape getEllipse(String[] data) {
        double x1 = Double.parseDouble(data[1]);
        double y1 = Double.parseDouble(data[2]);
        double x2 = Double.parseDouble(data[3]);
        double y2 = Double.parseDouble(data[4]);

        String fillColor = data[5];
        String strokeColor = data[6];

        Ellipse ellipse = new Ellipse.Builder()
                .setX1(x1)
                .setY1(y1)
                .setX2(x2)
                .setY2(y2)
                .setFillColor(fillColor)
                .setStrokeColor(strokeColor)
                .build();

        return ellipse;
    }


    private Shape getLine(String[] data) {
        double x1 = Double.parseDouble(data[1]);
        double y1 = Double.parseDouble(data[2]);
        double x2 = Double.parseDouble(data[3]);
        double y2 = Double.parseDouble(data[4]);

        String fillColor = data[5];
        String strokeColor = data[6];

        Line line = new Line.Builder()
                .setX1(x1)
                .setY1(y1)
                .setX2(x2)
                .setY2(y2)
                .setFillColor(fillColor)
                .setStrokeColor(strokeColor)
                .build();

        return line;
    }

    private Shape getRectangle(String[] data) {
        double x1 = Double.parseDouble(data[1]);
        double y1 = Double.parseDouble(data[2]);
        double x2 = Double.parseDouble(data[3]);
        double y2 = Double.parseDouble(data[4]);

        String fillColor = data[5];
        String strokeColor = data[6];

        Rectangle rectangle = new Rectangle.Builder()
                .setX1(x1)
                .setY1(y1)
                .setX2(x2)
                .setY2(y2)
                .setFillColor(fillColor)
                .setStrokeColor(strokeColor)
                .build();

        return rectangle;
    }

    private Shape getTriangle(String[] data) {
        double x1 = Double.parseDouble(data[1]);
        double y1 = Double.parseDouble(data[2]);
        double x2 = Double.parseDouble(data[3]);
        double y2 = Double.parseDouble(data[4]);
        double x3 = Double.parseDouble(data[5]);
        double y3 = Double.parseDouble(data[6]);


        String fillColor = data[7];
        String strokeColor = data[8];

        Triangle triangle = new Triangle.Builder()
                .setPoint1(x1, y1)
                .setPoint2(x2, y2)
                .setPoint3(x3, y3)
                .setFillColor(fillColor)
                .setStrokeColor(strokeColor)
                .build();

        return triangle;
    }
}
