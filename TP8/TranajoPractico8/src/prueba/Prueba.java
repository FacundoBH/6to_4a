package prueba;
import modelo.Arquero;
import modelo.Caballero;
import modelo.Guerrero;
import modelo.Mago;
import personaje.Posicion;



public class Prueba {

	public static void main(String[] args) {
		Arquero a = new Arquero("Martin", new Posicion(120,34));
		Guerrero g = new Guerrero("Lucas", new Posicion(12,54));
		Caballero c = new Caballero("Ariel", new Posicion(18,4));
		Mago m = new Mago("Pedro", new Posicion(155, 4));
		
		System.out.println(a); 
		System.out.println(g);
		System.out.println(c);
		System.out.println(m);
		
		a.ataca(c);
		c.ataca(g);
		g.ataca(c);
		m.ataca(a);
		a.moverse(new Posicion(1742,3));
		
		System.out.println("-----------");
		
		System.out.println(a);
		System.out.println(g);
		System.out.println(c);
		System.out.println(m);
		
		a.recuperarFlechas();
		m.recuperarMagia();
		m.curar(g);
		m.teletransportarse(new Posicion(21,66));
		
		System.out.println("-----------");
		
		System.out.println(a);
		System.out.println(g);
		System.out.println(c);
		System.out.println(m);
	}

}