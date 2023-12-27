package ru.geekbrains;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alex", "Ivanov", 30);

        Gson gson = new Gson();

        String file = gson.toJson(person);

        System.out.println("Сериализованный объект: \n" + file);

        Person p = gson.fromJson(file, Person.class);
        System.out.println("Десериализация объекта: \n" + p.toString());


    }
}
