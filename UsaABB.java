public class UsaABB{
	
	public static void main(String[] args){
		ABB arbol = new ABB();

		Nodo raizArbolABB = arbol.regresaRaiz();
		
		//25, 8, 29, 38, 27
		arbol.insertarValor(25);
		arbol.insertarValor(8);
		arbol.insertarValor(29);
		arbol.insertarValor(38);
		arbol.insertarValor(27);

		System.out.println("Nodo raiz: " + arbol.regresaRaiz().dato);
		arbol.muestraAcostado(0, arbol.regresaRaiz());

		System.out.println("Recorrido del arbol en InOrden");
		arbol.recorridoInOrden(arbol.regresaRaiz());

		System.out.println("Recorrido del arbol en PostOrden");
		arbol.recorridoPostOrden(arbol.regresaRaiz());

		System.out.println("Recorrido del arbol en PreOrden");
		arbol.recorridoPreOrden(arbol.regresaRaiz());
	}
}