package will.memberinner;

import will.staticinner.PrivateStaticInner;

public class ProtectedMemberInner {
    private static int a = 0;

    public static int getA() {
        return a;
    }

    /**
     * protected关键词修饰的静态内部类是包级别的访问权限
     */
    protected class Inner {
        // private static int num = 45;
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Inner(String name) {
            a++;
            this.name = name;
        }

        public void say() {
            System.out.println(a + "#\t" + this.getName());
        }
    }

    public static void main(String[] args) {
        ProtectedMemberInner outer = new ProtectedMemberInner();
        ProtectedMemberInner.Inner inner = outer.new Inner("Will");
        inner.say();
    }
}
