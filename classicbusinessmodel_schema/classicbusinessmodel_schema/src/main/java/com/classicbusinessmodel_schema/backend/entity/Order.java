import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    private Integer orderNumber;

    private Date orderDate;
    private Date requiredDate;
    private Date shippedDate;
    private String status;

    @ManyToOne
    @JoinColumn(name = "customerNumber")
    private Customer customer;
}