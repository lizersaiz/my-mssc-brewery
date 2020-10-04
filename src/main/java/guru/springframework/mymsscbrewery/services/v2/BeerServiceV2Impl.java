package guru.springframework.mymsscbrewery.services.v2;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.mymsscbrewery.web.model.BeerDto;
import guru.springframework.mymsscbrewery.web.model.CustomerDto;
import guru.springframework.mymsscbrewery.web.model.v2.BeerDtoV2;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BeerServiceV2Impl implements BeerServiceV2 {

	@Override
	public BeerDtoV2 getBeerById(UUID beerId) {

		return null;
	}

	@Override
	public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {

		return null;
	}

	@Override
	public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
		// TODO add a real impl to update beer
	}

	@Override
	public void deleteById(UUID beerId) {

		log.debug("Deleting a beer...");
	}

}
