package TH1.Animal;

import TH1.Edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Tiger: Gầmmmm!";
    }

    @Override
    public String howToEat() {
        return "Ăn lz";
    }
}
