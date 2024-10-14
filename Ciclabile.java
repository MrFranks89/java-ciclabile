package it.lessons.foreach;

public class Ciclabile {
		private int [] elenco; //= {1, 2, 5, 7, 19, 39, 99, 124, 15456, 136000};
		private int indiceCorrente;
		private int dimensione;
		
		public Ciclabile(int[] array) {
			this.elenco = array;
			this.dimensione = array.length;
			this.indiceCorrente = 0;
		}
		
		public Ciclabile() {
			this.elenco = new int[0];
			this.dimensione = 0;
			this.indiceCorrente = 0;
		}

		public int getElementoSuccessivo() {
			if (hasAncoraElementi()) {
				int elemento = elenco [indiceCorrente];
				indiceCorrente++;
				return elemento;
			} else {
				return -1;	
			}
			
		}
		public boolean hasAncoraElementi() {
			return indiceCorrente < dimensione;
		}
		
		public void addElemento(int elemento) {
			int [] nuovoElenco = new int [dimensione + 1];
			
			for(int i = 0; i < dimensione; i++) {
				nuovoElenco[i] = elenco[i];
			}
			
			nuovoElenco[dimensione] = elemento;
			
			this.elenco = nuovoElenco;
			
			this.dimensione++;
		}
		
		public void reset() {
			this.indiceCorrente = 0;
		}
		
		public static void main(String[] args) {
			int[] arrayIniziale = {1, 2, 5, 7, 19, 39, 99, 124, 15456, 136000};
			Ciclabile elenco = new Ciclabile(arrayIniziale);
			
			while (elenco.hasAncoraElementi()) {
				System.out.println(elenco.getElementoSuccessivo());
			}
			
			elenco.addElemento(6);
			
			elenco.reset();
			
			while (elenco.hasAncoraElementi()) {
				System.out.println(elenco.getElementoSuccessivo());
			}
		}
}
