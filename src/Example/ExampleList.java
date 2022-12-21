package Example;

import Example.Example;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class ExampleList {
    private final Set<Example> examples = new HashSet<>();

    public ExampleList() {
        Random random = new Random();
        while (examples.size() < 15) {
            examples.add(new Example(random.nextInt(2), random.nextInt(10)));
        }
    }

    @Override
    public String toString() {
        return "Примеры: " + examples + " = ?";
    }
}
