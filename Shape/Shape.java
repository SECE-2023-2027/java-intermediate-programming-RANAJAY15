package Shape;

public abstract class Shape {
    abstract double getArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }
}

class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(3.0);
        Shape s2 = new Rectangle(4.0, 5.0);

        System.out.println(Math.round(s1.getArea()));
        System.out.println(s2.getArea());
    }
}

