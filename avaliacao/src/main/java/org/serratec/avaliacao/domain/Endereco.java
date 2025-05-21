package org.serratec.avaliacao.domain;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;


@Embeddable
public class Endereco {
	
	@NotBlank(message = "Rua é obrigatório o preenchimento")
	private String rua;
	
	@NotBlank(message = "Cidade é obrigatório o preenchimento")
	private String cidade;
	
	@NotBlank(message = "Estado é obrigatório o preenchimento")
	private String estado;
	
	@NotBlank(message = "CEP é obrigatório o preenchimento")
	private String cep;

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	

}
