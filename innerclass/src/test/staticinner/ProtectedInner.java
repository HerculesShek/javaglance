package test.staticinner;


import will.staticinner.OuterPublicStaticInner;

public class ProtectedInner {
    public static void main(String[] args) {
        OuterPublicStaticInner.Inner inner = new OuterPublicStaticInner.Inner("Will");
        inner.say();
        System.out.println(OuterPublicStaticInner.getA() + " inner class instance(s)");
    }
}
