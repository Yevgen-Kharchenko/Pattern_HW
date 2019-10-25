package factorymetod.factory;

import factorymetod.figures.Figure;
import factorymetod.figures.SuperType;

public class SuperTypeFactory implements FigureFactory {
    @Override
    public Figure createFigure() {
        return new SuperType();
    }
}
