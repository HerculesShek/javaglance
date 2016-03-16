package test.memberinner;

import will.memberinner.PublicInner;

public class PublicMemberInner {
    public static void main(String[] args) {
        PublicInner publicInner = new PublicInner();
        PublicInner.Inner inner = publicInner.new Inner();
        inner.say();
    }
}
