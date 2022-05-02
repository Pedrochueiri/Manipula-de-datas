package br.com.fiap;

import javax.swing.JOptionPane;

public class ComparaString {
	public static void main(String[] args) {
		String senha;
		senha = JOptionPane.showInputDialog("Digite sua senha");
		
		if (senha.equals("Lucas")) {
			JOptionPane.showMessageDialog(null, "Acesso autorizado");
		} else {
			JOptionPane.showMessageDialog(null, "Acesso negado");
		}
		
		if (senha.equalsIgnoreCase("Lucas")) {
			JOptionPane.showMessageDialog(null, "Acesso Concedido");
		} else {
			JOptionPane.showMessageDialog(null, "Acesso impedido");
		}
	}
}

//Usamos o .equals para Utilizar para senha, contando com as letra maiusculas e minusculas.
//usamos o .equalsIgnoreCase para senhas, ignorando as letras maiusculas e minusculas.