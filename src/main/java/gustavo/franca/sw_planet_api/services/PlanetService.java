package gustavo.franca.sw_planet_api.services;

import gustavo.franca.sw_planet_api.domain.Planet;
import gustavo.franca.sw_planet_api.repositories.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanetService {

    private PlanetRepository repository;

    public PlanetService(PlanetRepository repository){
        this.repository = repository;
    }

    public Planet create(Planet planet){
        return repository.save(planet);
    }
}
