package br.com.fiap;

import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;

public class Praticando2 {
	public static void main(String[] args) {
		
		String dataAtual;
		String dataFinal;
		
		dataAtual = JOptionPane.showInputDialog("Digite a data inicial");
		
		dataFinal = JOptionPane.showInputDialog("Digite a data Final");
		
		LocalDate Atual = LocalDate.parse(dataAtual);
		
		LocalDate A2 = LocalDate.parse(dataFinal);
		
		Period periodo = Period.between(A2, Atual);
		
		JOptionPane.showMessageDialog(null, "Data Atual: " + Atual + "\nData Final: " + A2 + "\nPeriodo: " + periodo.getDays() +"   Dias  " + "" + periodo.getMonths()+"   Meses  " + "" + periodo.getYears()+"  Anos  ");
	}
}
