package strategy.characters;

import strategy.movement.MagicFly;
import strategy.movement.Walk;

public class Vampire extends GameHeroes implements MagicGroup{
    public Vampire() {
        name="Vampire";
        movement=new Walk();
        magicFlyMove();
    }

    @Override
    public void magicFlyMove() {
        magic = new MagicFly().movementStrategy();
    }
}
