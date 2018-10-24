package remessaXml;

import java.util.ArrayList;

public class TransacoesCredito {

	public static void exibir(ArrayList<String> creditos) {
		int i=0;
		while(i<creditos.size()) {
			
			String[]fatiado = creditos.get(i).replaceAll("   ", "").split("\n");
			System.out.println("\nNome: "+fatiado[1] +
							   "\nCpf:"+fatiado[2]+
							   "\nBanco Recebimento: "+ fatiado[3]+
							   "\nBanco Pagamento: "+fatiado[4]+
							   "\nData: "+fatiado[5]+
							   "\nValor: R$"+fatiado[6]+
							   "\nNumero do Cart�o: "+fatiado[7]+
							   "\nNome do Titular: "+fatiado[8]+
							   "\nParcelas: "+fatiado[9]+
							   "\n--------------------------------------\n");
			i++;
		}
		System.out.println("Total de Transa��es no Cr�dito: "+i);
		System.exit(0);
		
	}

}
