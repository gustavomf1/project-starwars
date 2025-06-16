package gustavo.franca.sw_planet_api.repositories;

import gustavo.franca.sw_planet_api.domain.Planet;
import org.springframework.data.repository.CrudRepository;

public interface PlanetRepository extends CrudRepository<Planet, Long> {
}
