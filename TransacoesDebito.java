package remessaXml;

import java.util.ArrayList;

public class TransacoesDebito {

	public static void exibir(ArrayList<String> debitos) {
		int i=0;
		while(i<debitos.size()) {
			
			String[]fatiado = debitos.get(i).replaceAll("   ", "").split("\n");
			System.out.println("\nNome: "+fatiado[1] +
							   "\nCpf:"+fatiado[2]+
							   "\nBanco Recebimento: "+ fatiado[3]+
							   "\nBanco Pagamento: "+fatiado[4]+
							   "\nData: "+fatiado[5]+
							   "\nValor: R$"+fatiado[6]+
							   "\nNumero do Cart�o: "+fatiado[7]+
							   "\nNome do Titular: "+fatiado[8]+						
							   "\n--------------------------------------\n");
			i++;
		}
		System.out.println("Total de Transa��es no D�bitos: "+i);
		System.exit(0);
	
		
	}

}
