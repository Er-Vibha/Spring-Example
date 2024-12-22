package org.example;

public class Dev {
    private Computer comp;

//private Laptop laptop;
//
//public Dev(Laptop laptop){

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }
//    this.laptop=laptop;
//}
//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    //private int age;
//    public Dev(int age){
//        this.age=age;
//    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }


    public void build(){
        System.out.println("Working on Spring");
//        laptop.compile();
        comp.compile();
    }
}
