package factorymetod.factory;

import factorymetod.figures.Figure;
import factorymetod.figures.LType;

public class LTypeFactory implements FigureFactory {

    @Override
    public Figure createFigure() {
        return new LType();
    }
}
