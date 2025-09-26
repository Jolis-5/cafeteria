package fea.cafeteria2.data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoBebidaRepository extends JpaRepository<TipoBebida, Integer>{
}
