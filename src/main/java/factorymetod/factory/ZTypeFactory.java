package factorymetod.factory;

import factorymetod.figures.Figure;
import factorymetod.figures.ZType;

public class ZTypeFactory implements FigureFactory {
    @Override
    public Figure createFigure() {
        return new ZType();
    }
}
