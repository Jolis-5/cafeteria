package fea.cafeteria2.data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CatalogoRepsitory extends JpaRepository<Bebida, Integer> {
    // Consulta por tipo de bebida
    List<Bebida> findByIdTipoBebida(Integer idTipoBebida);
}