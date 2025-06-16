package gustavo.franca.sw_planet_api.service;

import static gustavo.franca.sw_planet_api.commom.PlanetConstants.PLANET;
import static org.assertj.core.api.Assertions.assertThat;

import gustavo.franca.sw_planet_api.domain.Planet;
import gustavo.franca.sw_planet_api.services.PlanetService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = PlanetService.class)
public class PlanetServiceTest {
    @Autowired
    private PlanetService planetService;


    @Test
    public void createPlanet_WithValidData_ReturnsPlanet(){
        Planet sut = planetService.create(PLANET);

        assertThat(sut).isEqualTo(PLANET);
    }
}
