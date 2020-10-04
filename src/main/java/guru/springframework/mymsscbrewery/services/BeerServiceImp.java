package guru.springframework.mymsscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.mymsscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceImp implements BeerService{

	@Override
	public BeerDto getBeerById(UUID beerId) {

		return BeerDto.builder()
				.id(UUID.randomUUID())
				.beerName("Galaxy Cat")
				.beerStyle("Pale Ale")
				.build();
	}

	@Override
	public BeerDto saveNewBeer(BeerDto beerDto) {

		return BeerDto.builder()
				.id(UUID.randomUUID())
				.build();
	}

	@Override
	public void updateBeer(UUID beerId, BeerDto beerDto) {
		// TODO add a real impl to update beer
	}

	@Override
	public void deleteById(UUID beerId) {

		log.debug("Deleting a beer...");
	}

}
