package animalkingdom;

public class Mammal extends Abstractanimal
{
    public Mammal(String name, int year, int food)
    {
        super(name, year, food);
    }

    @Override
    public String move()
    {
        return "walk";
    }

    @Override
    public String breathe()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "live births";
    }
}