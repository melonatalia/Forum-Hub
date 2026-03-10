import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RespostaService {

    @Autowired
    private RespostaRepository respostaRepository;

    public Resposta criarResposta(Resposta resposta) {
        return respostaRepository.save(resposta);
    }
}