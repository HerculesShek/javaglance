package will.localinner;

import will.staticinner.Speak;

public class MethodInner {
    public Speak getSpeak(String str) {
        final int e = 2;
        int j = 0;
        final int n = 100;
        int m = 33;

        // inner class
        class Inner implements Speak {
            private String destination;
            private int e = 32;
            private int j;

            public void printN() {
                System.out.println(n);
            }

            // public static int roadNum = 43;
            // public static int getNum() {return 44;}

            public Inner(String s) {
                e++;
                this.destination = s;
            }

            @Override
            public void speak() {
                System.out.println("destination is " + destination);
            }
        }
        Inner in = new Inner(str);
        System.out.println(in.e);
        in.printN();
        return in;
    }

    public static void main(String[] args) {
        MethodInner outer = new MethodInner();
        Speak speak = outer.getSpeak("New York");
        speak.speak();
    }
}
