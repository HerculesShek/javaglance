package will.decorator;

public class ConcreteDecorator1 extends Decorator {
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void foo() {
        super.foo();
        bar1();
    }

    private void bar1() {
        System.out.println("bar1");
    }
}
