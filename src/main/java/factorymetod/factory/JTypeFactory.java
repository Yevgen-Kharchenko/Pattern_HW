package factorymetod.factory;

import factorymetod.figures.Figure;
import factorymetod.figures.JType;

public class JTypeFactory implements FigureFactory {

    @Override
    public Figure createFigure() {
        return new JType();
    }
}
