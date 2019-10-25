package factorymetod.factory;

import factorymetod.figures.Figure;
import factorymetod.figures.SType;

public class STypeFactory implements FigureFactory {
    @Override
    public Figure createFigure() {
        return new SType();
    }
}
