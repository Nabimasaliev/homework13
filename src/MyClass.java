import java.util.Arrays;

public class MyClass {
    private String name;
    private String surname;
    private  int age;
    private  String [] courses;
    private String food;

    public MyClass(String name, String surname, int age, String[] courses) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.courses = courses;
    }

    public MyClass(String name, String surname, int age, String food) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.food = food;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", courses=" + Arrays.toString(courses) +
                ", food='" + food + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
