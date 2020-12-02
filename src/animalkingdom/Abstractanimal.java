package animalkingdom;

abstract class Abstractanimal
{
    private static int maxId = 0;
    protected int id;
    protected String name;
    protected int year;
    protected int food;

    public Abstractanimal(String name, int year, int food)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.year = year;
        this.food = food;
    }

    abstract String move();
    abstract String breathe();
    abstract String reproduce();

    public String eatFood(int food)
    {
        this.food += food;
        return "Yummy";
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getFood()
    {
        return food;
    }

    public void setFood(int food)
    {
        this.food = food;
    }

    @Override
    public String toString()
    {
        return "Animal id: " + id + " name: " + name + " year the animal was named: " + year + " Move: " + move() + " Breathe: " + breathe() + " Reproduce: " + reproduce();
    }
}