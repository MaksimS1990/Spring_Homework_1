package ru.geekbrains;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alex", "Ivanov", 30);
        Person person1 = new Person("Viktor", "Semenov", 21);
        System.out.println("Хэшкод объекта: " + person.hashcode());
        System.out.println("Хэшкод объекта: " + person1.hashcode());
        System.out.println("Вывод обьекта: " + person.toString(person));
        System.out.println("Вывод обьекта: " + person1.toString(person1));
        System.out.println("Одинаковы ли объекты: " + person.equals(person1));

        Gson gson = new Gson();
        String file = gson.toJson(person);
        System.out.println("Сериализованный объект: \n" + file.toString());
        Person p = gson.fromJson(file, Person.class);
        System.out.println("Десериализация объекта: \n" + p.toString(p));
    }
}
