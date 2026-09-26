package forca;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {

		String palavra = "";
		int a = 0; 
		String resposta = "";
		String tentativa = "";
 
		do {
			palavra = JOptionPane.showInputDialog("Insira uma palavra com 5 letras para a forca");
			if (palavra == null) continue;
			
			int tamanho = palavra.length();
			String[] letras = palavra.split("");
 
			if (tamanho != 5) {
				JOptionPane.showMessageDialog(null, "A palavra deve possuir 5 letras");
				resposta = JOptionPane.showInputDialog("Deseja encerrar? N/S");
				if ("S".equalsIgnoreCase(resposta)) {
					continue;
				}
			} 
			else { 
				a = 0;
				
				do {
					tentativa = JOptionPane.showInputDialog("Tente acertar a palavra");
					if (tentativa == null) continue;


					if (tentativa.length() != 5) {
						JOptionPane.showMessageDialog(null, "Sua tentativa deve ter exatamente 5 letras!");
						continue;
					}

					String[] letras_tentativa = tentativa.split("");
 

					if (letras[0].equalsIgnoreCase(letras_tentativa[0])) {
						JOptionPane.showMessageDialog(null, "Palavra errada, mas o (" + letras_tentativa[0] + ") esta no lugar correto");
					}
					if (letras[1].equalsIgnoreCase(letras_tentativa[1])) {
						JOptionPane.showMessageDialog(null, "Palavra errada, mas o (" + letras_tentativa[1] + ") esta no lugar correto");
					}
					if (letras[2].equalsIgnoreCase(letras_tentativa[2])) {
						JOptionPane.showMessageDialog(null, "Palavra errada, mas o (" + letras_tentativa[2] + ") esta no lugar correto");
					}
					if (letras[3].equalsIgnoreCase(letras_tentativa[3])) {
						JOptionPane.showMessageDialog(null, "Palavra errada, mas o (" + letras_tentativa[3] + ") esta no lugar correto");
					}
					if (letras[4].equalsIgnoreCase(letras_tentativa[4])) {
						JOptionPane.showMessageDialog(null, "Palavra errada, mas o (" + letras_tentativa[4] + ") esta no lugar correto");
					}
    
					if ((letras[0].equalsIgnoreCase(letras_tentativa[1])) || (letras[0].equalsIgnoreCase(letras_tentativa[2])) || (letras[0].equalsIgnoreCase(letras_tentativa[3])) || (letras[0].equalsIgnoreCase(letras_tentativa[4]))) {
						JOptionPane.showMessageDialog(null, "Palavra errada, mas o (" + letras_tentativa[0] + ") esta presente na palavra");
					}
					if ((letras[1].equalsIgnoreCase(letras_tentativa[0])) || (letras[1].equalsIgnoreCase(letras_tentativa[2])) || (letras[1].equalsIgnoreCase(letras_tentativa[3])) || (letras[1].equalsIgnoreCase(letras_tentativa[4]))) {
						JOptionPane.showMessageDialog(null, "Palavra errada, mas o (" + letras_tentativa[1] + ") esta presente na palavra");
					}
					if ((letras[2].equalsIgnoreCase(letras_tentativa[0])) || (letras[2].equalsIgnoreCase(letras_tentativa[1])) || (letras[2].equalsIgnoreCase(letras_tentativa[3])) || (letras[2].equalsIgnoreCase(letras_tentativa[4]))) {
						JOptionPane.showMessageDialog(null, "Palavra errada, mas o (" + letras_tentativa[2] + ") esta presente na palavra");
					}
					if ((letras[3].equalsIgnoreCase(letras_tentativa[0])) || (letras[3].equalsIgnoreCase(letras_tentativa[1])) || (letras[3].equalsIgnoreCase(letras_tentativa[2])) || (letras[3].equalsIgnoreCase(letras_tentativa[4]))) {
						JOptionPane.showMessageDialog(null, "Palavra errada, mas o (" + letras_tentativa[3] + ") esta presente na palavra");
					}
					if ((letras[4].equalsIgnoreCase(letras_tentativa[0])) || (letras[4].equalsIgnoreCase(letras_tentativa[1])) || (letras[4].equalsIgnoreCase(letras_tentativa[2])) || (letras[4].equalsIgnoreCase(letras_tentativa[3]))) {
						JOptionPane.showMessageDialog(null, "Palavra errada, mas o (" + letras_tentativa[4] + ") esta presente na palavra");
					}
    

					if (tentativa.equalsIgnoreCase(palavra)) {
						JOptionPane.showMessageDialog(null, "!!!PARABENS!!!");
						JOptionPane.showMessageDialog(null, "Você acertou a palavra correta");
						continue;
					}

					a++;
    

					if (a == 1) {
						JOptionPane.showMessageDialog(null, "O");
					}
					if (a == 2) {
						JOptionPane.showMessageDialog(null, "O\n | ");
					}
					if (a == 3) {
						JOptionPane.showMessageDialog(null, " O\n-|");
					}
					if (a == 4) {
						JOptionPane.showMessageDialog(null, " O\n-|-");
					}
					if (a == 5) {
						JOptionPane.showMessageDialog(null, " O\n-|-\n/");
					}
					if (a == 6) {
						JOptionPane.showMessageDialog(null, " O\n-|-\n/ \\");
					}
    
					if (a == 7) {
						JOptionPane.showMessageDialog(null, "Acabaram as suas tentativas"); 
						JOptionPane.showMessageDialog(null, "Você não acertou a palavra correta, a palavra correta era: " + palavra);   
						continue;
					}
    
				} while (!tentativa.equalsIgnoreCase(palavra) && a < 7);
	
				resposta = JOptionPane.showInputDialog("Deseja encerrar o jogo inteiro? N/S");	
				if ("S".equalsIgnoreCase(resposta)) {
					break;
				}
			} 
		} while (!"S".equalsIgnoreCase(resposta));
	}
}
