package factorymetod.factory;

import factorymetod.figures.Figure;
import factorymetod.figures.TType;

public class TTypeFactory implements FigureFactory {
    @Override
    public Figure createFigure() {
        return new TType();
    }
}
