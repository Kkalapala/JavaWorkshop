package ChapterThree;

//using interfaces

interface ComputerIn {
    public String getDeviceType();
    public String getSpeed();
}

class TabletIn implements ComputerIn {
    public String getDeviceType() {
        return "It is a tablet.";
    }

    public String getSpeed() {
        return "1GHz";
    }
}
public class example314 {
    public static void main(String[] args) {
        TabletIn myTab = new TabletIn();
        System.out.println(myTab.getDeviceType());
        System.out.println(myTab.getSpeed());
    }
}
