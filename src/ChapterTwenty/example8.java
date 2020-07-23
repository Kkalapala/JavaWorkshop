package ChapterTwenty;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

public class example8 {
    public static class Human {
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

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public void setGender(String gender) {
            this.gender = gender;
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

    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<Human>();
        humans.add(new Human("Maria"));
        humans.add((new Human("Petter", 32)));
        humans.add(new Human("Janna", "female"));
        humans.add(new Human("Silvio", 55, "male"));

        //first test: findFirst in Stream
        System.out.println("First test");
        Optional<Human> result = humans.stream().findFirst();

        // first method: chain of flatMap with lambda filter and protection against exception
        if (result.isPresent()) {
            System.out.println(result.flatMap(Human::getAge)
                    .filter(g -> g < 30)
                    .orElse(-1));
        }

        // second method: lambda of chain with lambda filter and protection against exception
        result.ifPresent(s -> System.out.println(s.getAge()
                .filter(g -> g < 30)
                .orElse(-1)));

        // second test: check age of everyone in stream
        System.out.println("Second test");
        humans.stream().forEach( (Human h) -> {
                    System.out.println(h.getAge()
                            .orElse(-1));
                }
        );
    }
}
