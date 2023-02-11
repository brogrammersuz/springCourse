package uz.brogrammers;

public class FactoryExample {

    private String name;

    public FactoryExample(String name) {
        this.name = name;
    }

    public FactoryExample getInstance(String name) {
        return new FactoryExample(name);
    }
}
