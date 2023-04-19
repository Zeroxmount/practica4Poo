/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardshark;

/**
 *
 * @author rojas
 */
import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
  private ArrayList<Carta> mazo;

  public Baraja() {
    this.mazo = new ArrayList<>();
    inicializa();
  }

  private void inicializa() {
    for (Figura f: Figura.values()) {
      for( int v= 1 ; v <= 13 ; v++) {
        try {
          mazo.add(new Carta(v,f));
        } catch (FueraDeRangoException e) {
          System.out.println(e);
        }
      }
    }
  }

  public void barajar() {
    Collections.shuffle(mazo);
  }

  public ArrayList<Carta> repartir(int n) {
    ArrayList<Carta> mano = new ArrayList<>();
    for(int i=1; i<=n; i++) {
      mano.add(mazo.remove(0));
    }
    return mano;
  }
  
  public Carta darCarta(){
      Carta carta;
      
      carta= mazo.remove(0);
      return carta;
  }
  
  
  public void juntarMazo(Baraja mazoAuxiliar){
      for (int i = 0; i < 52; i++) {
         mazo.add(mazoAuxiliar.darCarta()); 
      }
      
      
      
  }
  

  @Override
  public String toString() {
    StringBuffer mazoStr = new StringBuffer();
    for (Carta c : mazo) {
      mazoStr.append(c.toString()+"\n");
    }
    return mazoStr.toString();
  }


}
