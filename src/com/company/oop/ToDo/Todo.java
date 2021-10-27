package com.company.oop.ToDo;

import com.company.Basic.Array;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Todo {
    private static int counter = 0;
    private int id;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    private boolean isCompleted;

    public Todo(String name) {
        this.id = ++counter;
    }

    public Todo() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void changeStatus() {
        this.isCompleted = !this.isCompleted;
    }

    public void print() {
        System.out.printf("%d - %s (%b)%n", id, name, isCompleted);
    }

    private static List<String> TodoList = new ArrayList<String>();

    public static List<Todo> todoArray = new ArrayList<>();

    public static int Menu() {
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("* Menyja kryesore ");
        System.out.println("-----------------------------------");
        System.out.println("1 - Per te shtuar nje todo");
        System.out.println("2 - Per te lexuar nje todo");
        System.out.println("3 - Per te azhunruar nje todo");
        System.out.println("4 - Per te fshire nje todo");
        System.out.println("5 - Per ti shtypur te gjithen e listen e todos");
        System.out.println("6 - Per te fshire/pastruar komplet todo");
        System.out.println("7 - Per te gjet nje todo ne baze emrit");
        System.out.println("8 - Per te shfaqur numrin total te todove");
        System.out.println("9 - Mark selected todo as completed");
        System.out.println("0 - Per dalje");
        System.out.println("-----------------------------------");
        System.out.println();
        System.out.print("Cilen deshironi? : ");
        Scanner reader = new Scanner(System.in);
        int zgedhja = reader.nextInt();

        return zgedhja;
    }

    public static void ShtoTodo(String item) {
        Todo todoItem = new Todo();
        todoItem.setName(item);
        TodoList.add(item);
        todoArray.add(todoItem);
        todoItem.print();
        System.out.println();
    }

    public static void FshijTodoKomplet(String pergjigjja) {
        if (pergjigjja.equals("y")) {
            System.out.println("Todo lista e juaj eshte fshire me sukses!!");
            TodoList.clear();
        } else {
            System.out.println("Lista juaj eshte: " + todoArray);
            System.out.println("------------------------------------");
        }
    }

    public static void FshijTodo(int index) {
        if ((index - 1) < 0 || index > TodoList.size()) {
            System.out.println("Keni jepur numer gabim shikoni prap " + TodoList.size());
        } else {
            System.out.println("Elementi juaj ne numrin: " + index + " eshte fshire ");
            TodoList.remove(index - 1);

        }
        System.out.println();
    }

    public static void ShtypListenToDo() {
        System.out.println();
        System.out.println("----------------------");
        System.out.println("To-Do List");
        System.out.println("----------------------");
        int number = 0;
        for (String item : TodoList) {
            System.out.println(++number + " " + item);
        }
        System.out.println();
    }


    public static void EditoTodo() {
        System.out.print("Shtypni emrin e Todo-s  qe deshironi ta editoni: ");
        Scanner reader = new Scanner(System.in);
        String emriTodo = reader.nextLine();
        for (String item : TodoList) {
            if (item.equals(emriTodo)) {
                String emriTodo1 = reader.nextLine();
                item.replace(emriTodo, emriTodo1);
            }
        }
        System.out.println();
    }


    public static void ShfaqTotalTodo() {
        System.out.println();
        System.out.println("----------------------");
        System.out.println(" Gjithe totali i todo-ve tuaja eshte: " + TodoList.size());
        System.out.println();
        System.out.println("----------------------");
        System.out.println();
    }

    public static void ShtypTeGjithaTodo() {
        System.out.println();
        System.out.println("----------------------");
        System.out.println("To do lista juaj eshte: ");
        int number = 0;
        for (String item : TodoList) {
            System.out.println(++number + " " + item);
        }
        System.out.println();
    }

    public static String GjejTodoMeEmer(String emriTodo) {
        for (String item : TodoList) {
            if (item.equals(emriTodo)) {
                System.out.println("Po ky emer i todo eshte ketu.");
                return item;
            } else {
                System.out.println("Ky emer nuk ekziston ne TodoList");
            }
        }
        return null;
    }

    public static void LexoTodo() {
        System.out.println();
        System.out.println("----------------------");
        System.out.println("Lexo To-Do");
        System.out.println("----------------------");
        System.out.println("To do lista juaj eshte: ");
        int number = 0;
        for (String item : TodoList) {
            System.out.println(++number + " " + item);
        }
        System.out.println();
    }
}
