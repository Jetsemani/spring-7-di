package guru.springframework.spring7restmvc;

import guru.springframework.spring7restmvc.entities.Beer;
import guru.springframework.spring7restmvc.entities.Customer;
import guru.springframework.spring7restmvc.model.BeerStyle;
import guru.springframework.spring7restmvc.repositories.BeerRepository;
import guru.springframework.spring7restmvc.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Component
public class BootstrapData implements CommandLineRunner {

    private final BeerRepository beerRepository;
    private final CustomerRepository customerRepository;

    public BootstrapData(BeerRepository beerRepository, CustomerRepository customerRepository) {
        this.beerRepository = beerRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        //BEERS
        Beer beer1 = Beer.builder()
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyle.PALE_ALE)
                .upc("12356")
                .price(new BigDecimal("12.99"))
                .quantityOnHand(122)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        Beer beer2 = Beer.builder()
                .beerName("Crank")
                .beerStyle(BeerStyle.PALE_ALE)
                .upc("12356222")
                .price(new BigDecimal("11.99"))
                .quantityOnHand(392)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        Beer beer3 = Beer.builder()
                .beerName("Sunshine City")
                .beerStyle(BeerStyle.IPA)
                .upc("12356")
                .price(new BigDecimal("13.99"))
                .quantityOnHand(144)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();



        //CUSTOMERS
        Customer customer1 = Customer.builder()
                .name("Juan García")
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        Customer customer2 = Customer.builder()
                .name("María López")
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        Customer customer3 = Customer.builder()
                .name("Carlos Martínez")
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();


        beerRepository.save(beer1);
        beerRepository.save(beer2);
        beerRepository.save(beer3);

        customerRepository.save(customer1);
        customerRepository.save(customer2);
        customerRepository.save(customer3);

        System.out.println("Cervezas "
                + beer1.getBeerName() + ", "
                + beer2.getBeerName() + ", "
                + beer3.getBeerName()
                + ", y Clientes: "
                + customer1.getName() + ", "
                + customer2.getName() + ", "
                + customer3.getName() + ".");

        System.out.println("Beers en DB: " + beerRepository.count());
        System.out.println("Customers en DB: " + customerRepository.count());



//        MANERA DE GUARDARLOS EN UNA LISTA PARA LUEGO PODER HACER SAVEALL+ITERACION
//        List<Beer> beers = List.of(beer1, beer2, beer3);
//        List<Customer> customers = List.of(customer1, customer2, customer3);
//
//        beerRepository.saveAll(beers);
//        customerRepository.saveAll(customers);
    }
}