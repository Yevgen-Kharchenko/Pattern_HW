package strategy.characters;

import strategy.movement.Walk;

public class Troll extends GameHeroes{
    public Troll() {
        name ="Troll";
        movement =new Walk();
    }
}
