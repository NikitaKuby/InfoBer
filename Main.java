package com.example.cesar;

public class Main {
    public static void main(String[] args) {

        //Создадим переменные. Объявили их в классе GetText, геттерами вытащили в переменные.
        GetDates st = new GetDates();
        String text = st.getText();

        //Определили алфавит и создали новый на основе ключевого слова
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String lowerText = text.toLowerCase();
        String newAlphabet = st.newAlp(alphabet);

        //Шифруем текс
        lowerText=st.encryptionText(lowerText,newAlphabet);

        //Отслеживаем частоту
        for (int i = 0; i < lowerText.length(); i++) {
            char k = lowerText.charAt(i);
            st.momoGram(k);
        }

        //устанавливаем последовательность
        st.getMono();
        //сортируем по убыванию частоту
        st.sort();
        st.getMass();

        System.out.println(st.dEncryption(lowerText));

    }
}



