package guru.springframework.brewery.repository;

import guru.springframework.brewery.domain.Beer;
import guru.springframework.brewery.web.model.BeerStyleEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeerRepository extends JpaRepository<Beer, UUID> {

    Page<Beer> findAllByBeerName(String beerName, PageRequest pageRequest);

    Page<Beer> findAllByBeerStyle(BeerStyleEnum beerStyleEnum, PageRequest pageRequest);

    Page<Beer> findAllByBeerNameAndBeerStyle(String beerName,BeerStyleEnum beerStyleEnum, PageRequest pageRequest);

}
