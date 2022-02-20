package verifica;

import java.io.*;

public class Main {
	
	public static String inp_str() {
		String dato="";
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        try {
            dato = kb.readLine();
        } catch (Exception e) {
            System.out.println("Data error.");
        }

        return dato;
	}
	
	public static int inp_int() {
		int dato=0;
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        try {
            dato = Integer.valueOf(kb.readLine()).intValue();
        } catch (Exception e) {
            System.out.println("Data error.");
        }

        return dato;
	}
	
	public static double inp_double() {
		double dato=0.0;
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		try {
			dato = Double.parseDouble(kb.readLine());
		}catch(Exception e) {
			System.out.println("Data error.");
		}
		
		return dato;
	}

	public static void main(String[] args) {
			String dato="";
		    InputStreamReader input = new InputStreamReader(System.in);
		    BufferedReader tastiera = new BufferedReader (input);
		    int variabile=0;

		  try {
			  dato = tastiera.readLine();
			  //c.set_Diametro(Double.parseDouble(dato)); //passa direttamente il double
		      //diametro = Double.parseDouble(dato);//traforma in double
		    
		        } catch(Exception e){
		        System.out.println("errore di inserimento");
		      };

		    variabile = Integer.valueOf(dato).intValue();

		  //  "nome classe" "nome oggetto" = new "nome classe" ();
		  // esempio: Cerchio c = new Cerchio (); --> inizializza con i valori base
		  // c = new Cerchio (raggio, area); --> se è già inizializzato
		    
		  // esempio: Cerchio c = new Cerchio(raggio, area); --> inizializza con valori input

		  //COME USARE LE CLASSI
		  //"nome oggetto"."nome metodo"(parametri se necessario)
		  //"nome oggetto."nome attributo" = 5; --> solo se è PUBLIC
		  //NEL CASO DI UN OGGETTO IN UN VETTORE: nome oggetto[i].metodo/attributo(parametro);
		  
		  //VETTORE DI OGGETTI DI TIPO CLASSE
		  //"nome classe"[] "nome oggetto" = new "nome classe"["dimensione"];

		  //NEL CASO DI ATTRIBUTI PRIVATE
		  // implementare funzioni get e set nella classe
		  //i metodi li richiami normalmente, mentre per stampare valori o inizializzarli devo usare get e set
		  // nome oggetto.setVariabile(variabile);
		  // nome oggetto.getVariabile();

		  //SINTASSI COSTRUTTORI, METODI E ATTRIBUTI
		  // public "nome classe" (parametri a cui cambi i nomi){}
		  // public tipo (void, int, float, double, char) nomeMetodo(eventuali parametri){}
		  // public/private tipo(void, int, float, double, char) attributo
		  
		  }
	}
	


