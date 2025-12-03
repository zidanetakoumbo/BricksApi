package services;

import java.util.List;

import entities.Immeuble;

public interface ImmeubleService {

	Immeuble save(Immeuble immeuble);

	Immeuble getById(Long id);

	List<Immeuble> getAll();

	Immeuble update(Long id, Immeuble immeuble);

	void delete(Long id);
}
