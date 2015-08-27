package equality;

public class LogicalEquality {
    public String name;
    public int age;

    public LogicalEquality(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LogicalEquality that = (LogicalEquality) o;

        return age == that.age && name.equals(that.name);

    }

    public static void main(String[] args){
        System.out.println("Checking out Reference Equality");

        LogicalEquality a = new LogicalEquality("Bob", 21);
        LogicalEquality b = new LogicalEquality("Bob", 21);

        System.out.println("Are these objects referentially equal? " + (a == b));
        System.out.println("Are these objects logically equal? " + (a.equals(b)));

        a.age-=1;
        System.out.println("Are these objects logically equal? " + (a.equals(b)));
    }
}
