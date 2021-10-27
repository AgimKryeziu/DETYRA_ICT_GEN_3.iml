package com.company.oop.ToDo;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoTest {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int menuItem = -1;
        while (menuItem != 0) {
            menuItem = Todo.Menu();
            switch (menuItem) {
                case 1:
                    System.out.println("Shto to do menu");
                    System.out.println("----------------------");
                    System.out.print("Shkruani nje todo: ");
                    String item = reader.nextLine();
                    Todo.ShtoTodo(item);
                    break;
                case 2:
                    Todo.LexoTodo();
                    break;
                case 3:
                    //Todo.EditoTodo();
                case 4:
                    System.out.println("Fshi to do menu");
                    System.out.println("----------------------");
                    Scanner scanner = new Scanner(System.in);
                    Todo.ShtypListenToDo();
                    System.out.print("Todo me cilin numer deshironi ta fshini? : ");
                    int index = scanner.nextInt();
                    Todo.FshijTodo(index);
                    break;
                case 5:
                    Todo.ShtypTeGjithaTodo();
                    break;
                case 6:
                    System.out.print("Jeni te sigurt qe deshironi ta fshini kete todo? shtypni y ose n: ");
                    String pergjigjja = reader.nextLine();
                    Todo.FshijTodoKomplet(pergjigjja);
                    break;
                case 7:
                    System.out.print("Shtypni emrin e Todo qe po e kerkoni: ");
                    String emriTodo = reader.nextLine();
                    System.out.println(Todo.GjejTodoMeEmer(emriTodo));
                    break;
                case 8:
                    Todo.ShfaqTotalTodo();
                    break;
                case 9:
//                    markSelectedToDo();
//                    break;
                case 0:
                    System.out.println("Aplikacioni po mbyllet!");
                    break;
                default:
                    System.out.println("Shkruani nje numer te vlefshem");
            }
        }

    }
}
