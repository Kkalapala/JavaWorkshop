package ChapterTwenty;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

class Human {
    private String name;
    private Integer age;
    private String gender;

    // getters
    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
    public Optional<Integer> getAge() {
        return Optional.ofNullable(age);
    }
    public Optional<String> getGender() {
        return Optional.ofNullable(gender);
    }

    // setters
    public void setName(String _name) {
        name = _name;
    }
    public void setAge(Integer _age) {
        age = _age;
    }
    public void setGender(String _gender) {
        gender = _gender;
    }

    // constructors (there could be more)
    Human () {
        // empty constructor, do nothing
    }
    Human (String _name) {
        name = _name;
    }
    Human (String _name, Integer _age) {
        name = _name;
        age = _age;
    }
    Human (String _name, Integer _age, String _gender) {
        name = _name;
        age = _age;
        gender = _gender;
    }
    Human (String _name, String _gender) {
        name = _name;
        gender = _gender;
    }
}

public class example7 {
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<Human>();

        humans.add(new Human("Maria", 43, "female"));
        humans.add((new Human("Petter", 32, "male")));
        humans.add(new Human("Janna", 34, "female"));
        humans.add(new Human("Silvio", 55, "male"));
        humans.add(new Human("Annika", 25, "female"));

        Iterator<Human> theHuman = humans.iterator();

        // print a table header
        System.out.println("females under 30");
        System.out.println("name\tage\tgender");
        System.out.println("-------------------");

        // print the table content
        while (theHuman.hasNext()) {
            Optional<Human> human = Optional.of(theHuman.next());
            boolean isMale = human
                    .flatMap(Human::getGender)
                    .filter(g -> g.equals("male"))
                    .isPresent();

            // female under 30
            boolean f1 = human.flatMap(Human::getAge).filter(g -> g < 30).
                    isPresent();
            boolean f2 = human.flatMap(Human::getGender).filter(g ->
                    g.equals("female")).isPresent();

            // print results
            if (f1 & f2) {
                // the name is a mandatory parameter
                human.flatMap(Human::getName).ifPresent((String s) ->
                        System.out.print(s + "\t"));
                if (human.flatMap(Human::getName) == null) {
                    System.out.print("no name\t");
                }
                // the age is optional, if not present, insert a tab
                human.flatMap(Human::getAge).ifPresent((Integer s) ->
                        System.out.print(s + "\t"));
                if (human.flatMap(Human::getAge) == null) {
                    System.out.print("\t");
                }
                // the gender is optional, but since there are no other
                // parameters, no need to add an extra tab
                human.flatMap(Human::getGender).ifPresent((String s) ->
                        System.out.print(s));

                // print the EOL
                System.out.println();
            }
        }
    }
}
