package br.com.fiap;



import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Praticando2 {
	public static void main(String[] args) {
		String dataAtual;
		String dataFinal;
		
		dataAtual = JOptionPane.showInputDialog("Digite a data inicial");		
		dataFinal = JOptionPane.showInputDialog("Digite a data Final");
		
		LocalDate Atual = LocalDate.parse(dataAtual);
		LocalDate Final = LocalDate.parse(dataFinal);
		Period periodo = Period.between(Final, Atual);
		
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		dataAtual = Atual.format(dft);
		dataFinal = Final.format(dft);
		String AT = Atual.format(dft);
		String AF = Final.format(dft);

		
		JOptionPane.showMessageDialog(null, "Data Inicial: " + AT  + "\nData Final: " + AF + "\nPeriodo:   " + periodo.getDays() +"  Dias  " + periodo.getMonths()+"   Meses  " + periodo.getYears()+"  Anos  ");
	}
}
