package comp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Folder extends Component{
    private List<Component> components =new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(tab()+"Folder : "+name);
        for (Component c : components){
            c.print();
        }
    }
    public Component addChild(Component component){
        this.components.add(component);
        component.level = this.level +1;
        return component;

    }
    public List<Component> getChildren(){
        return components;
    }
    public Component getChild(String name){
        Optional<Component> first = components.stream()
                                              .filter(c -> c.name == name)
                                              .findFirst();

        if ( first.isPresent()) return first.get();
        else return null;
    }

}
