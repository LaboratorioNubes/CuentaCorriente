package danmscuentacorriente.danmscuentacorriente.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import danmscuentacorriente.danmscuentacorriente.domain.Pago;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@RequestMapping(PagoRest.API_PAGO)
@Api(value = "PagoRest", description = "Permite gestionar los pagos")
public class PagoRest {
    static final String API_PAGO = "/api/pago";
    
    private static final List<Pago> listaPagos = new ArrayList<Pago>();
    private static Integer ID_GEN = 1;

    @GetMapping(path = "/{idPago}")
    @ApiOperation(value = "Buscar un pago por id")
    public ResponseEntity<Pago> pagoPorId(@PathVariable Integer idPago){

        Optional<Pago> p =  listaPagos
                .stream()
                .filter(unPago -> unPago.getId().equals(idPago))
                .findFirst();

        return ResponseEntity.of(p);
    }

    @GetMapping
    @ApiOperation(value = "Retorna todos los pagos")
    public ResponseEntity<List<Pago>> todos(){
        return ResponseEntity.ok(listaPagos);
    }

    @PostMapping
    @ApiOperation(value = "Da de alta un pago")
    public ResponseEntity<Pago> crear(@RequestBody Pago nuevo){
    	System.out.println("Crear pago "+ nuevo);
        nuevo.setId(ID_GEN++);
        listaPagos.add(nuevo);
        return ResponseEntity.ok(nuevo);
    }

    @PutMapping(path = "/{idPago}")
    @ApiOperation(value = "Actualiza un pago")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Actualizado correctamente"),
        @ApiResponse(code = 401, message = "No autorizado"),
        @ApiResponse(code = 403, message = "Prohibido"),
        @ApiResponse(code = 404, message = "El ID no existe")
    })
    public ResponseEntity<Pago> actualizar(@RequestBody Pago nuevo,  @PathVariable Integer idPago) {
        OptionalInt indexOpt = IntStream.range(0, listaPagos.size())
        .filter(i -> listaPagos.get(i).getId().equals(idPago))
        .findFirst();

        if(indexOpt.isPresent()){
            listaPagos.set(indexOpt.getAsInt(), nuevo);
            return ResponseEntity.ok(nuevo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(path = "/{idPago}")
    @ApiOperation(value = "Elimina un pago")
    public ResponseEntity<Pago> borrar(@PathVariable Integer idPago){
        OptionalInt indexOpt = IntStream.range(0, listaPagos.size())
        .filter(i -> listaPagos.get(i).getId().equals(idPago))
        .findFirst();

        if(indexOpt.isPresent()){
            listaPagos.remove(indexOpt.getAsInt());
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}