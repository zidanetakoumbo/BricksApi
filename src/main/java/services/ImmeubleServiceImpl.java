package services;

import java.util.List;

import org.springframework.stereotype.Service;

import entities.Immeuble;
import repositories.ImmeubleRepository;

@Service
public class ImmeubleServiceImpl implements ImmeubleService {

	private final ImmeubleRepository repository;

	public ImmeubleServiceImpl(ImmeubleRepository repository) {
		this.repository = repository;
	}

	@Override
	public Immeuble save(Immeuble immeuble) {
		return repository.save(immeuble);
	}

	@Override
	public Immeuble getById(Long id) {
		return repository.findById(id).orElseThrow(() -> new RuntimeException("Immeuble non trouvé avec l'id : " + id));
	}

	@Override
	public List<Immeuble> getAll() {
		return repository.findAll();
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}

	@Override
	public Immeuble update(Long id, Immeuble immeuble) {
		// TODO Auto-generated method stub
		return null;
	}
}
