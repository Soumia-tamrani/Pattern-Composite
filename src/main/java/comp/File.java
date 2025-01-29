package comp;

public class File extends Component{
    public File(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(tab()+"File => "+name);
    }
}
