/*
* Создайте класс Phone, который содержит переменные number, model и weight.
Создайте три экземпляра этого класса.
Выведите на консоль значения их переменных.
Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
Добавить конструктор без параметров.*/
public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        phone1.info();
        phone2.info();
        phone3.info();
        phone1.receiveCall("абонент1");
        phone1.getNumber();
        phone2.receiveCall("абонент2");
        phone2.getNumber();
        phone3.receiveCall("абонент3");
        phone3.getNumber();
    }
}
