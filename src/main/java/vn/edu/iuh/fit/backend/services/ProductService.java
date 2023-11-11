package vn.edu.iuh.fit.backend.services;

import org.springframework.stereotype.Service;
import org.vaadin.crudui.crud.CrudListener;
import vn.edu.iuh.fit.backend.models.Product;
import vn.edu.iuh.fit.backend.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements CrudListener<Product> {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void save (Product product){
        productRepository.save(product);
    }

    public boolean delete(long id){
        try {
            productRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    @Override
    public Product add(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(Product product) {
        productRepository.delete(product);
    }

    public Optional<Product> findById(long id){
        return productRepository.findById(id);
    }
}
