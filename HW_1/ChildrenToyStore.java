package HW_1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ChildrenToyStore {
    private List<ChildrenToy> toys;

    public ChildrenToyStore(List<ChildrenToy> toys) {
        this.toys = toys;
    }

    public ChildrenToy getToyForPrize() {
        RandomChildrenToy random = new RandomChildrenToy();
        ChildrenToy toy = random.chooseOnFrequency(toys);
        return toy;
    }

    public void toyForLote() {
        ChildrenToy toy = getToyForPrize();
        String text = toy.toString();
        try (FileWriter writer = new FileWriter("loteToy.txt", true)) {
            writer.write(text);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        toys.remove(toy);
    }
}
