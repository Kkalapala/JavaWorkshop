package ChapterThree;

class ComputerO {
    //variables
    private double cpuSpeed;

    //constructor
    ComputerO() {
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

public class example302 {
    public static void main(String[] args) {
        ComputerO myPc = new ComputerO();
        myPc.setCpuSpeed( 2.5 );
        System.out.println(myPc.getCpuSpeed());
    }
}
