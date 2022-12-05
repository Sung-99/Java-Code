
public class Contador {
	private int valor;
	private int limite;

	//Timer
	public Contador(int limite ) {
		valor = 0;
		this.limite = limite;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}
	
	public void contar() {
		valor++;
		if (valor == limite) {
			valor = 0;
		}
			
	}
	
	
	
	}
