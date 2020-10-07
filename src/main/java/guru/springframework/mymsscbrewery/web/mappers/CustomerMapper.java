package guru.springframework.mymsscbrewery.web.mappers;

import org.mapstruct.Mapper;

import guru.springframework.mymsscbrewery.domain.Customer;
import guru.springframework.mymsscbrewery.web.model.CustomerDto;

//custom type converters by using "uses" property
@Mapper(uses = {DateMapper.class})
public interface CustomerMapper {

	CustomerDto customerToCustomerDto(Customer customer);
	
	Customer customerDtoToCustomer(CustomerDto customerDto);
}
