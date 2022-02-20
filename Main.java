package esercizio_libri;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		int n_libri=0, numero=0, prezzo=0;
		String nome="", categoria="",dato="";
		Libri li[];
		
		
	    InputStreamReader input = new InputStreamReader(System.in);
	    BufferedReader tastiera= new BufferedReader (input);
		
		try {
			System.out.println("Inserire il numero di libri presi: ");
			dato = tastiera.readLine();
			n_libri = Integer.valueOf(dato).intValue();
		}catch(Exception e) {}
		
		li = new Libri[n_libri];
		
		for(int i=0;i<n_libri;i++) {
			try{
				System.out.println("Inserire il nome del libro n."+(1+i)+" : ");
				nome = tastiera.readLine();
				System.out.println("Inserire il numero del libro n."+(1+i)+" : ");
				dato = tastiera.readLine();
				numero = Integer.valueOf(dato).intValue();
				System.out.println("Inserire la categoria del libro n."+(1+i)+" : ");
				categoria = tastiera.readLine();
				System.out.println("Inserire il prezzo del libro n."+(1+i)+" : ");
				dato = tastiera.readLine();
				prezzo = Integer.valueOf(dato).intValue();
			}catch(Exception e) {}
			li[i] = new Libri(nome,numero,categoria,prezzo);
		}
	
		String tmp_n="",tmp_c="";
		int tmp_num=0,tmp_p=0;
		
		for (int i=0;i<n_libri;i++) {
			for(int j=0;j<n_libri-1-i;j++) {
				if(li[j].prezzo>li[j+1].prezzo) {
					tmp_n = li[j].nome;
					tmp_num = li[j].numero;
					tmp_c = li[j].categoria;
					tmp_p = li[j].prezzo;
					
					li[j].nome = li[j+1].nome;
					li[j].numero = li[j+1].numero;
					li[j].categoria = li[j+1].categoria;
					li[j].prezzo = li[j+1].prezzo;
					
					li[j+1].nome = tmp_n;
					li[j+1].numero = tmp_num;
					li[j+1].categoria = tmp_c;
					li[j+1].prezzo = tmp_p;
				}
			}
		}
		System.out.println("I libri ordinati per prezzo: ");
		for(int i=0;i<n_libri;i++) {
			System.out.println(li[i].nome);
			System.out.println(li[i].numero);
			System.out.println(li[i].categoria);
			System.out.println(li[i].prezzo);
			System.out.println();
		}
		
		
	}

}
