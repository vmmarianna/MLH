package com.company;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    //Calc c = new Calc();
    public  static void handler(String comand) throws IOException {


            switch (comand) {
                case "yandex":
                    Runtime.getRuntime().exec("C:\\Users\\maris\\AppData\\Local\\Yandex\\YandexBrowser\\Application\\browser.exe");
                    break;
                case "player":
                    Runtime.getRuntime().exec("C:\\Program Files\\DAUM\\PotPlayer\\PotPlayerMini64.exe");
                    break;
                case "calc":
                    Calc.main();
                    break;
                default:
                    System.out.println(comand + " Not found");
            }

    }



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String command;

        while (true)
        {
            System.out.print("@MLH>");

            command = in.nextLine();

            try {
                handler(command); //обработка команды
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }


}
