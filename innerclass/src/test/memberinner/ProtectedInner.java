package test.memberinner;

import will.memberinner.ProtectedMemberInner;

public class ProtectedInner {
    public static void main(String[] args) {
        ProtectedMemberInner outer = new ProtectedMemberInner();
        // ProtectedMemberInner.Inner inner = outer.new Inner("Will");
        // inner.say();
    }
}
