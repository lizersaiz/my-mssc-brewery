package guru.springframework.mymsscbrewery.web.mappers;

import org.mapstruct.Mapper;

import guru.springframework.mymsscbrewery.domain.Beer;
import guru.springframework.mymsscbrewery.web.model.BeerDto;

@Mapper
public interface BeerMapper {

	BeerDto beerToBeerDto(Beer beer);
	
	Beer beerDtoToBeer(BeerDto beerDto);
}
