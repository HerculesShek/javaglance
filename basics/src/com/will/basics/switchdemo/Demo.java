package com.will.basics.switchdemo;

public class Demo {
    public static void main(String[] args) {
        char c = 'a';
        testSwitch0(c);
        c = 'w';
        testSwitch0(c);

        int i = 9;
        testSwitch1(i);
        i = 0;
        testSwitch1(i);

        MyEnum e = MyEnum.MALE;
        testSwitch2(e);
        e = MyEnum.NEUTRAL;
        testSwitch2(e);

        String s = "Will";
        testSwitch3(s);
        s = "Jack";
        testSwitch3(s);
    }

    public static void testSwitch0(char c) {
        switch (c) {
            case 'w':
                System.out.println("char w is ok");
                break;
            case 'i':
                System.out.println("char i is ok");
                break;
            default:
                System.out.println("other char is no valid");
                break;
        }
    }

    public static void testSwitch1(int i) {
        switch (i) {
            case 8:
                System.out.println("num 8 is ok");
                break;
            case 9:
                System.out.println("num 9 is ok");
                break;
            default:
                System.out.println("other num is not valid ");
                break;
        }
    }


    public static void testSwitch2(MyEnum e) {
        switch (e) {
            case MALE:
                System.out.println("MALE is ok");
                break;
            case FEMALE:
                System.out.println("FEMALE is ok");
                break;
            case NEUTRAL:
            default:
                System.out.println("NEUTRAL is invalid kill them all!");
                break;
        }
    }

    public static void testSwitch3(String s) {
        switch (s) {
            case "Will":
            case "Shek":
                System.out.println("hell " + s);
                break;
            default:
                System.out.println("I don't know who you are!");
                break;
        }
    }
}
