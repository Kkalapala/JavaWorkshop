package ChapterThree;

//overloading constructors

class AgeA {
    public double a = 0;

    AgeA (double _a) {
        a = _a;
    }
    AgeA (int year, int month) {
        a = year + (double) month / 12;
    }
    public double getAgeA () {
        return a;
    }
}

public class example310 {
    public static void main(String[] args) {
        AgeA age1 = new AgeA(12.5);
        AgeA age2 = new AgeA(9, 3);
        System.out.println(age1.getAgeA());
        System.out.println(age2.getAgeA());
    }
}
