package animalkingdom;

import java.util.List;
import java.util.ArrayList;

public class Main
{
    private static List<Abstractanimal> filterAnimals(List<Abstractanimal> theList, CheckAnimal tester) {
        List<Abstractanimal> tempList = new ArrayList<>();

        for (Abstractanimal a : theList) {
            if (tester.test(a)) {
                tempList.add(a);
            }
        }
        return tempList;
    }

    public static void main(String[] args)
    {
        Mammal panda  = new Mammal("Panda", 1869, 0);
        Mammal zebra = new Mammal("Zebra", 1778, 0);
        Mammal koala  = new Mammal("Koala", 1816, 0);
        Mammal sloth  = new Mammal("Sloth", 1804, 0);
        Mammal armadillo = new Mammal("Armadillo", 1758, 0);
        Mammal raccoon = new Mammal("Raccoon", 1758 , 0);
        Mammal bigfoot = new Mammal("Bigfoot", 2021, 0);
        Bird pigeon = new Bird("Pigeon", 1837, 0);
        Bird peacock = new Bird("Peacock", 1821, 0);
        Bird toucan = new Bird("Toucan", 1758, 0);
        Bird parrot = new Bird("Parrot", 1824, 0);
        Bird swan = new Bird("Swan", 1758, 0);
        Fish salmon = new Fish("Salmon", 1758, 0);
        Fish catfish = new Fish("Catfish", 1817, 0);
        Fish perch = new Fish("Perch", 1758, 0);

        List<Abstractanimal> myList = new ArrayList<>();
        myList.add(panda);
        myList.add(zebra);
        myList.add(koala);
        myList.add(sloth);
        myList.add(armadillo);
        myList.add(raccoon);
        myList.add(bigfoot);
        myList.add(pigeon);
        myList.add(peacock);
        myList.add(toucan);
        myList.add(parrot);
        myList.add(swan);
        myList.add(salmon);
        myList.add(catfish);
        myList.add(perch);

        System.out.println();
        System.out.println("*** List all the animals in descending order by year named ***");
        myList.sort((a1, a2) -> a2.getYear() - a1.getYear());
        myList.forEach((a) -> System.out.println(a));

        System.out.println("\n\n\n*** List all the animals alphabetically ***");
        myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        myList.forEach((a) -> System.out.println(a.getName()));

        System.out.println("\n\n\n*** List all the animals order by how they move ***");
        myList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        myList.forEach((a) -> System.out.println(a));

        System.out.println("\n\n\n*** List only those animals the breath with lungs ***");
        List<Abstractanimal> filteredList = filterAnimals(myList, (a) -> (a.breathe() == "lungs"));
        filteredList.forEach(a -> System.out.println(a));

        System.out.println("\n\n\n*** List only those animals that breath with lungs and were named in 1758 ***");
        List<Abstractanimal> filteredList2 = filterAnimals(myList, (a) -> (a.breathe() == "lungs" && a.getYear() == 1758));
        filteredList2.forEach(a -> System.out.println(a));

        System.out.println("\n\n\n*** List only those animals that lay eggs and breath with lungs ***");
        List<Abstractanimal> filteredList3 = filterAnimals(myList, (a) -> (a.breathe() == "lungs" && a.reproduce() == "eggs"));
        filteredList3.forEach(a -> System.out.println(a));

        System.out.println("\n\n\n*** List alphabetically only those animals that were named in 1758 ***");
        List<Abstractanimal> filteredList4 = filterAnimals(myList, a -> a.getYear() == 1758);
        filteredList4.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        filteredList4.forEach((a) -> System.out.println(a));

    }
}