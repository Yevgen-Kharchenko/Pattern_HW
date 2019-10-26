package strategy.characters;

import strategy.movement.WalkAndFly;

public class Pegasus extends GameHeroes{
    public Pegasus() {
        name="Pegasus";
        movement=new WalkAndFly();
    }
}
