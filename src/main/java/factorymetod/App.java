package factorymetod;


import factorymetod.factory.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class App {
    private static List<FigureFactory> catalog = Arrays.asList(
            new ITypeFactory(), new JTypeFactory(), new LTypeFactory(),
            new QTypeFactory(), new STypeFactory(), new SuperTypeFactory(),
            new TTypeFactory(), new ZTypeFactory()
    );

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            FigureFactory factory = catalog.get(random.nextInt(catalog.size()));
            System.out.println(factory.createFigure());
        }
    }

}
