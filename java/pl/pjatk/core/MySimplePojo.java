package pl.pjatk.core;

public class MySimplePojo {
    private final String name;
    private final int age;

    public MySimplePojo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void soutSomething()
    {
        System.out.println("Something");
    }
}
