package equality;

public class ValueEquality {
    private final String name;
    private final int age;

    public ValueEquality(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ValueEquality that = (ValueEquality) o;

        return age == that.age && name.equals(that.name);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }

    public static void main(String[] args){
        System.out.println("Checking out Reference Equality");

        ValueEquality a = new ValueEquality("Bob", 21);
        ValueEquality b = new ValueEquality("Bob", 21);

        System.out.println("Are these objects referentially equal? " + (a == b));
        System.out.println("Are these objects logically equal? " + (a.equals(b)));
    }
}
