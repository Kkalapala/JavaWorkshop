package ChapterThree;

//@Override: method in child class is an override of another one in parent class

class ComputerA {
    public void WhatIsIt() {
        System.out.println("It is a PC.");
    }
}

class TabletAB extends ComputerA {
    @Override
    public void WhatIsIt() {
        System.out.println("It is a tablet.");
    }
}
public class example312 {
    public static void main(String[] args) {
        TabletAB myTab = new TabletAB();
        myTab.WhatIsIt();
    }
}
