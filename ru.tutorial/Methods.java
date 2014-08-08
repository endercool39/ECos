package ru.tutorial;

import javax.swing.JFrame; // Подключаем класс JFrame из библиотеки java

public class Methods {
    public String name; // Можно вызвать везде если унаследовать класс
    private String name2; // Нельзя вызвать 
    protected String name3; // Можно вызвать , если находитесь в пакете с классом у которого наследуете
    /*
    После идефикатора должен идти тип переменной или Имя класса
    */
    public JFrame f;
    private JFrame f2;
    protected JFrame f3; 
    
    public final String NAME = "Значение"; // Правильно
    public final String name222 = ";"; // Неправильно
    public static String nameUser; // статичное поле
    /*
    После типа или класса , вы должны указать имя объекта чтобы обращаться к полю
    */
    public byte nameMethod() // Метод можно будет использовать в другом классе
    {
        return 2+2; // Вернет сумму 2+2
    }
    byte nameMethod2() // Метод нельзя будет унаследовать
    {
        return 2+2; // Вернет сумму 2+2
    }
}
