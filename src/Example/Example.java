package Example;

import java.util.Objects;

public class Example {
    private final int first;
    private final int second;

    public Example(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example example = (Example) o;
        return (first == example.first && second == example.second)
                || (first == example.second && second == example.first);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first * second, first + second);
    }

    @Override
    public String toString() {
        return first + " * " + second + " = ?";
    }
}
