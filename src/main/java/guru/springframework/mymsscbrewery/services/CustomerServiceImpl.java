package guru.springframework.mymsscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.mymsscbrewery.web.model.CustomerDto;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerId(UUID customerId) {
		
		return CustomerDto.builder().id(UUID.randomUUID())
				.name("Martin")
				.build();
	}

	@Override
	public CustomerDto saveNewCustomer(CustomerDto customer) {

		return CustomerDto.builder().id(UUID.randomUUID()).build();
	}

	@Override
	public void updateCustomer(CustomerDto customerDto) {
		// TODO handle update persistence
		
	}

	@Override
	public void deleteCustomer(UUID customerId) {
		// TODO Auto-generated method stub
		
	}
}
