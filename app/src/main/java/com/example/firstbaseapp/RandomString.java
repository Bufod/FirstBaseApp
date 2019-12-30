package com.example.firstbaseapp;

public enum RandomString {
    ITCUBE("IT-куб лучший!!!", 50),
    FUTURE("От будущего нас отделяет мгновение", 25),
    PAIN("Что ты говоришь:\n" +
            "- Я программист на Java\n" +
            "Что слышат люди:\n" +
            "- Я в любое время могу починить ваш компьютер", 25),
    RECURSION("Чтобы понять рекурсию, нужно сперва понять рекурсию", 25),
    COMPUTER_PROBLEMS("Компьютер позволяет решать все те проблемы," +
            " которые до изобретения компьютера не существовали", 25),
    TRUE_PROG("Начинающий программист считает, что в КИЛОБАЙТЕ 1000 байт," +
            " а опытный что в КИЛОМЕТРЕ 1024 метра", 25),
    TIME_PROG("Программирование — на 10% наука, на 20% изобретательность и на 70% попытка заставить" +
            " изобретательность работать вместе с наукой", 25);

    private String text;
    private int size;

    RandomString(String text, int size) {
        this.text = text;
        this.size = size;
    }

    public String getText() {
        return text;
    }

    public int getSize() {
        return size;
    }
}
