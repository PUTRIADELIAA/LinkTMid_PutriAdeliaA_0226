/* Nama : Putri Adelia A
* NIM  : 13020210226
*/

package com.mycompany.central0226;

/**
 *
 * @author Putri
 */

interface A {
    public void aaa();
}

interface B extends A {
    public void aaa();
}

class Central0226 implements A,B {
public void aaa(){
System.out.println("aaa");
}
public static void main(String arg[]) {
        Central0226 obj = new Central0226 ();
                System.out.println("main");
                obj.aaa();
  }
  }



