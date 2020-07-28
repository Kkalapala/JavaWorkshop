package ChapterTwentyThree;

public class Member {

    int age;
    String firstName;
    String lastName;
    String title;
    double salary;

    public Member(String fromString) {
        String[] parts = fromString.split(",");

        this.age = Integer.valueOf(parts[0]);
        this.firstName = parts[1];
        this.lastName = parts[2];
        this.title = parts[3];
        this.salary = Double.valueOf(parts[4]);
    }
}
