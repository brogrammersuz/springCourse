package uz.brogrammers;

public class ClassicalMusic implements Music {

    protected void init() {
        System.out.println("Object is being created");
    }

    private void destroy() {
        System.out.println("Object is being destroyed");
    }

    @Override
    public String getSong() {
        return "Yoshligim";
    }
}
