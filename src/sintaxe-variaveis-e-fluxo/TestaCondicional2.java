public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 17;
		int quatidadePessoas = 3;
		boolean acompanhado = quatidadePessoas >= 2;

		if (idade >= 18 || acompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente voc� n�o pode entrar");
		}
	}
}