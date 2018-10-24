package remessaXml;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class Main {

	public static void main(String[] args) throws ParserConfigurationException, Exception, IOException {
		// Caminho do xml
		File arquivo = new File("C:\\Users\\celso.reis\\Desktop\\Celso\\Java\\Febraban\\remessa.xml");

		//Abrindo documento e tornando legivel
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(arquivo);


		//String com as tags
		String tagBoleto = "br.com.pageseguro.RemessaBoleto";
		String tagCredito = "br.com.pageseguro.RemessaCartaoCredito";
		String tagDebito = "br.com.pageseguro.RemessaCartaoDebito";

		//Contadores
		int contBoletos=0, contCreditos=0, contDebitos=0;

		//Verifica quantos pagamentos de cada tipo existem no xml
		NodeList boletoList = (doc.getElementsByTagName(tagBoleto));
		NodeList creditoList = (doc.getElementsByTagName(tagCredito));
		NodeList debitoList = (doc.getElementsByTagName(tagDebito));

		//Arrays para incluir todos os pagamentos de boletos ou credito ou debito
		ArrayList<String> boletos = new ArrayList<>();
		ArrayList<String> creditos = new ArrayList<>();
		ArrayList<String> debitos = new ArrayList<>();
		ArrayList<String> CpfInvalidos = new ArrayList<>();

		//Inserindo cada tipo de pagamento na Array especifica

		while(contBoletos<boletoList.getLength()) {
			boletos.add(doc.getElementsByTagName(tagBoleto).item(contBoletos).getTextContent());

			contBoletos++;
		}

		while(contCreditos<creditoList.getLength()) {
			creditos.add(doc.getElementsByTagName(tagCredito).item(contCreditos).getTextContent());
			contCreditos++;
		}

		while(contDebitos<debitoList.getLength()) {
			debitos.add(doc.getElementsByTagName(tagDebito).item(contDebitos).getTextContent());
			contDebitos++;
		}


		int i=0, x = contDebitos;

		while(i<x) {
			String [] fatiado = debitos.get(i).split("\n");
			String cpf = fatiado[2].replaceAll("    ","");

			if (ValidaCPF.isCPF(cpf.toString()) == false) {
				CpfInvalidos.add("Debito" + debitos.get(i));
				debitos.remove(i);
				x--;
			}
			i++;
		}


		i=0;
		x=contCreditos;
		while(i<x) {
			String [] fatiado = creditos.get(i).split("\n");
			String cpf = fatiado[2].replaceAll("    ","");

			if (ValidaCPF.isCPF(cpf.toString()) == false) {
				CpfInvalidos.add("Cr�dito" + creditos.get(i));
				creditos.remove(i);
				x--;
			}
			i++;
		}


		i=0;
		x=contBoletos;
		while(i<x) {
			String [] fatiado = boletos.get(i).split("\n");
			String cpf = fatiado[2].replaceAll("    ","");

			if (ValidaCPF.isCPF(cpf.toString()) == false) {
				CpfInvalidos.add("Boleto" + boletos.get(i));
				boletos.remove(i);
				x--;
			}
			i++;
		}
		Scanner scan = new Scanner(System.in);
		String op="";
		
		while(op.equals("0")==false) {

		System.out.println("Selecione a transa��o:\n1.Credito\n2.Debito\n3.Boleto\n4.Cpf Inv�lido\n0.Sair");
		op = scan.nextLine();


		switch (op) {
		case "1":
			TransacoesCredito.exibir(creditos);
			op = scan.nextLine();
			break;
		case "2":
			TransacoesDebito.exibir(debitos);
			op = scan.nextLine();

			break;
		case "3":
			TransacoesBoletos.exibir(boletos);
			op = scan.nextLine();

			break;
		case "4":
			TransacoesCpfInvalidos.exibir(CpfInvalidos);
			op = scan.nextLine();
			break;
		case "0":
			
			break;
		
		default:
			System.out.println("OP��O INVALIDA!");

			break;
		}
		
		}

		scan.close();


	}

}


































