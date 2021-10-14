package dad.maven.gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {

		Persona p = new Persona();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce tu nombre: ");
		p.setNombre(scanner.nextLine());

		System.out.println("Introduce tu apellido: ");
		p.setApellidos(scanner.nextLine());

		System.out.println("Introduce tu edad: ");
		p.setEdad(scanner.nextInt());

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);

		scanner.close();
	}

}
