public class UsaABB{
	
	public static void main(String[] args){
		ABB arbol = new ABB();

		Nodo raizArbolABB = arbol.regresaRaiz();
		System.out.println("Nodo raiz: " + arbol.esVacio());
		//25, 8, 29, 38, 27
		arbol.insertarNodo(25, raizArbolABB);
		System.out.println("Nodo raiz: " + arbol.regresaRaiz());
		arbol.insertarNodo(8, arbol.regresaRaiz());
		arbol.insertarNodo(29, arbol.regresaRaiz());
		arbol.insertarNodo(38, arbol.regresaRaiz());
		arbol.insertarNodo(27, arbol.regresaRaiz());
		arbol.muestraAcostado(0, arbol.regresaRaiz());
	}
}