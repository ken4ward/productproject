package com.christdoes.microservices.productproject.model;

import com.datastax.oss.driver.api.core.type.DataType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

import static com.datastax.oss.driver.api.core.type.DataType.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(value = "product")
public class Product {

    private static final long serialVersionId = 1L;

    @PrimaryKeyColumn(name = "id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    @CassandraType(type = CassandraType.Name.TEXT)
    private String id = UUID.randomUUID().toString();

//    @PrimaryKeyColumn(name = "productId", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
//    @CassandraType(type = CassandraType.Name.BIGINT)
//    private long productId;

    @Column(value = "name")
    @CassandraType(type = CassandraType.Name.TEXT)
    private String name;

    @Column(value = "description")
    @CassandraType(type = CassandraType.Name.TEXT)
    private String description;

    @Column(value = "price")
    @CassandraType(type = CassandraType.Name.TEXT)
    private String price;

}
