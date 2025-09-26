package fea.cafeteria2.presentation;

import fea.cafeteria2.data.Bebida;
import fea.cafeteria2.data.TipoBebida;
import fea.cafeteria2.domain.CatalogoDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalogo")
public class CatalogoController {

    @Autowired
    private CatalogoDomain catalogoDomain;


    @PostMapping("/registrar")
    public String registrar(@RequestBody Bebida bebida, @RequestBody TipoBebida tipoBebida) {
        return catalogoDomain.registrarBebida(bebida, tipoBebida);
    }



    @GetMapping("/bebidas/nombre")
    public List<Bebida> buscarNombre(@RequestParam String nombre) {
        return catalogoDomain.buscarNombre(nombre);
    }



    @GetMapping("/bebidas/tipo")
    public List<Bebida> buscarTipo(@RequestParam int idTipoBebida) {
        return catalogoDomain.buscarTipo(idTipoBebida);
    }
}

