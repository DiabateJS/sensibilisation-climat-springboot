package fr.djstechno.sensibilisationclimatspringboot.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.djstechno.sensibilisationclimatspringboot.entities.Option;

@Transactional
public interface OptionRepository extends JpaRepository<Option, Long> {

}
