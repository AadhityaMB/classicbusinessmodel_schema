package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "products")
public class Product {

    @Id
    private String productCode;

    private String productName;
    private String productLine;
    private String productScale;
    private String productVendor;
    private Integer quantityInStock;
    private Double buyPrice;
    private Double MSRP;
}