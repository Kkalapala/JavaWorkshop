package ChapterThree;

//inner class: this type of class is declared nested within other classes

class Container {
    //inner class
    private class Continent {
        public void print() {
            System.out.println("This is an inner class.");
        }
    }

    //method to give access to the private inner class' method
    void printContinent() {
        Continent continent = new Continent();
        continent.print();
    }
}
public class example315 {
    public static void main(String[] args) {
        Container container = new Container();
        container.printContinent();
    }
}

