package Animal;

import edible.Edible;

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
