package com.kleyton.gerador_de_codigo;

import java.util.Random;

public class Gerador {
	
	public String geradorCodigo() {

		Random indice = new Random();

		String caracteres[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "x", "z", "k", "w", "y", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
				"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6",
				"7", "8", "9" };

		String codigo = "";
		while (codigo.length() != 7) {

			codigo += caracteres[indice.nextInt(62)];
		}

		return codigo;


	}

}
