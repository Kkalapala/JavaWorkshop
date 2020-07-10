package ChapterThree;

class ComputerClassB {
    public void WhatIsIt() {
        System.out.println("It is a PC.");
    }
}

class TabletB extends ComputerClassB {
    public void WhatIsIt() {
        System.out.println("It is a tablet.");
    }
}

public class example307 {
    public static void main(String[] args) {
        ComputerClassB myTab = new TabletB();
        myTab.WhatIsIt();
    }
}
