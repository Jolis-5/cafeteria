package fea.cafeteria2.data;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tBebidaIngrediente")

public class BebidaIngrediente {

    @Id
    @Column(name = "idBebidaIngrediente")
    private int idBebidaIngrediente;

    @Column(name = "idBebida")
    private int idBebida;
    private int IdIngrediente;
    private int cantidad;


    public int getIdBebidaIngrediente() {

        return idBebidaIngrediente;
    }

    public void setIdBebidaIngrediente(int idBebidaIngrediente) {

        this.idBebidaIngrediente = idBebidaIngrediente;
    }

    public int getIdBebida() {

        return idBebida;
    }

    public void setIdBebida(int idBebida) {

        this.idBebida = idBebida;
    }

    public int getCantidad() {

        return cantidad;
    }

    public void setCantidad(int cantidad) {

        this.cantidad = cantidad;
    }

}
