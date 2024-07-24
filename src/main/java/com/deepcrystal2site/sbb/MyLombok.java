package com.deepcrystal2site.sbb;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class MyLombok {
    private final String hello;
    private final int lombok;

    public static void main(String[] args) {
        MyLombok myLombok = new MyLombok("안녕하세요",5);
        System.out.println(myLombok.getHello());
        System.out.println(myLombok.getLombok());

    }
}
