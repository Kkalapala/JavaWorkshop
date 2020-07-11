package ChapterThree;

//avoiding override

class Temperature {
    public double t = 25;
    public double getCelsius () {
        return t;
    }
    // method to convert celsius to fahrenheit
    //this method is final (cannot be overridden)
    final public double getFahrenheit () {
        return t * 9/5 + 32;
    }
}

public class example308 {
    public static void main(String[] args) {
        Temperature temp = new Temperature();
        System.out.println( temp.getCelsius() );
        System.out.println( temp.getFahrenheit() );
    }
}
