package test.memberinner;

import will.memberinner.PrivateMemberInner;
import will.staticinner.Speak;

public class PrivateInner {
    public static void main(String[] args) {
        PrivateMemberInner privateStaticInner = new PrivateMemberInner();
        privateStaticInner.setInner("Will");
        Speak inner = privateStaticInner.getInner();
        inner.speak();
    }
}
