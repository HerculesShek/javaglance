package will.decorator;

public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void foo() {
        super.foo(); /** 此处一定是调用父类的foo方法 */
        bar2();
    }

    private void bar2() {
        System.out.println("bar2");
    }
}
