package remessaJson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class mainJson {

	public static void main(String[] args) throws FileNotFoundException {
		
		File remessajson = new File("C:\\Users\\celso.reis\\Desktop\\Celso\\Java\\remessa.json");
		System.out.println(remessajson.exists());
		Jason.tratar(new FileReader ("C:\\Users\\celso.reis\\Desktop\\Celso\\Java\\remessa.json"));
		
		;

	}
}