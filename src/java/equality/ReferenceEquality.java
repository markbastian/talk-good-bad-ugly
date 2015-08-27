package equality;

public class ReferenceEquality {
    private String name;
    private int age;

    public ReferenceEquality(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args){
        System.out.println("Checking out Reference Equality");

        ReferenceEquality a = new ReferenceEquality("Bob", 21);
        ReferenceEquality b = new ReferenceEquality("Bob", 21);

        System.out.println("Are these objects referentially equal? " + (a == b));
        System.out.println("Are these objects logically equal? " + (a.equals(b)));
    }
}
