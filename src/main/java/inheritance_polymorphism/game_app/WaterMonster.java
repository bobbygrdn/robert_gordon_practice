package inheritance_polymorphism.game_app;

public class WaterMonster extends Monster {

    public WaterMonster(String name) {
        super(name);
    }

    public String attack() {
        return "Attack with water!";
    }
}
