package oldVersion;

import com.example.PracticeSpringDataJPA.entity.Product_OneToMany;
import com.example.PracticeSpringDataJPA.repository.Product_OneToMany_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Product_OneToMany_Controller {
    @Autowired
    private Product_OneToMany_Repository productRepository;
    @GetMapping("/products")
    public Iterable<Product_OneToMany> listAll(){
        return productRepository.findAll();
    }
    @PostMapping("/add")
    public void add(@RequestBody Product_OneToMany product){
        productRepository.save(product);
    }
}
