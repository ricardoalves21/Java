package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Classe {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy"); // criando o objeto 'date1' do tipo 'SimpleDateFormat' e expressando o formato de data que será apresentado "dd/MM/yyy"
		SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // criando o objeto 'date2' do tipo 'SimpleDateFormat' e expressando o formato de data/hora que será apresentado "dd/MM/yyy HH:mm:ss"
		SimpleDateFormat date3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		date3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date(); // declarando a variável 'x1' para apresentar a data atual
		Date x2 = new Date(System.currentTimeMillis()); // outra forma de declarar uma variável para apresentar a data atual
		Date x3 = new Date(0L); // declarando a variável 'x3' para apresentar a data no tempo 0 milissegundos
		Date x4 = new Date(1000L * 60L * 60L * 5L); // declarando a variável 'x4' para apresentar a data no tempo equivalente a 5 horas
		
		Date d1 = date1.parse("25/05/2021"); // criando a variável 'd1' que recebe o objeto 'date1' estabelecendo a forma de apresentação
		Date d2 = date2.parse("25/05/2021 21:08:07"); // criando a variável 'd2' que recebe o objeto 'date2' estabelecendo a forma de apresentação
		Date d3 = Date.from(Instant.parse("2021-05-25T15:42:07Z")); // criando a variável 'd3' que recebe o objeto Date.from (padrão ISO 8601 - UTC) estabelecendo a forma de aprentação
		
		// imprimindo a data no formato local (horário de Brasília/São Paulo)
		System.out.println("-----------------------------------------");
		System.out.println(date2.format(d1)); // imprimindo a variável 'd1' no formato de apresentação do objeto 'date2'
		System.out.println(date2.format(d2)); // imprimindo a variável 'd2' no formato de apresentação do objeto 'date2'
		System.out.println(date2.format(d3)); // imprimindo a variável 'd2' no formato de apresentação do objeto 'date2'		
		System.out.println(date2.format(x1)); // imprimindo a variável 'x1' no formato de apresentação do objeto 'date2'
		System.out.println(date2.format(x2)); // imprimindo a variável 'x2' no formato de apresentação do objeto 'date2'
		System.out.println(date2.format(x3)); // imprimindo a variável 'x3' no formato de apresentação do objeto 'date2'
		System.out.println(date2.format(x4)); // imprimindo a variável 'x4' no formato de apresentação do objeto 'date2'
		
		// imprimindo a data no formato TIME ZONE (horário padrão de Greenwich)
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