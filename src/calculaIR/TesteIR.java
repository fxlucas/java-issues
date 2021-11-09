package calculaIR;

public class TesteIR {

	public static void main(String[] args) {

		double salario = 1000.0;
		boolean semDadosDoIR = salario < 1900.0 || salario > 4664.0;

		if (semDadosDoIR) {

			System.out.println("Salário abaixo de R$ 1900.0 é isento do IR.");
			System.out.println("Salário acima de R$ 4664.0 consultar diretamente na Receita Federal");

		} else {
			if (salario >= 1900.0 && salario <= 2800.0) {
				double porcentagemDeducao = 7.5;

				System.out.println("O IR é de " + porcentagemDeducao + "% e pode deduzir o valor de R$"
						+ (salario * porcentagemDeducao) / 100);

			} else if (salario > 2800.0 && salario <= 3751.0) {
				double porcentagemDeducao = 15;

				System.out.println("O IR é de " + porcentagemDeducao + "% e pode deduzir o valor de R$"
						+ (salario * porcentagemDeducao) / 100);

			} else if (salario > 3751.0 && salario <= 4664.0) {
				double porcentagemDeducao = 22.5;

				System.out.println("O IR é de " + porcentagemDeducao + "% e pode deduzir o valor de R$"
						+ (salario * porcentagemDeducao) / 100);
			}
		}
	}
}