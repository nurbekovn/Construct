package com.company;

//        мейн методтон Classтын объектисин тузунуз
//        объекттин полелерине конструктор аркылуу маани бериниз
//        ошол объекттин полелерин консольго чыгарыныз.

public class Main {

    public static void main(String[] args) {

        Class clas = new Class(2022,"Saturday", 6);
        System.out.println("Year: "+clas.getNumber());
        System.out.println("Week:   "+clas.getWord());
        System.out.println("Day:  "+clas.getArray());
    }
}
