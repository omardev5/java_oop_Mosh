package com.codewithmosh;


import javax.swing.table.TableRowSorter;

public class TextBox extends UIControl{
    private String text ="";

    public TextBox(){
        super(true);
        System.out.println("TextBox");
    }

    public String setText(String text){
        return this.text = text;
    }
    public String clear(){
        return text ="";
    }
    @Override
    public String toString(){
        return text;
    }


}