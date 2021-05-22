package HomeWork5;

// 1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
public class Employee {
   private String fullName;
   private String position;
   private String phone;
   private double salary;
   private int age;
   private int id;

    private static int idCounter = 0;

// 2 Конструктор класса должен заполнять эти поля при создании объекта;
Employee(String fullName, String position, String phone, double salary,
         int age) {
    this.fullName = fullName;
    this.position = position;
    this.phone = phone;
    this.salary = salary;
    this.age = age;
// 7** При создании экземпляра класса Сотрудник присваивать ему уникальный порядковый номер.
    this.id = ++idCounter;
}
// 3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
String getFullName(){
    return fullName;
}
String getPosition(){
    return position;
}
String getPhone(){
    return phone;
}
double getSalary(){
    return salary;
}
void setSalary(){
    this.salary = salary;
}
int getAge(){
    return age;
}
String getInfo() {
 return this.id + " | " + this.fullName + " | " +
  this.position + " | Номер телефона: " +
  this.phone + " | Зарплата: " +
  this.getSalary() + " руб. "; }





}
