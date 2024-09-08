package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if(partRepository.count() == 0) {

            //Set single items
            Part beefJerky = new InhousePart();
            beefJerky.setName("Beef Jerky");
            beefJerky.setInv(10);
            beefJerky.setPrice(15);
            beefJerky.setId(5);
            beefJerky.setMinInv(1);
            beefJerky.setMaxInv(100);

            //Save to part repository
            partRepository.save(beefJerky);

            Part oreos = new InhousePart();
            oreos.setName("Oreos");
            oreos.setInv(12);
            oreos.setPrice(2);
            oreos.setId(6);
            oreos.setMinInv(1);
            oreos.setMaxInv(100);

            partRepository.save(oreos);

            Part nutterButters = new InhousePart();
            nutterButters.setName("Nutter Butters");
            nutterButters.setInv(15);
            nutterButters.setPrice(3);
            nutterButters.setId(7);
            nutterButters.setMinInv(1);
            nutterButters.setMaxInv(100);

            partRepository.save(nutterButters);

            Part riceKrispies = new InhousePart();
            riceKrispies.setName("Peanut Butter Rice Krispies");
            riceKrispies.setInv(20);
            riceKrispies.setPrice(4);
            riceKrispies.setId(8);
            riceKrispies.setMinInv(1);
            riceKrispies.setMaxInv(100);

            partRepository.save(riceKrispies);

            Part puppyChow = new InhousePart();
            puppyChow.setName("Puppy Chow");
            puppyChow.setInv(10);
            puppyChow.setPrice(6);
            puppyChow.setId(9);
            puppyChow.setMinInv(1);
            puppyChow.setMaxInv(100);

            partRepository.save(puppyChow);
        }

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        if(productRepository.count() == 0) {

            //Set bundle items
            Product jerkyBundle = new Product();
            jerkyBundle.setName("Jerky Bundle");
            jerkyBundle.setInv(12);
            jerkyBundle.setPrice(25);
            jerkyBundle.setId(0);

            //Save to product repository
            productRepository.save(jerkyBundle);

            Product cookieBundle = new Product();
            cookieBundle.setName("Cookie Bundle");
            cookieBundle.setInv(12);
            cookieBundle.setPrice(15);
            cookieBundle.setId(1);

            productRepository.save(cookieBundle);

            Product sourCandy = new Product();
            sourCandy.setName("Sour Candy Bundle");
            sourCandy.setInv(15);
            sourCandy.setPrice(10);
            sourCandy.setId(2);

            productRepository.save(sourCandy);

            Product everythingBundle = new Product();
            everythingBundle.setName("Little Bit of Everything Bundle");
            everythingBundle.setInv(15);
            everythingBundle.setPrice(20);
            everythingBundle.setId(3);

            productRepository.save(everythingBundle);

            Product chipBundle = new Product();
            chipBundle.setName("Wackadoo Chips Bundle");
            chipBundle.setInv(15);
            chipBundle.setPrice(25);
            chipBundle.setId(4);

            productRepository.save(chipBundle);

        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
