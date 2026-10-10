package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        Random random = new Random();
        int figureNumber = random.nextInt(5);
        ColorSupplier colorSupplier = new ColorSupplier();

        switch (figureNumber) {
            case 0:
                return new Square(
                        colorSupplier.getRandomColor(),
                        random.nextInt(100) + 1
                );
            case 1:
                return new Rectangle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(100) + 1,
                        random.nextInt(100) + 1
                );
            case 2:
                return new RightTriangle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(100) + 1,
                        random.nextInt(100) + 1
                );
            case 3:
                return new Circle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(100) + 1
                );
            case 4:
                return new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(),
                        random.nextInt(100) + 1,
                        random.nextInt(100) + 1,
                        random.nextInt(100) + 1
                );
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10);
    }

}
