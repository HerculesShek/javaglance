package will.decorator;

/**
 * 具体的构件角色 其实就是最底层的干活的角色
 */
public class ConcreteComponent extends Component {
    @Override
    public void foo() {
        System.out.println("fun is foo");
    }
}
