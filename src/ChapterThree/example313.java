package ChapterThree;

//@Deprecated: method is to become obsolete

class ComputerB {
    @Deprecated
    public void WhatIsIt() {
        System.out.println("It is a PC.");
    }
    public void getDeviceType() {
        System.out.println("It is a PC.");
    }

}

@SuppressWarnings("deprecation")
class TabletAC extends ComputerB {
    @Override
    public void WhatIsIt() {
        System.out.println("It is a tablet.");
    }
}

public class example313 {
    public static void main(String[] args) {
        TabletAC myTab = new TabletAC();
        myTab.WhatIsIt();
    }
}
