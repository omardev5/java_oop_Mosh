package com.codewithmosh;

public class Main2 {

    public static void main(String[] args) {

        var textBox = new TextBox();
        var control = new UIControl(true);
        show(textBox);
    }
    public static void show(UIControl control){
        if(control instanceof  TextBox){
            var textBox =(TextBox)control;
            textBox.setText("Heelo World");
        }
        System.out.println(control);
    }
}
