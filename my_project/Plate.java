package my_project;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void increaseFood (int food)
    {
        this.food += food;
    }

    public void decreaseFood (int appetite) {
        if (!checkEnoughFood(appetite))
        {
            System.out.println("plate: Еда закончилась или её не хватает!");
        } else {
            food = food - appetite;
        }
    }

    public boolean checkEnoughFood (int appetite)
    {
        return appetite <= food;
    }


    public void info() {
            System.out.println("plate: " + food);
        }
    }


