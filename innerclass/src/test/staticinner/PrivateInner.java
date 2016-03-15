package test.staticinner;

import will.staticinner.PrivateStaticInner;
import will.staticinner.Speak;

public class PrivateInner {
    public static void main(String[] args) {
        PrivateStaticInner privateStaticInner = new PrivateStaticInner();
        privateStaticInner.setInner("Will");
        Speak inner = privateStaticInner.getInner();
        inner.speak();
    }
}
