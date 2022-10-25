
public class ExemploWhile {

	public static void main(String[] args) {
		
		double mesada = 50.0;
		
		while(mesada > 0) {
			double valorDoce = 10.0;
			if(valorDoce > mesada)
				valorDoce = mesada;
			System.out.println("valor doce: " + valorDoce + " Adicionado ao carrinho");
			mesada = mesada - valorDoce;
		}
		System.out.println("valor mesada: " + mesada);
	}

}
