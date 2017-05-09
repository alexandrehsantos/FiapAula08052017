package br.com.fiap.decimalBinario;

import java.util.ArrayList;
import java.util.List;

public class Conversor {

	public List<Integer> convert(Integer numeroDecimal) {
		ArrayList<Integer> numero = new ArrayList<>();
		String numeroString = numeroDecimal.toString();

		for (int i = 0; i < numeroString.length(); i++) {
			numero.add(Integer.valueOf(String.valueOf(numeroString.charAt(i))));
		}

		return null;

	}

	public static void main(String[] args) {
		new Conversor().convert(234);

		Integer numero = 234;

		System.out.println(numero.toString().charAt(1));

	}
}
