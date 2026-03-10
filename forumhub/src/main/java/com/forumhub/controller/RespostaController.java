import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/respostas")
public class RespostaController {

    @Autowired
    private RespostaService respostaService;

    @PostMapping
    public Resposta criar(@RequestBody Resposta resposta) {
        return respostaService.criarResposta(resposta);
    }
}