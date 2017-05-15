package com.work.web;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        /*EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        AccountServiceImpl accountService = new AccountServiceImpl();
        VacancyServiceImpl vacancyService = new VacancyServiceImpl();*/
    }
}



class Main {
    public static void main(String... args) {
        Integer i1 = 126;
        Integer i2 = 126;
        for (int i=0; i<3; i++)
        {
            System.out.println(i1++==i2++);
            System.out.println(i1.equals(i2));
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }

    public static float getChar() {
        return 'g';
    }

    String $4 = new String("fe");
}

class Tebr {
    static int a= 5;
    public static void main(String a[]) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(null);
        for (Integer i : list) {
            System.out.println(i);
        }
    }


    /*public static void main(String[] args) {
        String s = "-";
        Integer x = 343;
        long L343 = 343L;

        if (x.equals(L343)) s += ".e1 ";
        if (x.equals(343)) s += ".e2 ";

        Short s1 = (short)((new Short((short)343)) / (new Short((short)49)));
        if (s1 == 7) s += "=s ";
        if (s1 < new Integer(7+1)) s += "fly ";

        System.out.println(s);
    }*/
}


class A {
    public void process() { System.out.print("A,"); }
}

/*class B extends A {
    public void process() throws IOException {
        super.process();
        System.out.print("B,");
        throw new IOException();
    }

    public static void main(String[] args) {
        try { new B().process(); }
        catch (IOException e) { System.out.println("Exception"); }
    }
}*/