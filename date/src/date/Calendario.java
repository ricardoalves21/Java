package date;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Calendario {

	public static void main(String[] args) {
		
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // instanciando o objeto 'data' do tipo SimpleDateFormat e definindo o formato de apresenta��o dele
		Date d = Date.from(Instant.parse("2021-05-26T15:42:07Z")); // criando a vari�vel 'd' do tipo Date e definindo o formato de apresenta��o dela
		
		System.out.println(data.format(d)); // imprimindo na tela a vari�vel 'd' no formato definido pelo objeto 'data'
		
		Calendar cal = Calendar.getInstance(); // criando a vari�vel 'cal' do tipo 'Calendar'
		cal.setTime(d); // setando a vari�vel 'cal' para o formato de apresenta��o da vari�vel 'd'
		cal.add(Calendar.HOUR_OF_DAY, 4); // acrescentando 4 horas � data definida na vari�vel 'call'
		d = cal.getTime(); // a vari�vel 'd' est� recebendo o tempo (em horas) que foi definido na vari�vel 'cal'
		
		System.out.println(data.format(d)); // imprimindo a vari�vel 'd' no formato estabelecido no objeto 'data'
		
		int minutos = cal.get(Calendar.MINUTE); // criando a vari�vel 'minutos' e fazendo-a receber os minutos da vari�vel 'cal'
		System.out.println("Minutos: " + minutos); // imprimindo a vari�vel 'minutos'
		
		int mes = 1 + cal.get(Calendar.MONTH); // criando a vari�vel 'mes' e fazendo-a receber o m�s da vari�vel 'cal' (foi acrescentado 1 porque o m�s come�a com 0 (zero))
		System.out.println("M�s: " + mes); // imprindo a vari�vel 'mes'
		

	}

}
