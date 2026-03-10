import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/topicos")
public class TopicoController {

    @Autowired
    private TopicoService topicoService;

    // Rota GET para listar todos os tópicos
    @GetMapping
    public List<Topico> listar() {
        return topicoService.listar();
    }

    // Rota GET para buscar um tópico específico por id
    @GetMapping("/{id}")
    public ResponseEntity<Topico> buscarPorId(@PathVariable Long id) {
        Optional<Topico> topico = topicoService.buscarPorId(id);
        return topico.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Rota POST para criar um novo tópico
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Topico> criar(@RequestBody @Valid Topico topico) {
        Topico criado = topicoService.criar(topico);
        return ResponseEntity.status(HttpStatus.CREATED)
                .header("Location", "/api/topicos/" + criado.getId())
                .body(criado);
    }

    // Rota PUT para atualizar um tópico
    @PutMapping("/{id}")
    public ResponseEntity<Topico> atualizar(@PathVariable Long id, @RequestBody @Valid Topico topico) {
        Topico atualizado = topicoService.atualizar(id, topico);
        return ResponseEntity.ok(atualizado);
    }

    // Rota DELETE para deletar um tópico
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        topicoService.deletar(id);
        return ResponseEntity.noContent().build();  // Retorna um 204 sem conteúdo
    }
}