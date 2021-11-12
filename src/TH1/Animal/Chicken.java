package TH1.Animal;

import TH1.Edible.Edible;

public class Chicken extends Animal  implements Edible {
    @Override
    public String makeSound(){
        return " Chicken: gáyyyy";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
