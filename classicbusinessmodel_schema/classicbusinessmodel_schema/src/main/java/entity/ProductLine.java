package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productlines")
public class ProductLine {

    @Id
    private String productLine;

    private String textDescription;

    @Column(columnDefinition = "TEXT")
    private String htmlDescription;

    private String image;
}
