package ru.mirea.lab2;
public class Shape {
    public int k =3;
    public void say (String name){
        System.out.println("This is triangle");
    }

    @Override
    public String toString() {
        return "Shape{" +
                "k=" + k +
                '}';
    }
}
