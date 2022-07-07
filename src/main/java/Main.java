public class Main {
    public static void main(String[] args) {

        /* lambda expression = 	feature for Java 8 and above
         * 						also known as an anonymous method
         * 						a shorter way to write anonymous classes with only one method
         *
         *						need to use a functional interface or use a pre-defined functional interface
         *						they contain only one abstract method
         *						ex. ActionListener, Runnable, (user-defined)
         *
         *						A Lambda expression can be used in any place where a functional interface is required
         *						How to use a lambda expression:
         *						(arguments) -> {statement/s}
         */

//        MyInterface myInterface = new MyInterface() {
//            @Override
//            public void message() {
//                System.out.println("yo");
//            }
//        };
//
//        myInterface.message();
        String name = "Damian";
        char symbol = '!';

        MyInterface myInterface = (x,y) -> {
            System.out.println("Hi");
            System.out.println("How it's going "+x+y);
        };

        MyInterface myInterface2 = (x,y) -> {
            System.out.println("Hello "+x+y);
        };


        myInterface.message(name,symbol);
        myInterface2.message(name,symbol);

        MyFrame myFrame = new MyFrame();
    }
}
