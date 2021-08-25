package mongodb.example.dto;

public class PersonDto {
    private int id;
    private String name;
    private int age;
  
    public PersonDto(String name, int age) {
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
