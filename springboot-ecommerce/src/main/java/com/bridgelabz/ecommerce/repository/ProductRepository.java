package com.bridgelabz.ecommerce.repository;

import com.bridgelabz.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "products",path = "products")
public interface ProductRepository extends JpaRepository<Product,Long> {
}
