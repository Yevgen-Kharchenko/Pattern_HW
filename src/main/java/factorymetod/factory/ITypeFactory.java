package factorymetod.factory;

import factorymetod.figures.Figure;
import factorymetod.figures.IType;

public class ITypeFactory implements FigureFactory {

    @Override
    public Figure createFigure() {
        return new IType();
    }
}
