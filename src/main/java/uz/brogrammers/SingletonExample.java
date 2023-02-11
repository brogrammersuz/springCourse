package uz.brogrammers;

public class SingletonExample {

    private String name;

    private static SingletonExample singletonExample;

    private SingletonExample(String name) {
        this.name = name;
    }

    public static SingletonExample getInstance(String name) {
        if (singletonExample == null) {
            synchronized (SingletonExample.class) {
                if (singletonExample == null) {
                    singletonExample = new SingletonExample(name);
                }
            }
        }

        return singletonExample;
    }

    public String getName() {
        return name;
    }
}
