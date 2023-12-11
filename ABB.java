public class ABB{   		//Java Beans
	private Nodo raiz;  //null

	ABB(){
		this.raiz = null;
	} 

	public boolean esVacio(){
		return (this.raiz == null); 
	}

	public Nodo regresaRaiz(){   //getRaiz  -- getter de atributo raiz
		return this.raiz;
	}

	public void insertarValor(int valor){
		if (this.raiz == null){
			System.out.println("Insertando raiz: " + valor);
			this.raiz = new Nodo();
			this.raiz.dato = valor;
			this.raiz.izquierdo = null;
			this.raiz.derecho = null;
		}
		else insertarNodo(valor, this.raiz);
	}

	public void insertarNodo(int valor, Nodo nodoRef){
			if (valor <= nodoRef.dato) {
				if (nodoRef.izquierdo == null){
					System.out.println("Insertando hijo izquierdo de: "  + nodoRef.dato + ": " + valor);
					nodoRef.izquierdo =  new Nodo();
					nodoRef.izquierdo.dato = valor;
					nodoRef.izquierdo.izquierdo = null;
					nodoRef.izquierdo.derecho = null;
				}
				else {
					insertarNodo(valor, nodoRef.izquierdo);
				}
			}
			else {
				if (valor > nodoRef.dato) {
					if (nodoRef.derecho == null){
						System.out.println("Insertando hijo derecho de: " + nodoRef.dato + ": " + valor);
						nodoRef.derecho =  new Nodo();
						nodoRef.derecho.dato = valor;
						nodoRef.derecho.izquierdo = null;
						nodoRef.derecho.derecho = null;
					}
					else {
						insertarNodo(valor, nodoRef.derecho);
					}
				}
			}
	}

	//Recorrer el arbol en InOrden
	public void recorridoInOrden(Nodo nodoRef){
		if (nodoRef != null) {
			recorridoInOrden(nodoRef.izquierdo);
			System.out.println(nodoRef.dato + "");
			recorridoInOrden(nodoRef.derecho);
		}
	}

	//Recorre el arbol en PostOrden
	public void recorridoPostOrden(Nodo nodoRef){
		if (nodoRef != null) {
			recorridoPostOrden(nodoRef.izquierdo);
			recorridoPostOrden(nodoRef.derecho);
			System.out.println(nodoRef.dato + "");
		}
	}

	//Recorre el arbol en PreOrden
	public void recorridoPreOrden(Nodo nodoRef){
		if (nodoRef != null) {
			System.out.println(nodoRef.dato + "");
			recorridoPreOrden(nodoRef.izquierdo);
			recorridoPreOrden(nodoRef.derecho);
		}
	}

	public void muestraAcostado(int nivel, Nodo nodoRef){
		if (nodoRef == null){
			return;
		}
		else {
			muestraAcostado(nivel + 1, nodoRef.derecho);

			for (int i=0; i < nivel; i++){
				System.out.print("   ");
			}

			System.out.println(nodoRef.dato);
			muestraAcostado(nivel + 1, nodoRef.izquierdo);
		}
	}
}










