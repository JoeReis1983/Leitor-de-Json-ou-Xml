package remessaXml;

import java.util.ArrayList;

public class TransacoesBoletos {

	public static void exibir(ArrayList<String> boletos) {
		int i=0;
		while(i<boletos.size()) {
			
			String[]fatiado = boletos.get(i).replaceAll("   ", "").split("\n");
			System.out.println("Nome: "+fatiado[1] +
							   "\nCpf:"+fatiado[2]+
							   "\nBanco Recebimento: "+ fatiado[3]+
							   "\nBanco Pagamento: "+fatiado[4]+
							   "\nData: "+fatiado[5]+
							   "\nValor: R$"+fatiado[6]+
							   "\nBoleto: "+fatiado[7]+
							   "\n--------------------------------------\n");
			i++;
		}
		System.out.println("Total de Transa��es no Boleto: "+i);
		System.exit(0);

	}

}