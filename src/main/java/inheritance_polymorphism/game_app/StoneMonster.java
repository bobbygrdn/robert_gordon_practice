package inheritance_polymorphism.game_app;

public class StoneMonster extends Monster {

    public StoneMonster(String name) {
        super(name);
    }

    public String attack() {
        return "Attack with stones!";
    }
}
