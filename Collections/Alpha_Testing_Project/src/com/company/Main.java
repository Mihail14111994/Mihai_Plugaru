package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String word = new String("acb123123");

        CharList listaDeCaractere = new CharList(word);

        System.out.println(listaDeCaractere.length());
        System.out.println(listaDeCaractere.subString(3, 6));
        System.out.println(listaDeCaractere.charAt(1));
        System.out.println(listaDeCaractere.mixedList());
        System.out.println(listaDeCaractere.reverseList());
        System.out.println(listaDeCaractere.sortList());
        System.out.println(listaDeCaractere.replaceFirst('F'));
        System.out.println(listaDeCaractere.removeDuplicates());
        System.out.println(listaDeCaractere.isITEmpty());
        System.out.println(listaDeCaractere.clearList());

    }
}
