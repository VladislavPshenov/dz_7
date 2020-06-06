package my_project;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p) {

        if (p.checkEnoughFood(appetite) && !satiety)
        {
            p.decreaseFood(appetite);
            satiety = true;
            System.out.println (name + " поел");
        }
        else if (satiety)
        {
            System.out.println (name + " не хочет есть");
        }
        else
        {
            System.out.println ("Недостаточно еды для " + name );
        }

    }
}

