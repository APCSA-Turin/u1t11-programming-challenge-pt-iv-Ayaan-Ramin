package com.example.project;
public class StringProblemsRunner{
    
    public static void main(String[] args) {

        StringProblems sp = new StringProblems();
        System.out.println(sp.endsLy("oddly")); 
        System.out.println(sp.endsLy("y")); 
        System.out.println(sp.endsLy("oddy")); 
        System.out.println();

        System.out.println(sp.conCat("abc", "cat")); 
        System.out.println(sp.conCat("dog", "cat")); 
        System.out.println(sp.conCat("abc", "")); 
        System.out.println();

        System.out.println(sp.deFront("Hello")); 
        System.out.println(sp.deFront("java")); 
        System.out.println(sp.deFront("away")); 
        System.out.println(sp.deFront("aapple")); 
        System.out.println(sp.deFront("abee")); 
        System.out.println(sp.deFront("ab")); 
        System.out.println(sp.deFront("a")); 
        System.out.println(sp.deFront("ba")); 
        System.out.println();

        System.out.println(sp.withoutX("xHix")); 
        System.out.println(sp.withoutX("xHi")); 
        System.out.println(sp.withoutX("Hxix")); 
        System.out.println(sp.withoutX("")); 
        System.out.println();

        System.out.println(sp.fizzString("fig")); 
        System.out.println(sp.fizzString("dib")); 
        System.out.println(sp.fizzString("fib")); 
        System.out.println(sp.fizzString("cat")); 
        System.out.println();

        System.out.println(sp.fizzString2(1)); 
        System.out.println(sp.fizzString2(2)); 
        System.out.println(sp.fizzString2(3)); 
        System.out.println(sp.fizzString2(5)); 
        System.out.println(sp.fizzString2(15)); 
    }
}
