package immutability;

public class ImmutablePerson {
    private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImmutablePerson that = (ImmutablePerson) o;

        return age == that.age && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }

    public ImmutablePerson setName(String newName){
        return new ImmutablePerson(newName, age);
    }

    public ImmutablePerson setAge(int newAge){
        return new ImmutablePerson(name, newAge);
    }
}