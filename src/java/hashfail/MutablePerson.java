package hashfail;

import java.util.HashSet;
import java.util.Set;

public class MutablePerson {
    private String name;
    private int age;

    public static void main(String[] args){
        Set<MutablePerson> people = new HashSet<>();
        MutablePerson a = new MutablePerson("Mark", 21);
        people.add(a);
        System.out.println(people.contains(a));
        a.setAge(42);
        System.out.println(people.contains(a));
    }

    public MutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MutablePerson that = (MutablePerson) o;

        return age == that.age && name.equals(that.name);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
