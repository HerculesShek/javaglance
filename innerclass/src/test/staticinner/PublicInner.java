package test.staticinner;


import will.staticinner.PublicStaticInner;

public class PublicInner {
    public static void main(String[] args) {
        PublicStaticInner.Inner inner = new PublicStaticInner.Inner("Will");
        inner.say();
        System.out.println(PublicStaticInner.getA() + " inner class instance(s)");
    }
}
