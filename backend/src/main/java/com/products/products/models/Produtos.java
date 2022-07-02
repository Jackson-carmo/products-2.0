package com.products.products.models;

import java.math.BigDecimal;
import java.util.Objects;

public class Produtos {
	
	private  Long id;
	private String nome;
	private BigDecimal valor;
	private String descricao;
	private String imagem;
	
	private Categoria categoria;

	public Produtos() {
		super();
	}

	public Produtos(Long id, String nome, BigDecimal valor, String descricao, String imagem, Categoria categoria) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.descricao = descricao;
		this.imagem = imagem;
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produtos other = (Produtos) obj;
		return Objects.equals(id, other.id);
	}

	
	
	
}
