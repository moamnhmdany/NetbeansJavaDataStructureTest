
package testapp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        children.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        children.remove(component);
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        int size = 0;
        for (FileSystemComponent child : children) {
            size += child.getSize();
        }
        return size;
    }

    public void print() {
        System.out.println("Folder: " + name + ", size: " + getSize());
        for (FileSystemComponent child : children) {
            child.print();
        }
    }
}
