package com.company;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

public class Calc {

    public static void main()
    {
        Scanner in = new Scanner(System.in);
        String form;


        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");

        while (true)
        {
            form = in.nextLine();
            if(form.equals("exit"))
            {
                break;
            }
            else {
                try {
                    Object result = engine.eval(form);
                    System.out.println(result);
                } catch (ScriptException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
