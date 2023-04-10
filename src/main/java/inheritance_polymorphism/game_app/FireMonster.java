package inheritance_polymorphism.game_app;

public class FireMonster extends Monster {

    public FireMonster(String name) {
        super(name);
    }

    public String attack() {
        return "Attack with fire!";
    }
}
