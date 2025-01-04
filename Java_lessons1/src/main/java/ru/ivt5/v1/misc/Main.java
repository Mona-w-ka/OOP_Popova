package ru.ivt5.v1.misc;

public class Main {
    public static void main(String[] args){

//        ListObject listObject = new ListObject(new int[10]);
//        int item = listObject.getItem(20);
//        System.out.println(item);
//
//        Rectangle av = new Rectangle(2,4);
        int[] example = {1,2,3,4,5,6};
        int[] example1 = {6,5,4,3,2,1};

        ListObject arr = new ListObject(example);
        ListObject arr1 = new ListObject(example1);

        System.out.printf("Элемент [%s]: %s",2, arr.getItem(2)); //вывод элемента
        System.out.println();

        ListObject arr2 = new ListObject(6); //задаём массивчик
        arr1.printArray();
        System.out.println();


        arr.add(arr1); //Сложение
        System.out.println();
        arr.printArray();

        arr.subtract(arr1); //Вычитание
        System.out.println();
        arr.printArray();
        System.out.println();

        arr.Multiplication(2);//умножение
        arr.printArray();
        System.out.println();

        arr.Division(2);//деление
        arr.printArray();
        System.out.println();

        arr.printItem(3);//выводим по индексу
        System.out.println();
        arr.printItem(8); //проверочка

    }
}
