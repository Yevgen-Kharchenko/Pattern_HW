package strategy.characters;

import strategy.movement.MagicFly;
import strategy.movement.Walk;

public class Elf extends GameHeroes implements MagicGroup {

    public Elf() {
        name = "Elf";
        movement = new Walk();
        magicFlyMove();
    }


    @Override
    public void magicFlyMove() {
        magic = new MagicFly().movementStrategy();
    }
}
