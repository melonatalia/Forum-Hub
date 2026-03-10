import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;  // Assumindo que você tem um repositório

    public List<Topico> listar() {
        return topicoRepository.findAll();
    }

    public Optional<Topico> buscarPorId(Long id) {
        return topicoRepository.findById(id);
    }

    public Topico criar(Topico topico) {
        return topicoRepository.save(topico);
    }

    public Topico atualizar(Long id, Topico topico) {
        if (topicoRepository.existsById(id)) {
            topico.setId(id);
            return topicoRepository.save(topico);
        }
        return null;
    }

    public void deletar(Long id) {
        topicoRepository.deleteById(id);
    }
}