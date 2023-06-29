package dominio;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "viagens")
public class Viagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Conta usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "motorista_id")
    private Motorista_Parceiro motorista;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "veiculo_id")
    private Carro veiculo;

    private String dataViagem;

    public Viagem() {
    }

    public Viagem(Conta usuario, Motorista_Parceiro motorista, Carro veiculo, String dateViagem) {
        this.usuario = usuario;
        this.motorista = motorista;
        this.veiculo = veiculo;
        this.dataViagem = dataViagem;
    }

    // Métodos getter e setter

    public int getId() {
        return id;
    }

    public Conta getUsuario() {
        return usuario;
    }

    public void setUsuario(Conta usuario) {
        this.usuario = usuario;
    }

    public Motorista_Parceiro getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista_Parceiro motorista) {
        this.motorista = motorista;
    }

    public Carro getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Carro veiculo) {
        this.veiculo = veiculo;
    }

    public String getDataViagem() {
        return dataViagem;
    }

    public void setDataViagem(String dataViagem) {
        this.dataViagem = dataViagem;
    }
}
