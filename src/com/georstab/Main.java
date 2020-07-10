package com.georstab;

public class Main {

    public static void main(String[] args) {

        Customer c1 = new Customer("george", "Stabo", 34);
        Customer c2 = new Customer("Antonis", "rapantas", 35);
        Customer c3 = new Customer("Ilias", "xatzopoulos", 33);
        Customer c4 = new Customer("asdasd", "fghhfg", 36);
        Customer c5 = new Customer("kokoko", "kakakaka", 37);
        Customer c6 = new Customer("jhasdfkhjsedf", "ksdjglfkhjsldjhfg", 50);

        ArrayQueue myQue = new ArrayQueue(5);

        myQue.add(c1);
        myQue.add(c2);
        myQue.remove();
        myQue.add(c3);
        myQue.remove();
        myQue.add(c4);
        myQue.remove();
        myQue.add(c5);
        myQue.remove();
        myQue.add(c6);


    }
}