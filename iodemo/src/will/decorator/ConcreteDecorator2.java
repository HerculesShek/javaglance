package will.decorator;

public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void foo() {
        super.foo();
        bar2();
    }

    private void bar2() {
        System.out.println("bar2");
    }
}
