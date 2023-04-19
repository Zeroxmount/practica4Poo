/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardshark;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author rojas
 */
public class CardShark {
    
   public Scanner tcn;
   ArrayList<Jugador> jugadores;
   Baraja mazo;
   Baraja mazo2;
   int rondasJugadas=0;
   public CardShark(){
        mazo= new Baraja();
        mazo2=new Baraja();
        jugadores=new ArrayList<>();
        rondasJugadas=0;
        
   }
    
    
    
    public static void main(String[] args){
        Scanner tc=new Scanner(System.in);
        CardShark juego = new CardShark();
        int op;
        do{
        System.out.println("Cuantos jugadores seran (de 2 a 4):");
        op=tc.nextInt();
        }while(op<2&&op>4);
        
        
        juego.repartirCartas(op);
        for (int i = 0; i < 2; i++) {
            juego.jugarRonda();
        }
        
        
    }
    
    public void repartirCartas(int cantJugadores){
    
        
        for (int i = 0; i < cantJugadores; i++) {
            jugadores.add(new Jugador());
        }
        
        if(cantJugadores<3){
            mazo.barajar();
            for (int i = 0; i < cantJugadores; i++) {
                    jugadores.get(i).tomarCartas(mazo.repartir(5));
                    
                    for (int j = 0; j < jugadores.get(i).lanzarDado(); j++) {
                        jugadores.get(i).getMisCartas().add(mazo.darCarta());
                        jugadores.get(i).setNumJugador(i+1);
                    }
            }
        }else{
           mazo.juntarMazo(mazo2);
           mazo.barajar();
           for (int i = 0; i < cantJugadores; i++) {
                    jugadores.get(i).tomarCartas(mazo.repartir(5));
                    for (int j = 0; j < jugadores.get(i).lanzarDado(); j++) {
                        jugadores.get(i).getMisCartas().add(mazo.darCarta());
                        jugadores.get(i).setNumJugador(i+1);
                    }
            }
        }
    }
    
    public void jugarRonda(){
    
        
    // Crear una lista para almacenar las cartas jugadas por cada jugador
    List<Carta> cartasJugadas = new ArrayList<>();
    

    // Cada jugador juega una carta
    for (Jugador jugador : jugadores) {
        Carta carta = jugador.jugarCarta();
        System.out.println("Jugador "+jugador.getNumJugador()+ " juega la carta " + carta.toString());
        cartasJugadas.add(carta);
    }

    // Determinar la carta más alta
    Carta cartaMasAlta = Collections.max(cartasJugadas);
    
    // Contar cuántas veces aparece la carta más alta
    int aparicionesCartaMasAlta = Collections.frequency(cartasJugadas, cartaMasAlta);
    
    // Si solo aparece una vez, hay un ganador claro
    if (aparicionesCartaMasAlta == 1) {
        Jugador ganador = jugadores.get(cartasJugadas.indexOf(cartaMasAlta));
        System.out.println("La carta más alta es " + cartaMasAlta + " jugada por el jugador" + ganador.getNumJugador());
        ganador.setPuntuacion(2);
    } else {
        // Hay empate, se juega otra carta para desempatar
        System.out.println("Hay un empate, se juega otra carta para desempatar");
        jugarRonda();
    }
    
    // Comprobar si algún jugador se quedó sin cartas
    for (Jugador jugador : jugadores) {
        if (jugador.getMisCartas().isEmpty()) {
            int dado = jugador.lanzarDado();
            System.out.println("Jugador "+jugador.getNumJugador()+ " se queda sin cartas y debe sacar " + dado + " cartas del mazo");
            jugador.tomarCartas(mazo.repartir(dado));
            jugador.setPuntuacion(-3);
        }
    }

    // Mostrar los puntos de cada jugador
    System.out.println("Puntos de cada jugador:");
    for (Jugador jugador : jugadores) {
        System.out.println("Jugador "+jugador.getNumJugador()+ ": " + jugador.getPuntuacion());
    }

    // Determinar al ganador o ganadores
    List<Jugador> ganadores = new ArrayList<>();
    int maxPuntos = 0;
    for (Jugador jugador : jugadores) {
        int puntos = jugador.getPuntuacion();
        if (puntos > maxPuntos) {
            maxPuntos = puntos;
            ganadores.clear();
            ganadores.add(jugador);
        } else if (puntos == maxPuntos) {
            ganadores.add(jugador);
        }
    }

    // Mostrar al ganador o ganadores
    System.out.print("El ganador es ");
    if (ganadores.size() == 1) {
        System.out.println("Jugador " + ganadores.get(0).getNumJugador() + " con " + maxPuntos + " puntos");
    } else {
        System.out.print("n ");
        for (Jugador ganador : ganadores) {
            System.out.print("Jugador "+ganador.getNumJugador() + ", ");
        }
        System.out.println("todos con " + maxPuntos + " puntos");
      }   
    } 
}


   
