package HW_1;

import java.util.ArrayList;
import java.util.List;

public class RaffleToy {
    public static void main(String[] args) {
        ChildrenToy toy1 = new ChildrenToy(0, "Barbie doll", 10, 25);
        ChildrenToy toy2 = new ChildrenToy(1, "Constructor Lego", 200, 40);
        ChildrenToy toy3 = new ChildrenToy(2, "Robot", 250, 30);
        ChildrenToy toy4 = new ChildrenToy(3, "Yula", 150, 65);
        ChildrenToy toy5 = new ChildrenToy(4, "Puzzles", 500, 45);
        ChildrenToy toy6 = new ChildrenToy(5, "Board game", 300, 35);
        ChildrenToy toy7 = new ChildrenToy(6, "Matryoshka", 200, 25);
        ChildrenToy toy8 = new ChildrenToy(7, "Ball", 40, 20);

        List<ChildrenToy> toys = new ArrayList<ChildrenToy>();
        toys.add(toy1);
        toys.add(toy2);
        toys.add(toy3);
        toys.add(toy4);
        toys.add(toy5);
        toys.add(toy6);
        toys.add(toy7);
        toys.add(toy8);

        ChildrenToyStore toyStore = new ChildrenToyStore(toys);
        toyStore.toyForLote();
        toyStore.toyForLote();
        toyStore.toyForLote();
        toyStore.toyForLote();
        toyStore.toyForLote();
        toyStore.toyForLote();
        toyStore.toyForLote();
        toyStore.toyForLote();

    }
}
