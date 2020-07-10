package ChapterThree;

class ComputerClass {
    //variables
    private double cpuSpeed;

    //constructor
    ComputerClass() {
        cpuSpeed = 0;
    }

    //methods
    void setCpuSpeed (double _cpuSpeed) {
        cpuSpeed = _cpuSpeed;
    }
    double getCpuSpeed () {
        return cpuSpeed;
    }
}

class Tablet extends ComputerClass {
    //variables
    private double screenSize; //in inches

    //methods
    void setScreenSize ( double _screenSize ) {
        screenSize = _screenSize;
    }
    double getScreenSize () {
        return screenSize;
    }
}

public class example305 {
    public static void main(String[] args) {
        Tablet myTab = new Tablet();
        myTab.setCpuSpeed( 2.5 );
        myTab.setScreenSize( 10 );
        System.out.println( myTab.getCpuSpeed() );
        System.out.println( myTab.getScreenSize() );
    }
}
