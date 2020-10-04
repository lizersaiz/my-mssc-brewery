package guru.springframework.mymsscbrewery.services;

import java.util.UUID;

import guru.springframework.mymsscbrewery.web.model.CustomerDto;

public interface CustomerService {

	CustomerDto getCustomerId(UUID customerId);

	CustomerDto saveNewCustomer(CustomerDto customer);

	void updateCustomer(CustomerDto customerDto);

	void deleteCustomer(UUID customerId);
}
