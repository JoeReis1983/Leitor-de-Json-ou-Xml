package remessaXml;

import java.util.ArrayList;

public class TransacoesCpfInvalidos {

	public static void exibir(ArrayList<String> cpfInvalidos) {
		
		int i=0;
		while(i<cpfInvalidos.size()) {
			
			String[]fatiado = cpfInvalidos.get(i).replaceAll("   ", "").split("\n");
			System.out.println("\nTipo: "+fatiado[0]+
							   "\nNome: "+fatiado[1] +
							   "\nCpf:"+fatiado[2]+
							   "\nBanco Recebimento: "+ fatiado[3]+
							   "\nBanco Pagamento: "+fatiado[4]+
							   "\nData: "+fatiado[5]+
							   "\nValor: R$"+fatiado[6]+
							   "\n--------------------------------------\n");
			i++;
		}
		System.out.println("Total de Transa��es com Cpf Invalidos: "+i);
		System.exit(0);
		
	
		
	}

}
