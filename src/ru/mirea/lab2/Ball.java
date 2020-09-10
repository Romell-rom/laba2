package ru.mirea.lab2;
public class Ball {
    public  String form = "Имеет сферическую форму";
    public  String made = "Изготовлен из синтетики";
    public  int  pressure = 1;
    public int  weight = 450;

    @Override
    public String toString() {
        return "Ball{" +
                "form='" + form + '\'' +
                ", made='" + made + '\'' +
                ", pressure=" + pressure +
                ", weight=" + weight +
                '}';
    }
}
