package com.company;

//        Class деген класс тузунуз
//        ал класстын номер деген бутун сан сактаган,
//        соз деген соз сактаган жана
//        массив деген сан сактаган массив бар
//        конструктор жазыныз
//        мейн методтон Classтын объектисин тузунуз
//        объекттин полелерине конструктор аркылуу маани бериниз
//        ошол объекттин полелерин консольго чыгарыныз.

public class Class {
    private int number;
    private String word;
    private int array;


    public Class(int number, String word , int array){
        this.number = number;
        this.word = word;
        this.array = array;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getArray() {
        return array;
    }

    public void setArray(int array) {
        this.array = array;
    }
}
