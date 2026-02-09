package org.example;


public class Main {
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        Shape trapecia = new Trapecia();
        printer.printName(trapecia);

        Shape circle = new Circle();
        printer.printName(circle);

        Shape quad = new Quad();
        printer.printName(quad);

        Shape triangle = new Triangle();
        printer.printName(triangle);

        Shape rectangle = new Rectangle();
        printer.printName(rectangle);

    }
}
