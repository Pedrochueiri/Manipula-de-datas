package br.com.fiap;

import javax.swing.JOptionPane;

public class Praticando {
	public static void main(String[] args) {
		String frase;
		
		frase = JOptionPane.showInputDialog("Digite uma Frase");
		JOptionPane.showMessageDialog(null, frase);
		
		int qtChar = frase.length();
		JOptionPane.showMessageDialog(null, qtChar);
		
		String maiuscula = frase.toUpperCase();
		JOptionPane.showMessageDialog(null, maiuscula);
		
		String a1;
		String a2;
		a1 = JOptionPane.showInputDialog("Excreva a palavra que vc quer substituir na frase");
		a2 = JOptionPane.showInputDialog("Excreva a palavra que ira subtituir a palavra da frase");
		String frase2 = frase.replace(a1, a2);
		JOptionPane.showMessageDialog(null, frase2);
		
		int qtChar2 = frase2.length();
		JOptionPane.showMessageDialog(null, qtChar2);
	}
}
