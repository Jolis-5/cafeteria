
package fea.cafeteria2.domain;
import fea.cafeteria2.data.Bebida;
import fea.cafeteria2.data.CatalogoRepsitory;
import fea.cafeteria2.data.TipoBebida;
import fea.cafeteria2.data.TipoBebidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatalogoDomain {

    @Autowired
    private CatalogoRepsitory catalogoRepository;

    @Autowired
    private TipoBebidaRepository tipoBebidaRepository;


    public String registrarBebida(Bebida bebida, TipoBebida tipoBebida) {
        Optional<TipoBebida> existente = tipoBebidaRepository.findById(tipoBebida.getIdTipoBebida());

        if (existente.isEmpty()) {
            tipoBebidaRepository.save(tipoBebida);
        }

        catalogoRepository.save(bebida);
        return "Bebida guardada con éxito";
    }

    public List<Bebida> buscarNombre(String nombre) {
        return catalogoRepository.findAll()
                .stream()
                .filter(b -> b.getNombre().equalsIgnoreCase(nombre))
                .toList();
    }

    public List<Bebida> buscarTipo(Integer idTipoBebida) {
        return catalogoRepository.findByIdTipoBebida(idTipoBebida);
    }
}