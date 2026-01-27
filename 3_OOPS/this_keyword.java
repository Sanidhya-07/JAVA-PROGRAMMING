class Human {
    private int age;
    private String name;

    // for name
    public void setName(String name /* Human obj */) {
        // name = name;
        // obj.name = name;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // for age
    public void setAge(int age /* Human obj */ ) {
        // age = age;
        // obj.age = age;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}

public class this_keyword {

    public static void main(String[] args) {
        Human obj1 = new Human();
        
        obj1.setName("Sanidhya");
        obj1.setAge(22);

        System.out.println("Name is : " + obj1.getName());
        System.out.println("Age is : " + obj1.getAge());
    }
}
