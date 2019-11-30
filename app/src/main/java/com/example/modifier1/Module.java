package com.example.modifier1;

public class Module {
    private String EnglishWord;
    private String ArabicWord;
    private int image;

    public Module(String englishWord, String arabicWord, int image) {
        EnglishWord = englishWord;
        ArabicWord = arabicWord;
        this.image = image;
    }

    public Module(String englishWord, String arabicWord) {
        EnglishWord = englishWord;
        ArabicWord = arabicWord;
    }

    public String getEnglishWord() {
        return EnglishWord;
    }

    public void setEnglishWord(String englishWord) {
        EnglishWord = englishWord;
    }

    public String getArabicWord() {
        return ArabicWord;
    }

    public void setArabicWord(String arabicWord) {
        ArabicWord = arabicWord;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
