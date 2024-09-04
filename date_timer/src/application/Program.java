package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		
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
		
		System.out.println("Date01 = " + date01);
		System.out.println("Date02 = " + date02);
		System.out.println("Date03 = " + date03);
		System.out.println("Date04 = " + date04);
		System.out.println("Date05 = " + date05);
		System.out.println("Date06 = " + date06);
		System.out.println("Date07 = " + date07);
		System.out.println("Date08 = " + date08);
		System.out.println("Date09 = " + date09);
		System.out.println("Date10 = " + date10);
		System.out.println("Date11 = " + date11);
		
		//CONVERTENDO DATA E HORA PARA TEXTO.
		LocalDate date12 = LocalDate.parse("2022-09-25");
		DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDateTime date13 = LocalDateTime.parse("2002-09-25T10:15");
		DateTimeFormatter fmt04 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		Instant date14 = Instant.parse("2022-09-25T01:47:26Z");
		DateTimeFormatter fmt05 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //ZoneId.systemDefault() - pega a data e hora do usuário, automaticamente.
		
		System.out.println("Date12 = " + date12.format(fmt03)); //1° Forma de escrita para formatar somente a data para local um texto.
		System.out.println("Date12 = " + fmt03.format(date12)); //2° Forma de escrita para formatar somente a data para local um texto.
		
		System.out.println("Date13 = " + date13.format(fmt04)); //1° Forma de escrita para formatar somente data e hora local para um texto.
		System.out.println("Date13 = " + fmt04.format(date13)); //2° Forma de escrita para formatar somente data e hora local para um texto.
		
		System.out.println("Date14 = " + fmt05.format(date14)); //Esta é a única forma de converter data e hora para texto, pois o Instant não tem o método .format()
		
		
		//CONVERTENDO DATA E HORA GLOBAL PARA PARA DATA LOCAL.
		Instant date15 = Instant.parse("2002-06-25T01:30:26Z");
		LocalDate r1 = LocalDate.ofInstant(date15, ZoneId.systemDefault()); //pegando uma data global e convertendo para data local do computador do usuário.
		LocalDate r2 = LocalDate.ofInstant(date15, ZoneId.of("Portugal")); //pegando uma data global e convertendo para data local de Portugal.
		
		LocalDateTime r3 = LocalDateTime.ofInstant(date15, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(date15, ZoneId.of("Portugal"));
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		//PEGANDO DADOS ESPECÍFICOS A PARTIR DE UMA DATA E HORARIO LOCAL.
		LocalDateTime date16 = LocalDateTime.parse("2002-09-25T10:30:24");
		
		int day = date16.getDayOfMonth();
		int month = date16.getMonthValue();
		int year = date16.getYear();
		
		int hour = date16.getHour();
		int minutes = date16.getMinute();
		int seconds = date16.getSecond();
		
		System.out.println("date16 (day): " + day);
		System.out.println("date16 (month): " + month);
		System.out.println("date16 (year): " + year);
		System.out.println("date16 (hours): " + hour);
		System.out.println("date16 (minutes): " + minutes);
		System.out.println("date16 (seconds): " + seconds);
		
		//CÁLCULOS COM DATA HORA
		
		//DIMINUINDO E ADICIONANDO TEMPO NA DATA HORA.
		LocalDate date17 = LocalDate.parse("2022-07-20");
		LocalDateTime date18 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant date19 = Instant.parse("2022-07-20T01:30:26Z");

		LocalDate pastWeekDate = date17.minusDays(7);
		LocalDate nextWeekDate = date17.plusDays(7);
		
		System.out.println("Date17 (semana passada) = " + pastWeekDate);
		System.out.println("Date17 (próxima semana) = " + nextWeekDate);
		
		LocalDateTime pastWeekDateTime = date18.minusDays(7);
		LocalDateTime nextWeekDateTime = date18.plusDays(7);
		
		System.out.println("Date18 (semana passada) = " + pastWeekDateTime);
		System.out.println("Date18 (próxima semana) = " + nextWeekDateTime);
		
		Instant pastWeekInstant = date19.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = date19.plus(7, ChronoUnit.DAYS);
		
		System.out.println("Date19 (semana passada) = " + pastWeekInstant);
		System.out.println("Date19 (próxima semana) = " + nextWeekInstant);
		
		//DURATION: CÁLCULO PARA SABER A DURAÇÃO ENTRE DUAS DATA HORAS.
		Duration durationDate17 = Duration.between(pastWeekDate.atStartOfDay(), date17.atStartOfDay());
		Duration durationDate18 = Duration.between(pastWeekDateTime, date18);
		Duration durationDate19 = Duration.between(pastWeekInstant, date19);
		Duration durationDate19Part02 = Duration.between(date19, pastWeekInstant);
		
		System.out.println("date17 (duration) = " + durationDate17.toDays());
		System.out.println("date18 (duration) = " + durationDate18.toDays());
		System.out.println("date19 (duration) = " + durationDate19.toDays());
		System.out.println("date19 (duration) = " + durationDate19Part02.toDays());
		
		//DATE - TRABALHANDO COM DATAS, MODELO ANTIGO USADO ANTES DA VERSÃO 8 DO JAVA.
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		System.out.println("-------------");
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("-------------");
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
		
		//CALENDAR - TRABALHANDO COM DATAS, MODELO ANTIGO USADO ANTES DA VERSÃO 8 DO JAVA.
		//Somando uma unidade de Tempo.
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		//Obtendo uma unidade de tempo.
		SimpleDateFormat sdf02 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d02 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf02.format(d02));
		
		Calendar cal02 = Calendar.getInstance();
		cal02.setTime(d02);
		
		int minutesCalendar = cal02.get(Calendar.MINUTE);
		int monthCalendar = 1 + cal02.get(Calendar.MONTH);
		
		System.out.println("Minutes: " + minutesCalendar);
		System.out.println("Month: " + monthCalendar);
		
		
	}

}