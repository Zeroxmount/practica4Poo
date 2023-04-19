/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardshark;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author rojas
 */
public class Jugador{
    private int puntuacion=0, dado, numJugador;
    private ArrayList<Carta> misCartas;
    

    public Jugador() {
        this.puntuacion = 0;
        this.dado = dado;
        this.misCartas = misCartas;
    }
    
    
    public int lanzarDado(){
        Random rnd= new Random();
        dado=rnd.nextInt(5);
        return dado;
    }
    
    
    
    public Carta jugarCarta(){
        
        Scanner tcl= new Scanner(System.in);
        int i;
        do{
            System.out.println("Que carta planea usar");
            mostrarCartas();
            System.out.println("Opcion: ");
            i=tcl.nextInt();
        }while((i-1)<0&&(i-1)>misCartas.size());
        
        
        Carta cartaJugada=misCartas.remove(i-1);
        return cartaJugada;
    }
    
    public void quitarCarta(int i){
        misCartas.remove(i);
    }
    
    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion += puntuacion;
    }

    public ArrayList<Carta> getMisCartas() {
        return misCartas;
    }

    public void tomarCartas(ArrayList<Carta> cartas) {
        
        this.misCartas=cartas;
    }
    
    public void mostrarCartas(){
        
        for(int i = 0; i < misCartas.size(); i++) {
            
            System.out.println((i+1)+"-."+misCartas.get(i).toString());    
        }
    }
    
    
    public int getNumJugador(){
        return numJugador;
    }
    
    public void setNumJugador(int num){
        this.numJugador=num;
    }
    
    
    
    
    
    
   
    
    
    
    
    
    
    
}
