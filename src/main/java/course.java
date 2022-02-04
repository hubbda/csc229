public class course {
    //variables
    private String id;
    private String name;
    private int code;

    //getters
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getCode() {
        return code;
    }

    //setters
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCode(int code) {
        this.code = code;
    }

    //default constructor
    public course() {
        setId("none");
        setName("none");
        setCode(0);
    }
    //overloaded constructor
    public course(String id, String name, int code) {
        setId(id);
        setName(name);
        setCode(code);
    }

    //print method
    public void print() {
        System.out.println("Id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Code: " + getCode());
    }

    //Main class
    public static void main(String[] args ) {
        course dataAlg = new course("CSC229", "Data Structures and Algorithms", 23260);
        dataAlg.print();
    }
}
