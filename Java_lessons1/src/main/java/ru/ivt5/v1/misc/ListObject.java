package ru.ivt5.v1.misc;

import java.util.InputMismatchException;
import java.util.Arrays;

public class ListObject {
    private int[] array;


    public ListObject(int[] array) {
        this.array = array;
    }


    public ListObject(int size){
        this.array = new int[size];
    }

    public int[] Multiplication(int koeff){
        for(int i=0;i<this.array.length;i++){
            array[i]*=koeff;
        }

        return this.array;
    }

    public int[] Division(int koeff){
        for(int i=0;i<this.array.length;i++){
            this.array[i] = (int)Math.round(this.array[i]/ koeff);
        }

        return this.array;
    }


    public double getItem(int i){
        if (this.array.length >i) {
            return array[i];
        }
        else {
            System.out.println("Вышел за границы");
            return -1;
        }

    }
    public void printItem(int ind){
        if(getItem(ind)==-1)
            System.out.println("Нету такого индекса элемента");
        else System.out.printf("Элемент с индексом %s имеет значение = %s ",ind,getItem(ind));
    }
    public void printArray(){
        for(int i=0;i<this.array.length;i++){
            System.out.printf("%s: %s \n",i,this.array[i]);
        }
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    // Метод для сложения массивов
    public int[] add(ListObject other) {
        if (this.array.length != other.array.length) {
            throw new IllegalArgumentException("Массивы должны быть одинаковой длины для сложения");
        }

        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = this.array[i] + other.array[i];
        }
        return this.array;
    }

    // Метод для вычитания массивов
    public int[] subtract(ListObject other) {
        if (this.array.length != other.array.length) {
            throw new IllegalArgumentException("Массивы должны быть одинаковой длины для вычитания");
        }

        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = this.array[i] - other.array[i];
        }
        return this.array;
    }


}