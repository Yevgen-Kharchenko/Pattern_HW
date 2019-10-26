package strategy.characters;

import strategy.movement.Walk;

public class Orc extends GameHeroes{
    public Orc() {
        name="Orc";
        movement=new Walk();
    }
}
