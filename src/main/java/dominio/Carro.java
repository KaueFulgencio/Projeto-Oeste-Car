package dominio;

import javax.persistence.*;

@Entity
@Table(name = "carros")
public class Carro {
    @Id
    private String placa;
    private String modelo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Carro() {
    }
    
    public Carro(String placa, String modelo, Categoria categoria) {
        this.placa = placa;
        this.modelo = modelo;
        this.categoria = categoria;
    }

    // Métodos getter e setter

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
