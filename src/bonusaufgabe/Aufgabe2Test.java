package bonusaufgabe;
/**
 * @author Maximilian Kreutz
 * @author Jan Fenau
 */
public class Aufgabe2Test {
	public static void main(String[] args) throws Exception {
		//Gerade2D Test:
		Punkt2D  P1 = new Punkt2D();
		Punkt2D  P2 = new Punkt2D(1,0);
		Punkt2D  P3 = new Punkt2D(1,1);
		Vektor2D v1 = new Vektor2D(1,1);
		Gerade2D G1 = new Gerade2D(P2,v1); 				//allgemeiner Konstruktor für Gerade in Parameterform, wird intern zusätzlich in impliziter Form gespeichert
		Gerade2D G2 = new Gerade2D(); 					//Standardkonstruktor, alle Werte 0
		Gerade2D G3 = new Gerade2D(P2,P3); 				//Gerade aus zwei Punkten
		Gerade2D G4 = new Gerade2D(G3); 				//Kopierkonstruktor
		System.out.println(G1); 						//to-String Methode ( 1.0 , 0.0 ) + s* ( 1.0 , 1.0 )
		System.out.println(G1.getA()); 					//getter für alle Attribute 0.0
		System.out.println(G1.getB()); 					//-0.0
		System.out.println(G1.getC()); 					//-1.0
		System.out.println(G1.getP()); 					//( 1.0 , 0.0 )
		System.out.println(G1.getV()); 					//( 1.0 , 1.0 )
		System.out.println(G1.getAHesseNF()); 			//0.0
		System.out.println(G1.getBHesseNF());			//-0.0
		System.out.println(G1.getCHesseNF()); 			//-0.7071067811865475
		System.out.println(G1.PunktAufGerade(P1));		//Überprüfung ob Punkt P1 auf Gerade G1 liegt false
		System.out.println(G1.dist_p(P1)); 				//gibt Distanz von Punkt P1 zu Gerade G1 zurück 0.7071067811865475
		System.out.println(G1.dist_p(P2)); 				//0.0
		System.out.println(G3.getNormale()); 			//berechnet einen Normalenvektor der Gerade G3 ( 1.0 , -0.0 )
		System.out.println(G4.getNormale()); 			//( 1.0 , -0.0 )
		System.out.println(G2.getV()); 					//getter für die Parameterform ( 0.0 , 0.0 )
		System.out.println(G2.getP()); 					//( 0.0 , 0.0 )
		System.out.println(G3.berechneSchnittpunkt(G1));//Schnittpunkt von G3 und G1 wird berechnet --> Linear unabhängig ( 1.0 , 0.0 )
		System.out.println(G3.berechneSchnittpunkt(G3));
		System.out.println(G3.distOrientated(P1));		//orientierter Abstand von G3 zu P1 -1.0
		System.out.println(G3.dist_p(P1));				//Betrag des Abstand von G3 zu P1 1.0
		System.out.println("\nGerade3D Test:");
		
		//Gerade3D Test:
		Punkt3D gp = new Punkt3D(1, 0, 1);
		Vektor3D gv = new Vektor3D(1,1,-2);
		Gerade3D g = new Gerade3D(gp,gv); 							//Konstruktor aus Punkt gp und Vektor gv
		System.out.println(g); 										//to-String Methode ( 1.0 , 0.0 , 1.0 ) + r* ( 1.0 , 1.0 , -2.0 )
		Punkt3D kp = new Punkt3D(1,0,0);
		Vektor3D kv = new Vektor3D(2,2,-3);
		Gerade3D k = new Gerade3D(kp,kv); 							//zweiter Vektor mit selbem Konstruktor
		System.out.println(k); 										//( 1.0 , 0.0 , 0.0 ) + r* ( 2.0 , 2.0 , -3.0 )
		Gerade3D gg = new Gerade3D(g);
		System.out.println(Gerade3D.berechneSchnittpunkt(g, k)); 	//Schnittpunkt zwischen g und k ( 3.0 , 2.0 , -3.0 ) mit der Lösung des LGS
		System.out.println(Gerade3D.berechneSchnittpunkt(g, gg)); 	//Schnittpunkt zwischen g und gg Linear abhängig! Parallele Geraden
		System.out.println(gg.dist_p(kp)); 							//Betrag des Abstand von Punkt kp zur Gerade gg 0.4472135954999579
		System.out.println(gg.distOrientated(kp)); 					//orientierter Abstand von kp zur Gerade gg -0.4472135954999579
		System.out.println(gg.PunktAufGerade(gp)); 					//Überprüfung ob gp auf der Gerade gg liegt true
	}
}
