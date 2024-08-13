package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		//Instanciando data e hora do momento atual.
		LocalDate date01 = LocalDate.now(); //pega só a data do momento atual.
		LocalDateTime date02 = LocalDateTime.now(); //pega a data e horário LOCAL do momento atual.
		Instant date03 = Instant.now(); //pega a data e horário GLOBAL. Neste caso, horário de Londres.
		
		//Gerando data e hora a partir de um texto ISO 8601.
		LocalDate date04 = LocalDate.parse("2024-08-11"); //gera uma data a partir de um texto no formato ISO 8601.
		LocalDateTime date05 = LocalDateTime.parse("2024-08-11T01:30:55"); //gera uma data e horário a partir de um texto no formato ISO 8601.
		Instant date06 = Instant.parse("2024-06-30T01:29:30Z"); //gera uma data e horário global a partir de um texto no fomrato ISO 8601.
		Instant date07 = Instant.parse("2024-06-30T01:29:30-03:00"); 
		
		// site base: https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		//Gerando data e hora a partir de um formato customizado.
		DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //aqui, estou definindo o formato que a data customizada terá.
		DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate date08 = LocalDate.parse("25/09/2022", fmt01); //1° Parâmetro: texto customizado || 2° Parâmetro: Fomrato que o texto iria ter.
		LocalDateTime date09 = LocalDateTime.parse("25/09/2022 10:00", fmt02); //1° Parâmetro: texto customizado || 2° Parâmetro: Fomrato que o texto iria ter.
		
		
		//Gerando data e hora a partir de dados isolados.
		LocalDate date10 = LocalDate.of(2002, 9, 25);
		LocalDateTime date11 = LocalDateTime.of(2002, 9, 25, 10, 35);
		
		System.out.println(date01);
		System.out.println(date02);
		System.out.println(date03);
		System.out.println(date04);
		System.out.println(date05);
		System.out.println(date06);
		System.out.println(date07);
		System.out.println(date08);
		System.out.println(date09);
		System.out.println(date10);
		System.out.println(date11);
	}

}
