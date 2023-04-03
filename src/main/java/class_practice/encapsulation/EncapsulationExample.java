package class_practice.encapsulation;

public class EncapsulationExample {
    public static void main(String[] args) {
        HumanBeing humanBeing = new HumanBeing();
        humanBeing.setWeight(60);
        humanBeing.setHeight(1.8f);
        humanBeing.setBmi(calculateBmi(humanBeing));

        System.out.println("Person has " + humanBeing.getWeight() + " kgs and is " + humanBeing.getHeight()
                + " meters in height, which results in BMI of " + humanBeing.getBmi());
    }

    private static float calculateBmi(HumanBeing humanBeing) {
        return humanBeing.getWeight() / (humanBeing.getHeight() * humanBeing.getHeight());
    }
}
