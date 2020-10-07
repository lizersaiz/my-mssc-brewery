package guru.springframework.mymsscbrewery.domain;

import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;

import guru.springframework.mymsscbrewery.web.model.v2.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {

	private UUID id;
	private String beerName;
	private BeerStyleEnum beerStyle;
	private Long upc;
}