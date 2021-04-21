package com.christdoes.microservices.productproject.repository;

import com.christdoes.microservices.productproject.model.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface ProductRepository extends CassandraRepository<Product, String> {



}
