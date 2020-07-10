package ChapterThree;

class Computer {
    //variables
    double cpuSpeed; //in GHz

    //constructor
    Computer() {
        cpuSpeed = 0;
    }

    //methods
    void setCpuSpeed ( double _cpuSpeed ) {
        cpuSpeed = _cpuSpeed;
    }
    double getCpuSpeed () {
        return cpuSpeed;
    }
}

public class example301 {
    public static void main(String[] args) {
        Computer myPc = new Computer();
        myPc.setCpuSpeed( 2.5 );
        System.out.println(myPc.getCpuSpeed());
    }
}
