package isi.dan.laboratorios.danmscuentacorriente.rest;

import isi.dan.laboratorios.danmscuentacorriente.dtos.requests.PagoRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import isi.dan.laboratorios.danmscuentacorriente.domain.Pago;
import isi.dan.laboratorios.danmscuentacorriente.dtos.PagoDTO;
import isi.dan.laboratorios.danmscuentacorriente.services.PagoService;

@RestController
@RequestMapping(PagoRest.API_PAGO)
@CrossOrigin
@Api(value = "PagoRest", description = "Permite gestionar los pagos")
public class PagoRest {
    static final String API_PAGO = "/api/pago";

    @Autowired
    PagoService pagoService;
    
    private static Integer ID_GEN = 1;

    @GetMapping(path = "/{id}")
    @ApiOperation(value = "Buscar un pago por id")
    public ResponseEntity<Pago> pagoPorId(@PathVariable Integer id){
        return ResponseEntity.of(pagoService.buscarPago(id));
    }

    @GetMapping
    @ApiOperation(value = "Retorna todos los pagos")
    public ResponseEntity<Iterable<Pago>> todos(){
        return ResponseEntity.ok(pagoService.buscarPagos());
    }


    @PostMapping
    @ApiOperation(value = "Da de alta un pago")
    @CrossOrigin
    public ResponseEntity<String> crear(@RequestBody PagoRequestDTO pago){
        System.out.println("Controller:" + pago);
        pagoService.guardarPago(pago);
        return ResponseEntity.ok().body("Pago creado con exito");
    }

    @PutMapping(path = "/{id}")
    @ApiOperation(value = "Actualiza un pago")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Actualizado correctamente"),
        @ApiResponse(code = 401, message = "No autorizado"),
        @ApiResponse(code = 403, message = "Prohibido"),
        @ApiResponse(code = 404, message = "El ID no existe")
    })
    public ResponseEntity<Pago> actualizar(@RequestBody PagoDTO nuevo,  @PathVariable Integer id) {
        return ResponseEntity.of(pagoService.actualizarPago(nuevo, id));
    }

    @DeleteMapping(path = "/{id}")
    @ApiOperation(value = "Elimina un pago")
    public ResponseEntity<Pago> borrar(@PathVariable Integer id){
        pagoService.buscarPago(id);
        return ResponseEntity.ok().build();
    }

    // Estado de cuenta corrientes (retorna pagos por id de cliente)

    @GetMapping(path = "/cliente/{id}")
    @ApiOperation(value = "Buscar un pago por id de cliente")
    public ResponseEntity<Iterable<Pago>> pagoPorClienteId(@PathVariable Integer id){
        return ResponseEntity.ok(pagoService.buscarPagosPorCliente(id));
    }
}