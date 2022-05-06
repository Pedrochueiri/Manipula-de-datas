package br.com.fiap;

import java.time.LocalDate;
import java.time.Period;


import javax.swing.JOptionPane;

public class Praticando2 {
	public static void main(String[] args) {
		String dataAtual,dataFinal, formatoUSA;
		LocalDate Atual, Final;
		try {
			dataAtual = JOptionPane.showInputDialog("Digite uma data inicial");
			dataFinal = JOptionPane.showInputDialog("Digite uma data Final");
			//0 1 2 3 4 5 6 7 8 9
			//0 8 / 0 1 / 1 9 9 0
			formatoUSA = dataAtual.substring(6, 10);//1990
			formatoUSA += "-" + dataAtual.substring(3, 5);//1990-01
			formatoUSA += "-" + dataAtual.substring(0, 2);//1990-01-08
			Atual = LocalDate.parse(formatoUSA);
			
			formatoUSA = dataFinal.substring(6, 10);//1990
			formatoUSA += "-" + dataFinal.substring(3, 5);//1990-01
			formatoUSA += "-" + dataFinal.substring(0, 2);//1990-01-08
			Final = LocalDate.parse(formatoUSA);
			
			Period periodo = Period.between(Atual, Final);
			
			JOptionPane.showMessageDialog(null, "Data inicial: " + dataAtual + "\nData Final: " + dataFinal + "\nEntre as datas fornecidas existem: " + periodo.getYears() + "  Ano(s) " + periodo.getMonths() + "  Mes(es) " + periodo.getDays() + "  Dia ");
			
		} catch (Exception e) {
		JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}





