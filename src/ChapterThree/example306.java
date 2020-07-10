package ChapterThree;

class ComputerClassA {
    public void WhatIsIt() {
        System.out.println("It is a PC.");
    }
}

class TabletA extends ComputerClassA {
    public void WhatIsIt() {
        System.out.println("It is a tablet.");
    }
}

public class example306 {
    public static void main(String[] args) {
        TabletA myTab = new TabletA();
        myTab.WhatIsIt();
    }
}
