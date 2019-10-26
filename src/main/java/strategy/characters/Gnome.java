package strategy.characters;

import strategy.movement.MagicFly;
import strategy.movement.Walk;

public class Gnome extends GameHeroes implements MagicGroup{
    public Gnome() {
        name = "Gnome";
        movement = new Walk();
        magicFlyMove();
    }

    @Override
    public void magicFlyMove() {
        magic = new MagicFly().movementStrategy();
    }
}
