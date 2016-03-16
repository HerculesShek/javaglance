package will.localinner;

import will.staticinner.Speak;

public class ScopeInner {
    private int age = 102;
    private static int num = 9;

    public Speak track(String city) {
        return getSpeak(city, true);
    }

    private static int addTwo(int i) {
        return i + 2;
    }

    private int addOne(int i) {
        return i + 1;
    }


    public static Speak getSpeak(String str, boolean b) {
        if (b) {
            int e = 0;
            final int n = 100;

            class Inner implements Speak {
                private String destination;
                private int e = 32;
                private int j;

                private int addOne(int i) {
                    return i + 100;
                }

                public void printN() {
                    System.out.println(n);
                }

                // public static int roadNum = 43;
                // public static int getNum() {return 44;}

                public Inner(String s) {
                    // e = ScopeInner.this.addOne(e);
                    e = addTwo(e);
                    // System.out.println("age is " + age);
                    System.out.println("num is " + num);
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

        Speak speak2 = ScopeInner.getSpeak("ToLoyo", true);
        speak.speak();
    }
}
