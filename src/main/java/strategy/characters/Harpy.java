package strategy.characters;

import strategy.movement.Fly;

public class Harpy extends GameHeroes{
    public Harpy() {
        name="Harpy";
        movement =new Fly();
    }
}
