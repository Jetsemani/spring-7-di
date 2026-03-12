package guru.springframework.spring7restmvc.repositories;

import guru.springframework.spring7restmvc.entities.Beer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BeerRepositoryTest {

    @Autowired
    BeerRepository beerRepository;

//    @Test
//    void testSaveBeer() {
//
//        Beer savedBeer = beerRepository.save(Beer.builder()
//                .beerName("My Beer")
//                .build());
//
//        assertThat(savedBeer).isNotNull();
//        assertThat(savedBeer.getId()).isNotNull();
//    }

    @Test
    void testGetListOfBeers() {

        long count = beerRepository.count();

        assertThat(count).isEqualTo(4);
    }
}