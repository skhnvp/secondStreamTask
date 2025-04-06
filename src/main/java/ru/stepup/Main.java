package ru.stepup;

/*
Перед вами готовый к использованию метод printList(ArrayList<Integer>),
который  все элементы списка по порядку выводит в консоль.

Сейчас метод реализован с использованием оператора for.

Задача: переписать реализацию метода printList(ArrayList<Integer>),
используя метод списка forEach(), принимающий лямбда-выражение.
Логика работы метода остается той же.

Подсказка: нужно использовать лямбда-выражение, передавая его в метод forEach().

public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        printList(Arrays.asList(1,2,3,4,5));
    }

    public static void printList(List<Integer> list) {
        list.forEach(System.out::println); // такой вариант sout предложила идея, заодно почитал про Lambda method reference
    }
}
