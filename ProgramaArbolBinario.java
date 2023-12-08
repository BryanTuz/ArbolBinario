public class ProgramaArbolBinario {
	
	public static void main(String[] args){

		ArbolBinario arbol = new ArbolBinario("A");
		arbol.agregarHijoIzquierdo("B", arbol.raiz);
		arbol.agregarHijoDerecho("C", arbol.raiz);

		//arbol.preorden();		
	}

}



