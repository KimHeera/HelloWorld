package com.example.lab1;

public class Word {
    int id;
    int level;
    String word;
    String meaning;

    Word(){}
    Word(int id, int level, String word, String meaning){

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }



    public int getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public String getWord() {
        return word;
    }

    public String getMeaning() {
        return meaning;
    }

    @Override
    public String toString() {
        String slevel = "";
        for (int i=0 ; i<level ; i++) slevel += "*";

        String str = String.format("%-3s", slevel) + String.format("%15s", word) + "  " + meaning;

        return str;
    }
}
