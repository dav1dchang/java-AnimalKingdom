package animalkingdom;

public class Fish extends Abstractanimal
{
    public Fish(String name, int year, int food)
    {
        super(name, year, food);
    }

    @Override
    public String move()
    {
        return "swim";
    }

    @Override
    public String breathe()
    {
        return "gills";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }
}
