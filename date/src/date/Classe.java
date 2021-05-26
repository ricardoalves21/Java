package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Classe {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy"); // criando o objeto 'date1' do tipo 'SimpleDateFormat' e expressando o formato de data que ser� apresentado "dd/MM/yyy"
		SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // criando o objeto 'date2' do tipo 'SimpleDateFormat' e expressando o formato de data/hora que ser� apresentado "dd/MM/yyy HH:mm:ss"
		SimpleDateFormat date3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		date3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date(); // declarando a vari�vel 'x1' para apresentar a data atual
		Date x2 = new Date(System.currentTimeMillis()); // outra forma de declarar uma vari�vel para apresentar a data atual
		Date x3 = new Date(0L); // declarando a vari�vel 'x3' para apresentar a data no tempo 0 milissegundos
		Date x4 = new Date(1000L * 60L * 60L * 5L); // declarando a vari�vel 'x4' para apresentar a data no tempo equivalente a 5 horas
		
		Date d1 = date1.parse("25/05/2021"); // criando a vari�vel 'd1' que recebe o objeto 'date1' estabelecendo a forma de apresenta��o
		Date d2 = date2.parse("25/05/2021 21:08:07"); // criando a vari�vel 'd2' que recebe o objeto 'date2' estabelecendo a forma de apresenta��o
		Date d3 = Date.from(Instant.parse("2021-05-25T15:42:07Z")); // criando a vari�vel 'd3' que recebe o objeto Date.from (padr�o ISO 8601 - UTC) estabelecendo a forma de aprenta��o
		
		// imprimindo a data no formato local (hor�rio de Bras�lia/S�o Paulo)
		System.out.println("-----------------------------------------");
		System.out.println(date2.format(d1)); // imprimindo a vari�vel 'd1' no formato de apresenta��o do objeto 'date2'
		System.out.println(date2.format(d2)); // imprimindo a vari�vel 'd2' no formato de apresenta��o do objeto 'date2'
		System.out.println(date2.format(d3)); // imprimindo a vari�vel 'd2' no formato de apresenta��o do objeto 'date2'		
		System.out.println(date2.format(x1)); // imprimindo a vari�vel 'x1' no formato de apresenta��o do objeto 'date2'
		System.out.println(date2.format(x2)); // imprimindo a vari�vel 'x2' no formato de apresenta��o do objeto 'date2'
		System.out.println(date2.format(x3)); // imprimindo a vari�vel 'x3' no formato de apresenta��o do objeto 'date2'
		System.out.println(date2.format(x4)); // imprimindo a vari�vel 'x4' no formato de apresenta��o do objeto 'date2'
		
		// imprimindo a data no formato TIME ZONE (hor�rio padr�o de Greenwich)
		System.out.println("-----------------------------------------");
		System.out.println(date3.format(d1));
		System.out.println(date3.format(d2));
		System.out.println(date3.format(d3));		
		System.out.println(date3.format(x1));
		System.out.println(date3.format(x2));
		System.out.println(date3.format(x3));
		System.out.println(date3.format(x4));
		
	}
}