package Third;

import java.util.HashMap;
public class EmployeeData {
    HashMap<String, Employee> data = new HashMap<>();

    public void add(String book, Employee employee) {
        data.put(book, employee);
    }
    public Employee get(String book) {
        return data.get(book);
    }
    public void remove(String book) {
        data.remove(book);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EmployeeData\n");
        for (var key : data.keySet()){
            sb.append("Key: " + key + " | Value: " + data.get(key) + '\n');
        }
        return sb.toString();
    }
}
class Employee{
    private String name;
    private String surname;
    private String post;
    private int age;
    private double averageSalary;

    public Employee(String name, String surname, String post, int age, double averageSalary){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.post = post;
        this.averageSalary = averageSalary;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getPost(){
        return surname;
    }
    public void setPost(String post){
        this.post = post;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public double getAverageSalary(){
        return averageSalary;
    }
    public void setAverageSalary(double averageSalary){
        this.averageSalary = averageSalary;
    }

    @Override
    public String toString() {
        return "Имя: " + name + " Фамилия: " + surname + " Должность: " + post + " Возраст: " + age + " Зарплата: " + averageSalary;
    }
}