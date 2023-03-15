package Proxy;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    int id;
    String name;
    Student(){

    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
