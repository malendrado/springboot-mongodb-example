package mongodb.example.entity;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "persons")
public class PersonEntity {
    @Id
    private int id;
    private String name;
    private int age;
  
    public PersonEntity(String name, int age) {
      this.name = name;
      this.age = age;
    }
  
    public int getId() {
      return id;
    }
    public String getName() {
      return name;
    }
    public int getAge() {
      return age;
    }
  
    @Override
    public String toString() {
      return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}
