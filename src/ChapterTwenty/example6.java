package ChapterTwenty;

import ChapterTwenty.Exercise01.Human;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

public class example6 {
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
        humans.add(new Human("Maria", 23, "female"));
        humans.add((new Human("Petter", 32, "male")));
        humans.add(new Human("Janna", 34, "female"));
        humans.add(new Human("Silvio", 55, "male"));

        Iterator<Human> theHuman = humans.iterator();

        //print a table header
        System.out.println("name\tage\tgender");
        System.out.println("-------------------");

        //print table content
        while (theHuman.hasNext()) {
            Optional<Human> human = Optional.of(theHuman.next());
            boolean isMale = human
                    .flatMap(Human::getGender)
                    .filter(g -> g.equals("male"))
                    .isPresent();

            //print only if male
            if (isMale) {
                //the name is a mandatory parameter
                human.flatMap(Human::getName).ifPresent((String s) ->
                        System.out.print(s + "\t"));
                if (human.flatMap(Human::getName) == null) {
                    System.out.print("No name\t");
                }

                //the age is optional, if no age is present, insert tab
                human.flatMap(Human::getAge).ifPresent((Integer s) ->
                        System.out.print(s +"\t"));
                if (human.flatMap(Human::getAge) == null) {
                    System.out.print("\t");
                }

                //the gender is optional, but since there is no other parameters
                //no need to insert tab
                human.flatMap(Human::getGender).ifPresent((String s) ->
                        System.out.print(s));

                //print out EOL
                System.out.println();
            }
        }
    }
}
