package HW_1;

import java.util.List;

public class RandomChildrenToy {
    public ChildrenToy chooseOnFrequency(List<ChildrenToy> toys) {
        double completefrequency = 0.0;
        for (ChildrenToy toy : toys)
            completefrequency += toy.getFrequency();
        double r = Math.random() * completefrequency;
        double countfrequency = 0.0;
        for (ChildrenToy toy : toys) {
            countfrequency += toy.getFrequency();
            if (countfrequency >= r)
                return toy;
        }
        throw new RuntimeException("Should never be shown.");
    }
}
