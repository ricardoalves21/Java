package date;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Calendario {

	public static void main(String[] args) {
		
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // instanciando o objeto 'data' do tipo SimpleDateFormat e definindo o formato de apresentação dele
		Date d = Date.from(Instant.parse("2021-05-26T15:42:07Z")); // criando a variável 'd' do tipo Date e definindo o formato de apresentação dela
		
		System.out.println(data.format(d)); // imprimindo na tela a variável 'd' no formato definido pelo objeto 'data'
		
		Calendar cal = Calendar.getInstance(); // criando a variável 'cal' do tipo 'Calendar'
		cal.setTime(d); // setando a variável 'cal' para o formato de apresentação da variável 'd'
		cal.add(Calendar.HOUR_OF_DAY, 4); // acrescentando 4 horas à data definida na variável 'call'
		d = cal.getTime(); // a variável 'd' está recebendo o tempo (em horas) que foi definido na variável 'cal'
		
		System.out.println(data.format(d)); // imprimindo a variável 'd' no formato estabelecido no objeto 'data'
		
		int minutos = cal.get(Calendar.MINUTE); // criando a variável 'minutos' e fazendo-a receber os minutos da variável 'cal'
		System.out.println("Minutos: " + minutos); // imprimindo a variável 'minutos'
		
		int mes = 1 + cal.get(Calendar.MONTH); // criando a variável 'mes' e fazendo-a receber o mês da variável 'cal' (foi acrescentado 1 porque o mês começa com 0 (zero))
		System.out.println("Mês: " + mes); // imprindo a variável 'mes'
		

	}

}
