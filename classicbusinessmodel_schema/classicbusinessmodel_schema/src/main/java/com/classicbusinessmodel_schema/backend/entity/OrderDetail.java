import jakarta.persistence.*;
import com.classicbusinessmodel_schema.backend.entity.*;


@Entity
@Table(name = "orderdetails")
public class OrderDetail {

    @EmbeddedId
    private OrderDetailId id;

    private Integer quantityOrdered;
    private Double priceEach;
    private Integer orderLineNumber;

    @ManyToOne
    @MapsId("orderNumber")
    @JoinColumn(name = "orderNumber")
    private Order order;

    @ManyToOne
    @MapsId("productCode")
    @JoinColumn(name = "productCode")
    private Product product;
}