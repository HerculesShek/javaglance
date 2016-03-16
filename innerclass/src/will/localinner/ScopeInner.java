package will.localinner;

import will.staticinner.Speak;

public class ScopeInner {

    public Speak track(String city) {
        return this.getSpeak(city, true);
    }

    public Speak getSpeak(String str, boolean b) {
        if (b) {
            int e = 0;
            final int n = 100;

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
        return null;
    }

    public static void main(String[] args) {
        ScopeInner outer = new ScopeInner();
        Speak speak = outer.track("New York");
        speak.speak();
    }
}
