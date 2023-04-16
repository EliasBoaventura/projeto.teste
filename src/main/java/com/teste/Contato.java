package com.teste;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contato {

	private String id;
	private String nome;
	private String telefone;

	public Contato() {

	}

	public Contato(String id, String nome, String telefone) {

		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
	}

	public boolean isNovo() {
		return id == null;
	}

}