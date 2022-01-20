package cl.com.ni;

import java.util.Scanner;

public class tarea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        

        //your code goes here
        System.out.println(timeConverter(days));

    }

    public static int timeConverter(int days) {
        int hours = 24;
        int minute = 60;
        int seconds = 60;
        int result=((days*hours)*minute)*seconds;

        return result;

    }

}
