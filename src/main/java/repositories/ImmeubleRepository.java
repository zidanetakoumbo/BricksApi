package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Immeuble;

public interface ImmeubleRepository extends JpaRepository<Immeuble, Long>{

}
