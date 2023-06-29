package dominio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Motorista_Parceiro implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer id;
	private String CNH;
	private double avaliacao;
	private int dias_de_atividade;

	public Motorista_Parceiro(Integer id, String cNH, double avaliacao, int dias_de_atividade) {
		super();
		this.id = id;
		CNH = cNH;
		this.avaliacao = avaliacao;
		this.dias_de_atividade = dias_de_atividade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCNH() {
		return CNH;
	}

	public void setCNH(String cNH) {
		CNH = cNH;
	}

	public double getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(float avaliacao) {
		this.avaliacao = avaliacao;
	}

	public int getTempo_atividade() {
		return dias_de_atividade;
	}

	public void setTempo_atividade(int tempo_atividade) {
		this.dias_de_atividade = tempo_atividade;
	}

	@Override
	public String toString() {
		return "Motorista_Parceiro [id=" + id + ", CNH=" + CNH + ", avaliacao=" + avaliacao + ", dias_de_atividade="
				+ dias_de_atividade + "]";
	}
}
