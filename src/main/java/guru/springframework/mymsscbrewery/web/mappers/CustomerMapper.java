package guru.springframework.mymsscbrewery.web.mappers;

import org.mapstruct.Mapper;

import guru.springframework.mymsscbrewery.domain.Customer;
import guru.springframework.mymsscbrewery.web.model.CustomerDto;

@Mapper
public interface CustomerMapper {

	CustomerDto customerToCustomerDto(Customer customer);
	
	Customer customerDtoToCustomer(CustomerDto customerDto);
}
