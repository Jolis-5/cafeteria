package fea.cafeteria2.data;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tTipoBebida")
public class TipoBebida {

    @Id
    @Column(name = "idTipoBebida")
    private int idTipoBebida;

    @Column(name = "descripcion")
    private String descripcion;

    //Getters and Setters
    public int getIdTipoBebida() {
        return idTipoBebida;
    }

    public void setIdTipoBebida(int idTipoBebida) {
        this.idTipoBebida = idTipoBebida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}