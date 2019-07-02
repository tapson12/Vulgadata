package bf.agriculture.VulgaData.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bf.agriculture.VulgaData.entities.Commune;

public interface CommuneRepositiry extends JpaRepository<Commune, Integer> {

}
