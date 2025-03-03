/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author YourdreamS
 */
public class no2 {

    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();
        A ref;  // Reference bertipe A

        ref = b;
        ref.callthis();  // Memanggil method dari class B

        ref = c;
        ref.callthis();  // Memanggil method dari class C

        ref = a;
        ref.callthis();  // Memanggil method dari class A
    }
}
class A {

    void callthis() {
        System.out.println("Inside Class A's Method!");
    }
}

class B extends A {

    void callthis() {
        System.out.println("Inside Class B's Method!");
    }
}

class C extends A {

    void callthis() {
        System.out.println("Inside Class C's Method!");
    }
}

