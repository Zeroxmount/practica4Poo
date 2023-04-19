/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardshark;
import java.util.Random;
/**
 *
 * @author rojas
 */
public class Dado {
   
    public static int tirarDado(){
        Random rmd= new Random();
        int caraVisible=rmd.nextInt(5);
        
        return caraVisible;
    }
}
