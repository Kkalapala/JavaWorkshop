package ChapterFive;

public class BreakingTheLaw {
   static class MyException extends Exception {

        //constructor
        public MyException() {
            super();
        }

        public MyException(String message) {
            super(message);
        }

        public MyException(String message, Throwable cause) {
            super(message, cause);
        }

        public MyException(Throwable cause) {
            super(cause);
        }
    }

    public static void main() throws MyException {
        String s = null;

        try {
            System.out.println(s.length());
        } catch (NullPointerException ne) {
            throw new MyException("Exception: my exception happened", ne);
        }
    }
}
