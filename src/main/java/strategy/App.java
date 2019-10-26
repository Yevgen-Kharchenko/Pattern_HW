package strategy;

import strategy.characters.*;

import java.util.Arrays;
import java.util.List;

public class App {

    private static List<GameHeroes> catalog = Arrays.asList(
            new Elf(), new Gnome(), new Harpy(),
            new Orc(), new Pegasus(), new Phoenix(),
            new Troll(), new Vampire()
    );

    public static void main(String[] args) {
        for (GameHeroes hero :
                catalog) {
            hero.move();
        }
    }
}
