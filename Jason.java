package remessaJson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import com.google.gson.Gson;

public class Jason {
	public static void tratar(FileReader remessa) {

		ArrayList<Transacao> TransacoesCPFInvalido= new ArrayList<Transacao>();
		ArrayList<Transacao> TransacoesCartao= new ArrayList<Transacao>();
		ArrayList<Transacao> TransacoesBoleto= new ArrayList<Transacao>();


		Gson gson = new Gson();
		BufferedReader br = new BufferedReader(remessa);
		Transacao[] objs = gson.fromJson(br, Transacao[].class);
		int i=0;
		while(i<objs.length) {
			if (ValidaCPF.isCPF(objs[i].getCpf().toString()) == true) {
				if( objs[i].getNumeroBoleto() != null) {
					TransacoesCartao.add(objs[i]);				
				}
				else {
					TransacoesBoleto.add(objs[i]);					
				}

			}
			else {
				TransacoesCPFInvalido.add(objs[i]);				
			}
			i++;		
		}
		System.out.println("Invalidos: "+TransacoesCPFInvalido.size());
		System.out.println("Boletos: "+ TransacoesBoleto.size());
		System.out.println("Cartão: "+ TransacoesCartao.size());

	}

}
