package ru.geekbrains;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n" + "Вывод объектов:");
        Person person1 = new Person("Alex", "Ivanov", 30);
        Person person2 = new Person("Viktor", "Semenov", 21);
        System.out.println("Person1:  " + person1);
        System.out.println("Person2: " + person2);
        System.out.println("HashCode обьектов");
        System.out.println("HashCode объекта:  " + person1.hashCode());
        System.out.println("HashCode объекта: " + person2.hashCode());
        System.out.println("Equals (сравнение объектов)");
        System.out.println("Равны ли объекты: " + person1.equals(person1));
        System.out.println("Равны ли объекты: " + person1.equals(person2));
        System.out.println("JSON Сериализация и десериализация объектов");
        Gson gson = new GsonBuilder().create();
        String jsonString = gson.toJson(person1);
        System.out.println("JSON Person: " + jsonString);
        Person personN = gson.fromJson(jsonString, Person.class);
        System.out.println("Оригинал:  " + person1);
        System.out.println("из JSON: " + person2);


    }
}
