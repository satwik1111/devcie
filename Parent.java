class Parent {
    String name;

    Parent(String name) {
        this.name = name;
    }
    void showname() {
        System.out.println("name of Parent: " + name);
    }
}
class Child extends Parent {
    Child(String name) {
        super(name);
    }
    void showChildname() {
        System.out.println("name of Child: " + name);
        System.out.println("name is:"+name)
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child("john");
        child.showname(); 
        child.showChildname();
    }
}
