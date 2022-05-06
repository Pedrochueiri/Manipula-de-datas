package br.com.fiap;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class FormataData {
	public static void main(String[] args) {
		LocalDate dataAtual = LocalDate.now();
		LocalDate FimDostempos = LocalDate.parse("2012-12-21");
		
		//obetendo o periodo de tempo entre as datas
		Period periodo = Period.between(FimDostempos, dataAtual);
		JOptionPane.showMessageDialog(null, periodo.getYears()+ " Anos");
		JOptionPane.showMessageDialog(null, periodo.getMonths()+ " Meses");
		JOptionPane.showMessageDialog(null, periodo.getDays()+ " Dias");
		
		//formatando a data no padrao dia-mes-ano
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String dateFormatada = FimDostempos.format(dft);
		JOptionPane.showMessageDialog(null, dateFormatada);
	}
}
