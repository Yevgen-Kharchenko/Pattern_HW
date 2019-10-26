package strategy.characters;

import strategy.movement.Fly;

public class Phoenix extends GameHeroes {
    public Phoenix() {
        name = "Phoenix";
        movement = new Fly();
    }
}
