package animalkingdom;

public class Bird extends Abstractanimal
{
    public Bird(String name, int year, int food)
    {
        super(name, year, food);
    }

    @Override
    public String move()
    {
        return "fly";
    }

    @Override
    public String breathe()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }
}