package guru.springframework.spring7restmvc.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CustomerRepositoryTest {

    @Autowired
    CustomerRepository customerRepository;

//    @Test
//    void testSaveCustomer() {
//
//        Customer customer = customerRepository.save(Customer.builder()
//                .name("New Name")
//                .build());
//
//        assertThat(customer.getId()).isNotNull();
//    }

    @Test
    void testGetListOfCustomers() {

        long count = customerRepository.count();

        assertThat(count).isEqualTo(3);
    }
}