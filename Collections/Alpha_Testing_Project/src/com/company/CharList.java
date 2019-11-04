package com.company;

import java.util.*;

public class CharList {

    private ArrayList<Character> charArr;

    public CharList() {
        charArr = new ArrayList<Character>();
    }

    public CharList(String s) {
        charArr = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            charArr.add(s.charAt(i));
        }
    }

    private CharList(ArrayList<Character> list) {
        charArr = new ArrayList<Character>();
        charArr.addAll(list);
    }

    @Override
    public String toString() {
        return this.charArr.toString();
    }

    public int length() {
        return charArr.size();
    }

    public char charAt(int index) {
        if (index < 0 || index > charArr.size() - 1) {
            throw new IndexOutOfBoundsException("Out of range " + index);
        }
        return charArr.get(index);
    }

    public CharList subString(int start, int end) {

        if (start < 0 || end > charArr.size() - 1 || end < start) {
            throw new IllegalArgumentException("start or\\and end arguments wrong ");
        }
        return new CharList(new ArrayList<>(charArr.subList(start, end)));
    }

    public CharList removeDuplicates() {
        return new CharList(new ArrayList<>(new HashSet<>(charArr)));
    }

    public CharList replaceFirst(Character c) {
        if (charArr.size() == 0){
            throw new IndexOutOfBoundsException("CharList is empty!");
        }
        charArr.set(0,c);
        return new CharList(charArr);
    }

    public boolean isITEmpty(){
        return charArr.isEmpty();
    }

    public CharList clearList(){
        charArr.clear();
        return new CharList(charArr);
    }

    public CharList sortList(){
        Collections.sort(charArr);
        return new CharList(charArr);
    }

    public CharList reverseList(){
        Collections.reverse(charArr);
        return new CharList(charArr);
    }

    public CharList mixedList(){
        Collections.shuffle(charArr);
        return new CharList(charArr);
    }
}

