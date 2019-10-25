package factorymetod.factory;

import factorymetod.figures.Figure;
import factorymetod.figures.QType;

public class QTypeFactory implements FigureFactory {

    @Override
    public Figure createFigure() {
        return new QType();
    }
}
