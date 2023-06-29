package dominio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conta implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	private Integer id;
	private String CPF;
	private String email;
	private int saldo;
	
	static void depositar_saldo(double valor, double saldo){
		
	}
	static void atualiza_Saldo(){
		
	}
	
	public Conta(Integer id, String cpf, String email, int saldo) {
		super();
		this.id = id;
		this.CPF = cpf;
		this.email = email;
		this.saldo = saldo;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Conta [CPF=" + CPF + ", email=" + email + "]";
	}
	
	

}
