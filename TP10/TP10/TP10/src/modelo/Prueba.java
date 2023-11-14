package modelo;

import modelo.DestructorEstelar;
import modelo.Posicion;
import modelo.Faccion;
import modelo.Caza;

public class Prueba {

	public static void main(String[] args) {
		
		Faccion f1 = new Faccion("Red Hot", 0);
		
		Posicion p1 = new Posicion(50, 20);
		
		Faccion f2 =  new Faccion("Guns and Rosses", 0);
		
		Posicion p2 = new Posicion(60, 20);
		
		DestructorEstelar de = new DestructorEstelar("Nave de la Muerte", p1, f1);
		Caza caza = new Caza("Caza de la muerte", p2, f2);
		
		de.atacar(caza);
		System.out.println(caza.getEnergia());
		caza.atacar(de);
		System.out.println(de.getEnergia());
		
		
		
		
		System.out.println(de);
		System.out.println(caza);
		
		
		 
		
	
	}

}