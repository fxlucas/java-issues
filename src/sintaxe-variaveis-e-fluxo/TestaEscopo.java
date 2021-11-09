public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 17;
		int quatidadePessoas = 3;
		
		// boolean acompanhado = quatidadePessoas >= 2;
		
		boolean acompanhado;
		
		if (quatidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		if (idade >= 18 || acompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}
	}
}