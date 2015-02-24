/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaapp;




public class PilaApp {

    public static void main(String[] args) {
        
        String r = "";
        String t = "";
        String s = "ciao amor ciao";
        Pila p  = new Pila();
        for (int i = 0; i < s.length(); i++) {
        p.push(s.charAt(i));    
        }
        for (int j = 0; j < s.length(); j++) {
        r += p.pop();
        }
        for (int k = 0; k < s.length(); k++) {
            t += r.charAt(k) + " ";
        }
        System.out.println("La stringa inserita è : " + s);
        System.out.println("La stringa rovesciata è : " + r);  
        System.out.println("La stringa rovesciata e spaziata è : " + t);
    }
}
