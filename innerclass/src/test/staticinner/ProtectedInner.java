package test.staticinner;


import will.staticinner.ProtectedStaticInner;

public class ProtectedInner {
    public static void main(String[] args) {
        // ProtectedStaticInner.Inner 是protected修饰的 是包级别的访问权限
        // ProtectedStaticInner.Inner inner = new ProtectedStaticInner.Inner("Will");
        System.out.println(ProtectedStaticInner.getA() + " inner class instance(s)");
    }
}
