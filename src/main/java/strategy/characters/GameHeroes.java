package strategy.characters;

import strategy.movement.MovementStrategy;

public abstract class GameHeroes {
    String name;
    MovementStrategy movement;
    String magic ="";


    public void move() {
        System.out.println(name + " can "+movement.movementStrategy()+" " + magic);
    }
}
